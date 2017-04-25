package example.codeclan.com.myfoodtracker.MyClasses;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import example.codeclan.com.myfoodtracker.Enums.MealType;

/**
 * Created by user on 20/04/2017.
 */

public class Food implements Serializable {
    private String food;
    private Integer calories;

    public Food (String food, Integer calories){
        this.food = food;
        this.calories = calories;
    }

    public String getFood(){
        return this.food;
    }

    public Integer getCalories(){
        return this.calories;
    }


//    public ArrayList<Integer> getMyCalories(){
//        return new ArrayList<Integer>(MealType.valueOf(Food.getCalories()));
//    }
//
//    public ArrayList<String> getMyFoods(){
//        return new ArrayList<String>(MealType.valueOf(MealType.values().getFood()));
//    }

//    public ArrayList<String> getDates() {
//        return new ArrayList<String>( mealPlan.keySet()) ;
////    }



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

