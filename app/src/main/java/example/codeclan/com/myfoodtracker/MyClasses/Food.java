package example.codeclan.com.myfoodtracker.MyClasses;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 20/04/2017.
 */

public class Food implements Serializable {
//    private String date;
////  private String day;
//    private String journal;
//    private MealType meal;
    private String food;
    private int calories;

    public Food (String food, int calories){
//        this.date = date;
////        this.day = day;
//        this.journal = journal;
//        this.meal = meal;
        this.food = food;
        this.calories = calories;
    }


    public String getFood(){
        return this.food;
    }

    public int getCalories(){
        return this.calories;
    }

//    public String getDate(){
//        return this.date;
//    }

//    public String getDay(){
//        return this.day;
//    }

//    public String getJournal(){
//        return this.journal;
//    }
//
//    public MealType getMeal(){
//        return this.meal;
//    }



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

