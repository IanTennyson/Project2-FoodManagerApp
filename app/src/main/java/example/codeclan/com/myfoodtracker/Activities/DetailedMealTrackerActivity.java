//package example.codeclan.com.myfoodtracker.Activities;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//import example.codeclan.com.myfoodtracker.Adapters.DetailedFoodAdapter;
//import example.codeclan.com.myfoodtracker.MyClasses.Food;
//import example.codeclan.com.myfoodtracker.MyClasses.FoodPlan;
//import example.codeclan.com.myfoodtracker.R;
//import example.codeclan.com.myfoodtracker.SharedPreferencesManager;
//
//public class DetailedMealTrackerActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_detailed_meal_tracker);
//
//        FoodPlan plan = SharedPreferencesManager.getFoodPlan(this);
////        String food = plan.
//
//        DetailedFoodAdapter detailedFoodAdapter = new DetailedFoodAdapter(this,);
//
//        ListView listView = (ListView) findViewById(R.id.detailed_meal_tracker);
//        listView.setAdapter(detailedFoodAdapter);
//
//
//        //        FoodPlan foodPlan = new SharedPreferencesManager().getFoodPlan(this);
////
////        ArrayList<String> dates = foodPlan.getDates();
////        FoodTrackerAdapter foodTrackerAdapter = new FoodTrackerAdapter(this, dates);
////
////        ListView listView = (ListView) findViewById(R.id.food_tracker);
////        listView.setAdapter(foodTrackerAdapter);
//    }
//}
