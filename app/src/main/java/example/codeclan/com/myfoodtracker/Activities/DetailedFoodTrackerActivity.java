package example.codeclan.com.myfoodtracker.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
//        ArrayList<Food> foodlist = SharedPreferencesManager.getFoodList(this);
//        FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, foodlist);

        FoodPlan plan = SharedPreferencesManager.getFoodPlan(this);

        Day day = plan.getFoodOnDate(date);

        ArrayList<MealType> mealTypes = new ArrayList<>( day.getFoodDay().keySet() );



//        TextView month = (TextView) findViewById(R.id.month);
//        TextView day = (TextView) findViewById(R.id.day);







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



