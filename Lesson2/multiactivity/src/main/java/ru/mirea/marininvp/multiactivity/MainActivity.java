package ru.mirea.marininvp.multiactivity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView newView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "MainActivity onCreate()");
        setContentView(R.layout.activity_main);
        newView = (TextView) findViewById(R.id.newText);
        newView.setText("MIREA - МАРИНИН ВЯЧЕСЛАВ ПЕТРОВИЧ");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "MainActivity onStart()");
    };
    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
        Log.i(TAG, "MainActivity onRestoreInstanceState()");
    };
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "MainActivity onRestart()");
    };
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity onResume()");
    };
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity onPause()");
    };
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        Log.i(TAG, "MainActivity onSaveInstanceState()");
    };
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "MainActivity onStop()");
    };
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity onDestroy()");
    };

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("key", newView.getText().toString());
        startActivity(intent);
    }
}