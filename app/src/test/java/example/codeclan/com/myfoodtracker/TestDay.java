package example.codeclan.com.myfoodtracker;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class TestDay {

    @Test
    public void testAddMealHasLengthOne() {
        Day day = new Day();
        day.addFoodToDay(MealType.LUNCH, new Food("2", "", MealType.LUNCH, "eggs", 5));

        assertEquals(1, day.getFoodDay().get(MealType.LUNCH).size());
    }


    @Test
    public void testAddMealHasLengthThree() {
        Day day = new Day();
        day.addFoodToDay(MealType.LUNCH, new Food("2", "", MealType.LUNCH, "eggs", 5));
        day.addFoodToDay(MealType.LUNCH, new Food("2", "", MealType.LUNCH, "cake", 5));
        day.addFoodToDay(MealType.LUNCH, new Food("2", "", MealType.LUNCH, "sandwich", 5));

        assertEquals(3, day.getFoodDay().get(MealType.LUNCH).size());
    }
}
