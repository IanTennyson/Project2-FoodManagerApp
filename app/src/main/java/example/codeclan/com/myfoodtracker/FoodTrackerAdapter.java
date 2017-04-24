package example.codeclan.com.myfoodtracker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 20/04/2017.
 */

public class FoodTrackerAdapter extends ArrayAdapter<FoodPlan> {

    public FoodTrackerAdapter(Context context, ArrayList<FoodPlan> foodPlan){
        super(context, 0, foodPlan);
    }


    @Override


    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.food_items, parent, false);
        }

        FoodPlan currentFood = getItem(position);

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentFood.getFoodDate().toString());

//        TextView month = (TextView) listItemView.findViewById(R.id.date);
//        month.setText(currentFood.getDate());

//        TextView day = (TextView) listItemView.findViewById(R.id.day);
//        day.setText(currentFood.getDay());

//        TextView title = (TextView) listItemView.findViewById(R.id.journal);
//        title.setText(currentFood.getJournal());

        //WANT TO DISPLAY TOTAL CALORIES FROM THE DETAILED FOOD PAGE
//        TextView calories = (TextView) listItemView.findViewById(R.id.calories);
//        calories.setText(currentFood.getCalories());

        listItemView.setTag(currentFood);

        return listItemView;

    }
}