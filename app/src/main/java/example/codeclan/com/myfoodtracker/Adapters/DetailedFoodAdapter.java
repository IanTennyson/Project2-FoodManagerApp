package example.codeclan.com.myfoodtracker.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import example.codeclan.com.myfoodtracker.Enums.MealType;
import example.codeclan.com.myfoodtracker.MyClasses.Food;
import example.codeclan.com.myfoodtracker.R;

/**
 * Created by user on 25/04/2017.
 */

public class DetailedFoodAdapter extends ArrayAdapter{

    public DetailedFoodAdapter(Context context, MealType[] mealTypes){
        super(context, 0, mealTypes);
    }

//    public DetailedFoodAdapter(Context context, ArrayList<Food> food){
//        super(context, 0, food);
//    }



    @Override


    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_detailed_meal_tracker, parent, false);
        }

        String meal = getItem(position).toString();

        TextView mealImage = (TextView) listItemView.findViewById(R.id.meal_image);
        mealImage.setText(meal);

//        TextView foodInfo = (TextView) listItemView.findViewById(R.id.food);
//        foodInfo.setText();

//        TextView date = (TextView) listItemView.findViewById(R.id.date);
//        date.setText(currentDate);


        listItemView.setTag(meal);

        return listItemView;

    }
}
