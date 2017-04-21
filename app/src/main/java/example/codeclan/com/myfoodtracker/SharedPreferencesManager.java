package example.codeclan.com.myfoodtracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * Created by user on 21/04/2017.
 */

public class SharedPreferencesManager {

    public static void setFoodList(Context context, ArrayList<Food> foodlist) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        // SharedPreferences.edit() gets an instance SP.Editor this is the class you use to store values in SP
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Gson gson = new Gson();
        editor.putString("FoodList", gson.toJson(foodlist));
        editor.apply();
    }

    public static ArrayList<Food> getFoodList(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String jsonString = sharedPreferences.getString("FoodList", new ArrayList<Food>().toString());

        Gson gson = new Gson();
        TypeToken<ArrayList<Food>> foodArrayList = new TypeToken<ArrayList<Food>>(){
        };

        ArrayList<Food> foodlist  = gson.fromJson(jsonString, foodArrayList.getType());
        return foodlist;
    }
}
