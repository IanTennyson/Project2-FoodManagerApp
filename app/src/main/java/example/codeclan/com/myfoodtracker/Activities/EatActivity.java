package example.codeclan.com.myfoodtracker.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

import example.codeclan.com.myfoodtracker.Calendar.DatePickerDialog;
import example.codeclan.com.myfoodtracker.Enums.MealType;
import example.codeclan.com.myfoodtracker.MyClasses.Day;
import example.codeclan.com.myfoodtracker.MyClasses.Food;
import example.codeclan.com.myfoodtracker.MyClasses.FoodPlan;
import example.codeclan.com.myfoodtracker.R;
import example.codeclan.com.myfoodtracker.SharedPreferencesManager;

public class EatActivity extends FragmentActivity {

    DateFormat formatDateTime = DateFormat.getDateInstance();
    Calendar date = Calendar.getInstance();
    private TextView day;
    private EditText food;
    private EditText cal;
    private Button dateButton;
    private TextView chosenDate;

    public void setDate(View view){
        DatePickerDialog datePickerDialog = new DatePickerDialog();
        datePickerDialog.show(getSupportFragmentManager(), "date_picker");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);
        Intent intent = getIntent();

        //STOP THE KEYBOARD FROM POPPING UP WHEN THE PAGE LOADS
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        day = (TextView) findViewById(R.id.date);
        Spinner mySpinner = (Spinner) findViewById(R.id.meal);
        food = (EditText) findViewById(R.id.food);
        cal = (EditText) findViewById(R.id.calories_entered);
        dateButton = (Button) findViewById(R.id.date_button);
        chosenDate = (TextView) findViewById(R.id.chosen_date);


        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDate();

            }
        });

        mySpinner.setAdapter(new ArrayAdapter<MealType>(this, android.R.layout.simple_spinner_item, MealType.values()));
        String text = mySpinner.getSelectedItem().toString();

        //METHOD THAT GIVE THE CURRENT DATE
        updateDateTextView();
    }


    private void updateDate(){
        new android.app.DatePickerDialog(this, d, date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH)).show();
    }


    android.app.DatePickerDialog.OnDateSetListener d = new android.app.DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            date.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            date.set(Calendar.MONTH, month);
            date.set(Calendar.YEAR, year);
            updateDateTextView();
        }
    };

    //RETURNS APR 23 2017
    public void updateDateTextView(){
        chosenDate.setText(formatDateTime.format(date.getTime()));
    }

    public void onEatButtonClicked(View view){

        Log.d(getClass().toString(), "onEatButtonClicked");
        Intent i = new Intent(EatActivity.this, NavigationActivity.class);
        i.putExtra("source", "eat");



//      FOODPLAN CLASS INFORMATION!

        String userChosenDate = chosenDate.getText().toString();
        Log.d(" Date user chose: ", userChosenDate);

//      DAY CLASS INFORMATION!

        //ENUM MEAL TYPE SPINNER
        Spinner mySpinner = (Spinner) findViewById(R.id.meal);
        String mealSelected = mySpinner.getSelectedItem().toString();
        MealType mealEntered = MealType.valueOf(mealSelected);
        Log.d("MealType User Chose: ", mealSelected);

//      FOOD CLASS INFORMATION!

        String foodUserEntered = food.getText().toString();
        Log.d(getClass().toString(), foodUserEntered);

        if(foodUserEntered.equals("")){
            food.setError("Please enter a food");
            return;
        }

        //INT CALORIES USER ENTERED
        String caloriesEntered = cal.getText().toString();
        if(caloriesEntered.equals("")){
            cal.setError("Please enter the number of calories");
            return;
        }
        int caloriesUserEntered = Integer.parseInt(caloriesEntered);
        Log.d("calories user entered: ", caloriesEntered);




        //SHARED PREFERENCE MANAGER
        //ArrayList<FoodPlan> foodList = SharedPreferencesManager.getFoodPlan(this);

        FoodPlan foodPlan = SharedPreferencesManager.getFoodPlan(this);

        Day day;

        day = foodPlan.getFoodOnDate(userChosenDate);

        if(day == null) {
           day = new Day();
        }

        day.addFoodToDay(mealEntered, new Food(foodUserEntered, caloriesUserEntered));
        foodPlan.addMealDay(userChosenDate, day);
        SharedPreferencesManager.setFoodPlan(this, foodPlan);


        FoodPlan existingFoodPlan = SharedPreferencesManager.getFoodPlan(this);
        Day existingDay = existingFoodPlan.getFoodOnDate(userChosenDate);

        if(existingDay == null) {
            existingDay = new Day();
        }

        existingDay.addFoodToDay(mealEntered, new Food(foodUserEntered, caloriesUserEntered));

        SharedPreferencesManager.setFoodPlan(this, foodPlan);

//             foodList.add(new FoodPlan(userChosenDate, mealEntered, foodUserEntered, caloriesUserEntered));

        Toast.makeText(EatActivity.this, "Added to Log!", Toast.LENGTH_LONG).show();
//        END
        startActivity(i);

    }

}
