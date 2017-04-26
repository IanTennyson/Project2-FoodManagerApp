package example.codeclan.com.myfoodtracker.MyClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import example.codeclan.com.myfoodtracker.Enums.MealType;
import example.codeclan.com.myfoodtracker.MyClasses.Food;

import static example.codeclan.com.myfoodtracker.R.id.calories;
import static example.codeclan.com.myfoodtracker.R.id.food;

/**
 * Created by user on 24/04/2017.
 */

public class Day implements Serializable{

    private HashMap<MealType, ArrayList<Food>> foodDay;

    public Day() {
        foodDay = new HashMap<>();
    }

    public void addFoodToDay(MealType mealType ,Food newFoodObject) {
        if(foodDay.containsKey(mealType)) {
            ArrayList<Food> extraServing = foodDay.get(mealType);
            extraServing.add(newFoodObject);
            foodDay.put(mealType, extraServing);
        }else {
            ArrayList<Food> firstServing = new ArrayList<>();
            firstServing.add(newFoodObject);
            foodDay.put(mealType, firstServing);
        }
    }

    public HashMap<MealType, ArrayList<Food>> getFoodDay() {
        return foodDay;
    }
















//
//    public int totalCal(){
//        int sum = 0;
//        for (int i = 0; i < food.getCalories(); i++){
//        }
//        return sum;
//    }
}


