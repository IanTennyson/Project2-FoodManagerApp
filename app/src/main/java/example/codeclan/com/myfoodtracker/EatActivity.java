package example.codeclan.com.myfoodtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class EatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);
        Intent intent = getIntent();
    }

    public void onEatButtonClicked(View view){
        Log.d(getClass().toString(), "onEatButtonClicked");
        Intent intent = new Intent(this, NavigationActivity.class);
        startActivity(intent);
    }
}
