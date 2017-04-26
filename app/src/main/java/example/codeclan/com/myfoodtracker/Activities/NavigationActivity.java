package example.codeclan.com.myfoodtracker.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import example.codeclan.com.myfoodtracker.R;

public class NavigationActivity extends AppCompatActivity {

    private TextView userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        userName = (TextView) findViewById(R.id.display_user_name);


        Intent intent = getIntent();
        String from = intent.getStringExtra("source");
        if ("eat".equals(from)){
            intent = getIntent();
        }
        else {
            Bundle extra = intent.getExtras();
            String username = extra.getString("nameUserEntered");
            userName.setText("Welcome " + username);
        }


    }







    public void onDayPlannerButtonClicked(View view){
        Log.d(getClass().toString(), "onDayPlannerButtonClicked");
        Intent intent = new Intent(this, FoodTrackerActivity.class);
        startActivity(intent);
    }

    public void onEatButtonClicked(View view){
        Log.d(getClass().toString(), "onEatButtonClicked");
        Intent intent = new Intent(this, EatActivity.class);
        startActivity(intent);
    }

    public void getIntent(View view){
        Intent intent = getIntent();
    }


}
