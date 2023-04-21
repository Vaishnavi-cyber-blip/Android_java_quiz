package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"Java is a person?", "Java was introduced in 1943?", "Java was created using Python?", "Java has abstract classes?", "Java supports inheritance?"};
    private boolean[] answers = {false, false, false, true, true};
    private int score = 0;
    Button yes;
    Button no;
    TextView question;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1.Represent the first question 2.iterate to rest of the questions 3.score check 4.
                if (index < questions.length) {
                    question.setText(questions[index]);
                    // checking for the correct answers
                    if (answers[index]) {
                        score++;
                    }
                    index++;
                }
                else{
                    Toast.makeText(MainActivity.this, "Your score is:" +score, Toast.LENGTH_SHORT).show();

                }

                }

        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < questions.length) {
                    question.setText(questions[index]);
                    // checking for the correct answers
                    if (answers[index]) {
                        score++;
                    }
                    index++;
                } else {
                    Toast.makeText(MainActivity.this, "Your score is:" + score, Toast.LENGTH_SHORT).show();


                }

            }
        });

    }
}