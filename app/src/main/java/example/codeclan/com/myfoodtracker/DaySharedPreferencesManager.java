package example.codeclan.com.myfoodtracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * Created by user on 24/04/2017.
 */

public class DaySharedPreferencesManager {

    public static void setDayList(Context context, ArrayList<Day> dayList) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        // SharedPreferences.edit() gets an instance SP.Editor this is the class you use to store values in SP
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Gson gson = new Gson();
        editor.putString("DayList", gson.toJson(dayList));
        editor.apply();
    }

    public static ArrayList<Day> getDayList(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String jsonString = sharedPreferences.getString("DayList", new ArrayList<Day>().toString());

        Gson gson = new Gson();
        TypeToken<ArrayList<Day>> dayArrayList = new TypeToken<ArrayList<Day>>(){
        };

        ArrayList<Day> dayList  = gson.fromJson(jsonString, dayArrayList.getType());
        return dayList;
    }


}