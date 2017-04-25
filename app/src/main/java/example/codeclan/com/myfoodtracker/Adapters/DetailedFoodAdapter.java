//package example.codeclan.com.myfoodtracker.Adapters;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//import example.codeclan.com.myfoodtracker.R;
//
///**
// * Created by user on 25/04/2017.
// */
//
//public class DetailedFoodAdapter extends ArrayAdapter{
//
//    public DetailedFoodAdapter(Context context, ArrayList<String> foodPlan){
//        super(context, 0, foodPlan);
//    }
//
//    @Override
//
//
//    public View getView(int position, View listItemView, ViewGroup parent){
//
//        if (listItemView == null){
//            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_detailed_meal_tracker, parent, false);
//        }
//
//        String currentFood = getItem(position);
//
//        TextView food = (TextView) listItemView.findViewById(R.id.food);
//        food.setText(currentFood);
//
////        TextView date = (TextView) listItemView.findViewById(R.id.date);
////        date.setText(currentDate);
//
//
//        listItemView.setTag(currentFood);
//
//        return listItemView;
//
//    }
//}
