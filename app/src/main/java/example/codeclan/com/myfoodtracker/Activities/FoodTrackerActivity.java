package example.codeclan.com.myfoodtracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import example.codeclan.com.myfoodtracker.FoodTrackerAdapter;
import example.codeclan.com.myfoodtracker.MyClasses.FoodPlan;
import example.codeclan.com.myfoodtracker.R;
import example.codeclan.com.myfoodtracker.SharedPreferencesManager;

public class FoodTrackerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_tracker);
        Intent intent = getIntent();


//        ArrayList<Food> foodlist = SharedPreferencesManager.getFoodList(this);
//
//        FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, foodlist);
//
//        ListView listView = (ListView) findViewById(R.id.food_tracker);
//        listView.setAdapter(foodTrackerAdapter);


        FoodPlan foodPlan = new SharedPreferencesManager().getFoodPlan(this);

        ArrayList<String> dates = foodPlan.getDates();
        FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, dates);

        ListView listView = (ListView) findViewById(R.id.food_tracker);
        listView.setAdapter(foodTrackerAdapter);


    }

    public void getDetailedFood(View listItem){

//        Food food = (Food) listItem.getTag();
//        Intent intent = new Intent(this, DetailedFoodTrackerActivity.class);
//        intent.putExtra("day", food);

        FoodPlan foodPlan = (FoodPlan) listItem.getTag();
        Intent intent = new Intent(this, DetailedFoodTrackerActivity.class);
        intent.putExtra("day", foodPlan);

        startActivity(intent);

    }
}
