package example.codeclan.com.myfoodtracker;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

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

    public Day getFoodOnDate(String date) {
        return mealPlan.get(date);
    }

    public HashMap<String, Day> getFoodPlan(){
        return mealPlan;
    }

    public void addDayToFoodPlan(String date, Day day){
        mealPlan.put(date, day);
    }

    public Day getFoodDate(String date) {
        return mealPlan.get(date);
    }

    }



