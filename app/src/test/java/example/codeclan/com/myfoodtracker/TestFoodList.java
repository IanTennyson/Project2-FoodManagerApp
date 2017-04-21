package example.codeclan.com.myfoodtracker;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/04/2017.
 */

public class TestFoodList {



    @Test
    public void testSizeOfFoodList() {
        FoodList foodList = new FoodList();
        assertEquals(20, foodList.getList().size());
    }

    @Test
    public void testCanAddFoodToList(){
        FoodList foodList = new FoodList();
        ArrayList list = foodList.getList();

        list.add(new Food(1, "Good day today, not feeling hungry", "Lunch", "Salad"));
        assertEquals(21, list.size());
    }
}
