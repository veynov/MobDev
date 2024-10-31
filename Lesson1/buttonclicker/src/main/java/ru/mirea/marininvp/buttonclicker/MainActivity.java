package ru.mirea.marininvp.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView textViewStudent = (TextView) findViewById(R.id.tvOut);
        Button btnWhoAmI = (Button) findViewById(R.id.btnWhoAmI);
        Button btnItIsNotMe = (Button) findViewById(R.id.btnItIsNotMe);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textViewStudent.setText("Мой номер по списку №12");
            }
        };

        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void onMyButtonClick(View view){
        Toast.makeText(getApplicationContext(),"Ещё один способ", Toast.LENGTH_SHORT).show();
    }

}