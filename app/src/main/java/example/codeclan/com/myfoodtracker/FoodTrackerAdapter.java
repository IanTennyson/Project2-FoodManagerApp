package example.codeclan.com.myfoodtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import example.codeclan.com.myfoodtracker.MyClasses.FoodPlan;

//The job of an adapter is primarily to make an object work in a situation where a different interface is expected.

/**
 * Created by user on 20/04/2017.
 */

public class FoodTrackerAdapter extends ArrayAdapter<String> {

    public FoodTrackerAdapter(Context context, ArrayList<String> foodPlan){
        super(context, 0, foodPlan);
    }


    @Override


    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.food_items, parent, false);
        }

        String currentDate = getItem(position);

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentDate);

//        TextView month = (TextView) listItemView.findViewById(R.id.date);
//        month.setText(currentFood.getDate());

//        TextView day = (TextView) listItemView.findViewById(R.id.day);
//        day.setText(currentFood.getDay());

//        TextView title = (TextView) listItemView.findViewById(R.id.journal);
//        title.setText(currentFood.getJournal());

        //WANT TO DISPLAY TOTAL CALORIES FROM THE DETAILED FOOD PAGE
//        TextView calories = (TextView) listItemView.findViewById(R.id.calories);
//        calories.setText(currentFood.getCalories());

        listItemView.setTag(currentDate);

        return listItemView;

    }
}