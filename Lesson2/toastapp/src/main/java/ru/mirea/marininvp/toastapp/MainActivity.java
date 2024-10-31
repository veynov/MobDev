package ru.mirea.marininvp.toastapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.text.TextWatcher;
import java.nio.charset.StandardCharsets;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText editNewText;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNewText = (EditText) findViewById(R.id.editText2);

        editNewText.setText("Привет MIREA!");

        str = String.format("СТУДЕНТ № 10 ГРУППА БИСО-01-19 Количество символов - %d",
                editNewText.getText().toString().length());
    }

    public void onBtnCountClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                str,
                Toast.LENGTH_LONG);
        toast.show();
    }
}