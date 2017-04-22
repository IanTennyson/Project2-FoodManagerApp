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
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class EatActivity extends FragmentActivity {

    private EditText day;
    private EditText meal;
    private EditText food;
    private EditText cal;
    private Spinner spinner;

    public void setDate(View view){
        DatePickerDialog datePickerDialog = new DatePickerDialog();
        datePickerDialog.show(getSupportFragmentManager(), "date_picker");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);
        Intent intent = getIntent();

        day = (EditText) findViewById(R.id.day);
        Spinner mySpinner = (Spinner) findViewById(R.id.meal);
        food = (EditText) findViewById(R.id.food);
        cal = (EditText) findViewById(R.id.calories);

        mySpinner.setAdapter(new ArrayAdapter<MealType>(this, android.R.layout.simple_spinner_item, MealType.values()));
        String text = mySpinner.getSelectedItem().toString();
    }

    public void onEatButtonClicked(View view){

        Toast.makeText(EatActivity.this, "Added to Log!", Toast.LENGTH_LONG).show();

        Log.d(getClass().toString(), "onEatButtonClicked");
        Intent i = new Intent(EatActivity.this, NavigationActivity.class);
        i.putExtra("source", "eat");

        String dayUserEntered = day.getText().toString();
        int dayEntered = Integer.parseInt(dayUserEntered);
        Log.d(getClass().toString(), dayUserEntered);

        Spinner mySpinner=(Spinner) findViewById(R.id.meal);
        String mealSelected = mySpinner.getSelectedItem().toString();

        MealType mealEntered = MealType.valueOf(mealSelected);

        String foodUserEntered = food.getText().toString();
        Log.d(getClass().toString(), foodUserEntered);


        ArrayList<Food> foodlist = SharedPreferencesManager.getFoodList(this);
        foodlist.add(new Food(dayEntered, "USER ENTERED JOURNAL", mealEntered, foodUserEntered));

        SharedPreferencesManager.setFoodList(this, foodlist);


//        Intent i = new Intent(FirstActivity.this, NextActivtiy.class);
//        i.putExtra("source", "first");  // source is the string to check where it is coming from
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
