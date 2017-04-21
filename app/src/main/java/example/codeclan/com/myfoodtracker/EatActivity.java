package example.codeclan.com.myfoodtracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class EatActivity extends AppCompatActivity {

    private EditText day;
    private EditText meal;
    private EditText food;
    private EditText cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);
        Intent intent = getIntent();

        day = (EditText) findViewById(R.id.day);
        meal = (EditText) findViewById(R.id.meal);
        food = (EditText) findViewById(R.id.food);
        cal = (EditText) findViewById(R.id.calories);
    }

    public void onEatButtonClicked(View view){
        Log.d(getClass().toString(), "onEatButtonClicked");
        Intent intent = new Intent(this, NavigationActivity.class);

        String dayUserEntered = day.getText().toString();
        int dayEntered = Integer.parseInt(dayUserEntered);
        Log.d(getClass().toString(), dayUserEntered);


        String mealUserEntered = meal.getText().toString();
        Log.d(getClass().toString(), mealUserEntered);

        String foodUserEntered = food.getText().toString();
        Log.d(getClass().toString(), foodUserEntered);




        ArrayList<Food> foodlist = SharedPreferencesManager.getFoodList(this);
        foodlist.add(new Food(dayEntered, "USER ENTERED JOURNAL", mealUserEntered, foodUserEntered));

        SharedPreferencesManager.setFoodList(this, foodlist);
//        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
//        String favouriteMovies = sharedPref.getString("MyFavourites", new ArrayList<Movie>().toString());
//        Log.d("Favourites String", favouriteMovies);

      /*  FoodList foodList = new FoodList();
        ArrayList list = foodList.getList();
        list.add(new Food(1, "USER ENTERED JOURNAL", mealUserEntered, foodUserEntered));

        startActivity(intent);*/
    }

}
