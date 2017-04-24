package example.codeclan.com.myfoodtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailedFoodTrackerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_food_tracker);
        Intent intent = getIntent();

//        ArrayList<Food> foodlist = SharedPreferencesManager.getFoodList(this);
//        FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, foodlist);

        TextView month = (TextView) findViewById(R.id.month);
        TextView day = (TextView) findViewById(R.id.day);






//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_food_tracker);
//            Intent intent = getIntent();
//
//
//            ArrayList<Food> foodlist = SharedPreferencesManager.getFoodList(this);
//
//            FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, foodlist);
//
//            ListView listView = (ListView) findViewById(R.id.food_tracker);
//            listView.setAdapter(foodTrackerAdapter);
//
//
//        }
//
//    public void getDetailedFood(View listItem){
//
//        Food food = (Food) listItem.getTag();
//        Log.d("Journal Entry: ", food.getJournal());
//        Intent intent = new Intent(this, DetailedFoodTrackerActivity.class);
//        intent.putExtra("day", food);
//
//        startActivity(intent);

    }
}



