package ru.mirea.marininvp.data_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    TextView tvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInfo = findViewById(R.id.tvInfo);
        final Runnable runn1 = new Runnable() {
            public void run() {
                tvInfo.setText("runn1");
            }
        };
        final Runnable runn2 = new Runnable() {
            public void run() {
                tvInfo.setText("runn2");
            }
        };
        final Runnable runn3 = new Runnable() {
            public void run() {
                tvInfo.setText("runn3");
            }
        };
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(2);
                    runOnUiThread(runn1);
                    TimeUnit.SECONDS.sleep(1);
                    tvInfo.postDelayed(runn3, 2000);
                    tvInfo.post(runn2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();}}
/*1)Изучите методы «runOnUiThread», «postDelayed», «post».
    Ответ:
    Запуск осуществляется благодаря исполнению методов:
    1) runOnUiThread - runn1 - функция, выполняющая переданный код на основном потоке UI, принимает объект Runnable в качестве параметра.
    2) post - runn2 - функция, добавляющая переданный код в очередь сообщений основного потока UI для выполнения при следующей возможности, принимает объект Runnable в качестве параметра.
    3) postDelayed - runn3 - функция, выполняющая переданный код с задержкой на основном потоке UI, принимает объект Runnable и задержку в миллисекундах в качестве параметров.

    2)В «TextView» описать в чём различия между элементами и последовательность. запуска.
    1. android:maxLines="10" - переменная, которая устанавливает максимальное количество строк, которые могут быть отображены в TextView. Если текст превышает это количество строк, он будет обрезан.
    2. android:lines="10" - переменная, которая устанавливает реальное количество строк, которые будут отображены в TextView. Если текст превышает это количество строк, TextView будет расширяться, чтобы вместить все строки.
    */