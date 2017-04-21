package example.codeclan.com.myfoodtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.content.Context;

import java.util.ArrayList;

public class FoodTrackerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_tracker);
        Intent intent = getIntent();


        ArrayList<Food> foodlist = SharedPreferencesManager.getFoodList(this);


//        FoodList foodList = new FoodList();
//        ArrayList<Food> list = foodList.getList();

        FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, foodlist);

        ListView listView = (ListView) findViewById(R.id.food_tracker);
        listView.setAdapter(foodTrackerAdapter);


    }

    public void getFood(View listItem){
        Food food = (Food) listItem.getTag();
        Log.d("Journal Entry: ", food.getJournal());
        Intent intent = new Intent(this, DetailedFoodTrackerActivity.class);
        startActivity(intent);

    }
}
