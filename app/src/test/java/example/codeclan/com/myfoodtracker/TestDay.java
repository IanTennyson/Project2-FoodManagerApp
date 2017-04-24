package example.codeclan.com.myfoodtracker;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class TestDay {

    @Test
    public void testAddMealHasLengthOne() {
        Day day = new Day();
        day.addFoodToDay(MealType.LUNCH, new Food("eggs", 5));

        assertEquals(1, day.getFoodDay().get(MealType.LUNCH).size());
    }


    @Test
    public void testAddMealHasLengthThree() {
        Day day = new Day();
        day.addFoodToDay(MealType.LUNCH, new Food("eggs", 5));
        day.addFoodToDay(MealType.LUNCH, new Food("cake", 5));
        day.addFoodToDay(MealType.LUNCH, new Food("sandwich", 5));


        day.addFoodToDay(MealType.DINNER, new Food("sandwich", 500));

        assertEquals(3, day.getFoodDay().get(MealType.LUNCH).size());
        assertEquals(1, day.getFoodDay().get(MealType.DINNER).size());
    }

    @Test
    public void testNullDay(){
        Day day = new Day();

        assertNull(day.getFoodDay().get(MealType.SNACK));
    }
}
