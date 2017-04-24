package example.codeclan.com.myfoodtracker;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by user on 24/04/2017.
 */

public class Day implements Serializable{

    private HashMap<MealType, ArrayList<Food>> foodDay;

    public Day() {
        foodDay = new HashMap<>();
    }

    public void addFoodToDay(MealType mealType ,Food item) {
        if(foodDay.containsKey(mealType)) {
            ArrayList<Food> tmpFood = foodDay.get(mealType);
            tmpFood.add(item);
            foodDay.put(mealType, tmpFood);
        }else {
            ArrayList<Food> tmpFood = new ArrayList<>();
            tmpFood.add(item);
            foodDay.put(mealType, tmpFood);
        }
    }

    public HashMap<MealType, ArrayList<Food>> getFoodDay() {
        return foodDay;
    }
}
