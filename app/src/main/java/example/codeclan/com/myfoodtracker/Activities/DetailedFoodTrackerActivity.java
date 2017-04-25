package example.codeclan.com.myfoodtracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


import example.codeclan.com.myfoodtracker.Enums.MealType;
import example.codeclan.com.myfoodtracker.MyClasses.Day;
import example.codeclan.com.myfoodtracker.MyClasses.FoodPlan;
import example.codeclan.com.myfoodtracker.R;
import example.codeclan.com.myfoodtracker.SharedPreferencesManager;

public class DetailedFoodTrackerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_food_tracker);
        Intent intent = getIntent();
        String date = intent.getExtras().getString("day");

        //STOP THE KEYBOARD FROM POPPING UP WHEN THE PAGE LOADS
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


        FoodPlan plan = SharedPreferencesManager.getFoodPlan(this);

        TextView textView = (TextView) findViewById(R.id.date);
        textView.setText(date);

    }
}



