package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Логика нажатия на кнопку буквы
    public void onMyButtonClick(View view) {
        TextView infoTextView = (TextView) findViewById(R.id.textView);
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        infoTextView.append(buttonText);
    }

    // Логика нажатия на кнопку для удаления слова
    public void onDellClick(View view) {
        TextView infoTextView = (TextView) findViewById(R.id.textView);
        infoTextView.setText("");
    }

    ScoreLogic scoreLogic = new ScoreLogic();
    MainLogic mainLogic = new MainLogic();

    // Логика нажатия на кнопку проверки слова
    public void onOkClick(View view) {
        TextView infoTextView = (TextView) findViewById(R.id.textView);
        int wordNum = mainLogic.wordSearch(infoTextView.getText().toString());
        if (wordNum != -1 & wordNum != -2) {
            TextView score = (TextView) findViewById(R.id.score);
            scoreLogic.plusScore(infoTextView.getText().toString());
            score.setText(String.valueOf(scoreLogic.getScore()));
            setVisibleWord(wordNum);
            infoTextView.setText("");
            Toast toast = Toast.makeText(getApplicationContext(),
                    "✔ Слово засчитано!", Toast.LENGTH_SHORT);
            toast.show();
        } else if(wordNum == -2) {
            infoTextView.setText("");
            Toast toast = Toast.makeText(getApplicationContext(),
                    "ⓘ Слово уже угадано", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            infoTextView.setText("");
            Toast toast = Toast.makeText(getApplicationContext(),
                    "✘ Слово не засчитано", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    // Функция отображения слова на экране
    public void setVisibleWord(int i){
        TextView textView;
        switch (i) {
            case  (0):
                textView = (TextView) findViewById(R.id.word11);
                textView.setVisibility(View.VISIBLE);
                break;
            case (1):
                textView = (TextView) findViewById(R.id.word12);
                textView.setVisibility(View.VISIBLE);
                break;
            case (2):
                textView = (TextView) findViewById(R.id.word13);
                textView.setVisibility(View.VISIBLE);
                break;
            case (3):
                textView = (TextView) findViewById(R.id.word14);
                textView.setVisibility(View.VISIBLE);
                break;
            case (4):
                textView = (TextView) findViewById(R.id.word15);
                textView.setVisibility(View.VISIBLE);
                break;
            case (5):
                textView = (TextView) findViewById(R.id.word16);
                textView.setVisibility(View.VISIBLE);
                break;
            case (6):
                textView = (TextView) findViewById(R.id.word21);
                textView.setVisibility(View.VISIBLE);
                break;
            case (7):
                textView = (TextView) findViewById(R.id.word22);
                textView.setVisibility(View.VISIBLE);
                break;
            case (8):
                textView = (TextView) findViewById(R.id.word23);
                textView.setVisibility(View.VISIBLE);
                break;
            case (9):
                textView = (TextView) findViewById(R.id.word24);
                textView.setVisibility(View.VISIBLE);
                break;
            case (10):
                textView = (TextView) findViewById(R.id.word25);
                textView.setVisibility(View.VISIBLE);
                break;
            case (11):
                textView = (TextView) findViewById(R.id.word26);
                textView.setVisibility(View.VISIBLE);
                break;
            case (12):
                textView = (TextView) findViewById(R.id.word31);
                textView.setVisibility(View.VISIBLE);
                break;
            case (13):
                textView = (TextView) findViewById(R.id.word32);
                textView.setVisibility(View.VISIBLE);
                break;
            case (14):
                textView = (TextView) findViewById(R.id.word33);
                textView.setVisibility(View.VISIBLE);
                break;
            case (15):
                textView = (TextView) findViewById(R.id.word34);
                textView.setVisibility(View.VISIBLE);
                break;
            case (16):
                textView = (TextView) findViewById(R.id.word35);
                textView.setVisibility(View.VISIBLE);
                break;
            case (17):
                textView = (TextView) findViewById(R.id.word36);
                textView.setVisibility(View.VISIBLE);
                break;
            case (18):
                textView = (TextView) findViewById(R.id.word41);
                textView.setVisibility(View.VISIBLE);
                break;
        }
    }

}
