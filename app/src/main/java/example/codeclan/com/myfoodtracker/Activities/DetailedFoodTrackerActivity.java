package example.codeclan.com.myfoodtracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


import example.codeclan.com.myfoodtracker.Adapters.DetailedFoodAdapter;
import example.codeclan.com.myfoodtracker.Enums.MealType;
import example.codeclan.com.myfoodtracker.MyClasses.Day;
import example.codeclan.com.myfoodtracker.MyClasses.Food;
import example.codeclan.com.myfoodtracker.MyClasses.FoodPlan;
import example.codeclan.com.myfoodtracker.R;
import example.codeclan.com.myfoodtracker.SharedPreferencesManager;

public class DetailedFoodTrackerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_food_tracker);
        Intent intent = getIntent();
        String date = intent.getExtras().getString("day");


        ListView breakFast = (ListView) findViewById(R.id.breakfast_list);
        ListView lunch = (ListView) findViewById(R.id.lunch_list);
        ListView dinner = (ListView) findViewById(R.id.dinner_list);
        ListView snack = (ListView) findViewById(R.id.snack_list);

        Day day = SharedPreferencesManager.getFoodPlan(this).getFoodOnDate(date);

        HashMap<MealType, ArrayList<Food>> foodPlan = day.getFoodDay();

        ArrayList<Food> breakFastFood = foodPlan.get(MealType.BREAKFAST);
        ArrayList<Food> lunchFood = foodPlan.get(MealType.LUNCH);
        ArrayList<Food> dinnerFood = foodPlan.get(MealType.DINNER);
        ArrayList<Food> snackFood = foodPlan.get(MealType.SNACK);


        if(breakFastFood == null) {
            breakFastFood = new ArrayList<>();
        }

        if(lunchFood == null){
            lunchFood = new ArrayList<>();
        }

        if(dinnerFood == null){
            dinnerFood = new ArrayList<>();
        }

        if(snackFood == null){
            snackFood = new ArrayList<>();
        }




        DetailedFoodAdapter breakfastAdapt = new DetailedFoodAdapter(this, breakFastFood);
        DetailedFoodAdapter lunchAdapt = new DetailedFoodAdapter(this, lunchFood);
        DetailedFoodAdapter dinnerAdapt = new DetailedFoodAdapter(this, dinnerFood);
        DetailedFoodAdapter snackAdapt = new DetailedFoodAdapter(this, snackFood);

        breakFast.setAdapter(breakfastAdapt);
        lunch.setAdapter(lunchAdapt);
        dinner.setAdapter(dinnerAdapt);
        snack.setAdapter(snackAdapt);





//
//        FoodPlan plan = SharedPreferencesManager.getFoodPlan(this);
//
//        TextView textView = (TextView) findViewById(R.id.date);
//        textView.setText(date);

//
//        MealType[] meals = MealType.values();
//        DetailedFoodAdapter detailedFoodAdapter = new DetailedFoodAdapter(this, meals);
//


//        ListView listView = (ListView) findViewById(R.id.detailed_meal_tracker);
//        listView.setAdapter(detailedFoodAdapter);

//        ArrayList<String> dates = foodPlan.getDates();
//        FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, dates);
//
//        ListView listView = (ListView) findViewById(R.id.food_tracker);
//        listView.setAdapter(foodTrackerAdapter);

//        ArrayList<String> foods =


    }
}





