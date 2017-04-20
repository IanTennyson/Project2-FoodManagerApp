package example.codeclan.com.myfoodtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LauncherActivity extends AppCompatActivity {

    private EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        userName = (EditText) findViewById(R.id.user_name);


    }

    public void onEnterButtonClicked(View view){
        Log.d(getClass().toString(), "onEnterButtonClicked");

        String nameUserEntered = userName.getText().toString();
        Log.d(getClass().toString(), nameUserEntered);


        Intent intent = new Intent(this, NavigationActivity.class);
        intent.putExtra("nameUserEntered", nameUserEntered);
        startActivity(intent);
    }
}
