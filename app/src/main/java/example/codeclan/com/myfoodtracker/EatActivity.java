package example.codeclan.com.myfoodtracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

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

        day = (TextView) findViewById(R.id.day);
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

        Toast.makeText(EatActivity.this, "Added to Log!", Toast.LENGTH_LONG).show();

        Log.d(getClass().toString(), "onEatButtonClicked");
        Intent i = new Intent(EatActivity.this, NavigationActivity.class);
        i.putExtra("source", "eat");

        //TURNS THE TEXTVIEW chosenDate INTO A STRING AND INSERTS IT INTO foodlist SPM
        String userChosenDate = chosenDate.getText().toString();
        String[] longDate = userChosenDate.split(" ");
        String monthUserChose = longDate[0];
        String dayUserChoseComma = longDate[1];
        String dayUserChose = dayUserChoseComma.replaceAll(",", "");
        Log.d(" Date user chose: ", userChosenDate);


        //ENUM MEAL TYPE SPINNER
        Spinner mySpinner = (Spinner) findViewById(R.id.meal);
        String mealSelected = mySpinner.getSelectedItem().toString();
        MealType mealEntered = MealType.valueOf(mealSelected);

        //STRING FOOD USER ENTERED
        String foodUserEntered = food.getText().toString();
        Log.d(getClass().toString(), foodUserEntered);

        //CALORIES USER ENTERED
        String caloriesEntered = cal.getText().toString();
        int caloriesUserEntered = Integer.parseInt(caloriesEntered);
        Log.d("calories user entered: ", caloriesEntered);


        ArrayList<Food> foodlist = SharedPreferencesManager.getFoodList(this);
        foodlist.add(new Food(monthUserChose, dayUserChose, "70% CAKE 30% MAN", mealEntered, foodUserEntered, caloriesUserEntered));

        SharedPreferencesManager.setFoodList(this, foodlist);

        startActivity(i);






//        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
//        String favouriteMovies = sharedPref.getString("MyFavourites", new ArrayList<Movie>().toString());
//        Log.d("Favourites String", favouriteMovies);

      /*  FoodList foodList = new FoodList();
        ArrayList list = foodList.getList();
        list.add(new Food(1, "USER ENTERED JOURNAL", mealUserEntered, foodUserEntered));

        startActivity(intent);*/
    }

}
