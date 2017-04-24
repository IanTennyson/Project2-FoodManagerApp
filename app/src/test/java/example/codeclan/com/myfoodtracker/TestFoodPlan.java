package example.codeclan.com.myfoodtracker;

import com.google.gson.Gson;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class TestFoodPlan {

    FoodPlan foodPlan;
    Day day1;
    Food food1;

    @Before
    public void before() {
        food1 = new Food("Eggs", 50 );
        day1 = new Day();
        foodPlan = new FoodPlan();
        day1.addFoodToDay(MealType.LUNCH, food1);
        food1 = new Food("Toast", 50 );
        day1.addFoodToDay(MealType.LUNCH, food1);
        foodPlan.addMealDay("Apr 24, 2017", day1);
    }

    @Test
    public void testJson() {
        Gson gson = new Gson();
        String foodPlanAsString = gson.toJson(foodPlan);
        assertNotNull(foodPlanAsString);
        FoodPlan notJsonFoodPlan = gson.fromJson(foodPlanAsString, FoodPlan.class);
        assertNotNull(foodPlan);
        assertEquals(2, notJsonFoodPlan.getFoodOnDate("Apr 24, 2017").getFoodDay().get(MealType.LUNCH).size());

    }

    @Test
    public void testGetFoodDate(){
        assertEquals("Apr 24, 2017", foodPlan.getFoodDate());
    }

}
