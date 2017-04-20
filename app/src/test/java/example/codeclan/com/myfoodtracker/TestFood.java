package example.codeclan.com.myfoodtracker;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 20/04/2017.
 */

public class TestFood {

    Food food;

    @Before
    public void before(){
//        Should the Breakfast, Lunch, Dinner and Snacks be Enums?
        food = new Food(1, "Good day today, not feeling hungry", "Lunch", "Salad");
    }

    @Test
    public void testCanGetDay() {
    assertEquals((Integer) 1, food.getDay());
    }

    @Test
    public void testCanGetJournal() {
        assertEquals("Good day today, not feeling hungry", food.getJournal());
    }

    @Test
    public void testCanGetMeal() {
        assertEquals("Lunch", food.getMeal());
    }

    @Test
    public void testCanGetFood() {
        assertEquals("Salad", food.getFood());
    }

















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
