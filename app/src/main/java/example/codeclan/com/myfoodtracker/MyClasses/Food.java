package example.codeclan.com.myfoodtracker.MyClasses;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import example.codeclan.com.myfoodtracker.Enums.MealType;

import static example.codeclan.com.myfoodtracker.R.id.food;

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

}