package example.codeclan.com.myfoodtracker;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 20/04/2017.
 */

public class Food implements Serializable {
    private int day;
    private String journal;
    private MealType meal;
    private String food;
//  private int calories;

    public Food (int day, String journal, MealType meal, String food){
        this.day = day;
        this.journal = journal;
        this.meal = meal;
        this.food = food;
//      this.calories = calories;
    }

    public Integer getDay(){
        return this.day;
    }

    public String getJournal(){
        return this.journal;
    }

    public MealType getMeal(){
        return this.meal;
    }

    public String getFood(){
        return this.food;
    }

}
























//    private Date date;


//    public Food(Date date) {
//        this.date = date;
//    }


//    public String getSimpleDateFormat() {
//        SimpleDateFormat simpleDateFormat
//                = new SimpleDateFormat("yyyy/MM/dd");
//        return simpleDateFormat.format(date);
//    }

