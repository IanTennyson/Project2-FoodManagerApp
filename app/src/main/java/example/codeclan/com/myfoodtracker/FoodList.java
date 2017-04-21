package example.codeclan.com.myfoodtracker;

/**
 * Created by user on 20/04/2017.
 */

import java.io.Serializable;
import java.util.ArrayList;


public class FoodList {

    private ArrayList<Food> list;

    public FoodList() {
        list = new ArrayList<Food>();
        list.add(new Food(1, "Good day today!", "STRING", "STRING"));
        list.add(new Food(2, "Okay day today.", "STRING", "STRING"));
        list.add(new Food(3, "Bad day today", "STRING", "STRING"));
        list.add(new Food(4, "Sick of this crap", "STRING", "STRING"));
        list.add(new Food(5, "Not feelin' hungry!", "STRING", "STRING"));
        list.add(new Food(6, "Hunger Grump", "STRING", "STRING"));
        list.add(new Food(7, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(1, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(2, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(3, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(4, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(5, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(6, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(7, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(1, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(2, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(3, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(4, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(5, "Journal entry.", "STRING", "STRING"));
        list.add(new Food(6, "Journal entry.", "STRING", "STRING"));
    }
    //    CLONE OF ARRAY LIST!
    public ArrayList<Food> getList() {
        return new ArrayList<Food>(list);
    }

}
