package example.codeclan.com.myfoodtracker;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.myfoodtracker.Enums.MealType;
import example.codeclan.com.myfoodtracker.MyClasses.Day;
import example.codeclan.com.myfoodtracker.MyClasses.Food;
import example.codeclan.com.myfoodtracker.MyClasses.FoodPlan;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 20/04/2017.
 */

public class TestFood {


    FoodPlan foodPlan;
    Day day1;
    Food food1;
    Food food2;


    @Before
    public void before(){
            food1 = new Food("Eggs", 50 );
            day1 = new Day();
            foodPlan = new FoodPlan();
            day1.addFoodToDay(MealType.LUNCH, food1);
            food2 = new Food("Toast", 100 );
            day1.addFoodToDay(MealType.LUNCH, food2);
            foodPlan.addMealDay("Apr 24, 2017", day1);
        }



    @Test
    public void testCanGetFood() {
        assertEquals("Toast", food2.getFood());
    }



    @Test
    public void testCanReturnAllFoods(){

    }

    @Test
    public void testGetCalories(){
        assertEquals("50", food1.getCalories().toString());
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
