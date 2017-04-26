package example.codeclan.com.myfoodtracker.MyClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import example.codeclan.com.myfoodtracker.Enums.MealType;
import example.codeclan.com.myfoodtracker.MyClasses.Day;

import static example.codeclan.com.myfoodtracker.R.id.food;

/**
 * Created by user on 24/04/2017.
 */

public class FoodPlan implements Serializable {
    private HashMap<String, Day> mealPlan;

    public FoodPlan() {
        mealPlan = new HashMap<>();
    }

    public void addMealDay(String date, Day day) {
        mealPlan.put(date, day);
    }

    public ArrayList<String> getDates() {
        return new ArrayList<String>( mealPlan.keySet()) ;
    }

    public Day getFoodOnDate(String date) {
        return mealPlan.get(date);
    }

    public void addDayToFoodPlan(String date, Day day){
        mealPlan.put(date, day);
    }

    public String getDate(){
        return mealPlan.entrySet().toString();
    }













//
//    public int totalCal(){
//        int sum = 0;
//        for (int i = 0; i < food.getCalories(); i++){
//        }
//        return sum;
//    }

    }



