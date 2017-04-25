package example.codeclan.com.myfoodtracker;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.myfoodtracker.Enums.MealType;
import example.codeclan.com.myfoodtracker.MyClasses.Day;
import example.codeclan.com.myfoodtracker.MyClasses.Food;
import example.codeclan.com.myfoodtracker.MyClasses.FoodPlan;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 20/04/2017.
 */

public class TestFood {


    FoodPlan foodPlan;
    Day day1;
    Food food;


    @Before
    public void before(){
            food = new Food("Eggs", 50 );
            day1 = new Day();
            foodPlan = new FoodPlan();
            day1.addFoodToDay(MealType.LUNCH, food);
            food = new Food("Toast", 50 );
            day1.addFoodToDay(MealType.LUNCH, food);
            foodPlan.addMealDay("Apr 24, 2017", day1);
        }



    @Test
    public void testCanGetFood() {
        assertEquals("Toast", food.getFood());
    }



    @Test
    public void testCanReturnAllFoods(){

    }

//    @Test
//    public void testCanGetDay() {
//    assertEquals("day", food.getDate());
//    }
//
//    @Test
//    public void testCanGetJournal() {
//        assertEquals("journal", food.getJournal());
//    }
//
//    @Test
//    public void testCanGetMeal() {
//        assertEquals(MealType.LUNCH, food.getMeal());
//    }


















//    @Before
//    public void before(){
//         food = new Food(new Date(117,3,20));
//
//    }
//
//
//    @Test
//    public void testGetDate(){
//        assertEquals("2017/04/20", food.getSimpleDateFormat());
//    }



}
