package ru.mirea.marininvp.favoritebook;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {
    EditText edittView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "SecondActivity onCreate()");
        setContentView(R.layout.activity_second);

        edittView = findViewById(R.id.editText2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textView);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("Название любимой книги: %s", university));
        }

    }
    public void onBtnSendClick(View view) {
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, edittView.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "SecondActivity onStart()");
    };
    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
        Log.i(TAG, "SecondActivity onRestoreInstanceState()");
    };
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "SecondActivity onRestart()");
    };
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "SecondActivity onResume()");
    };
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "SecondActivity onPause()");
    };
    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        Log.i(TAG, "SecondActivity onSaveInstanceState()");
    };
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "SecondActivity onStop()");
    };
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "SecondActivity onDestroy()");
    };

}