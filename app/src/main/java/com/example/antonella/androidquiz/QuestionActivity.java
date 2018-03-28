package com.example.antonella.androidquiz;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * Created by Antonella on 25/03/18.
 */

public class QuestionActivity extends AppCompatActivity {

    static int score = 0;
    CheckBox answerOneChoiceOne, answerOneChoiceTwo;
    RadioButton answerTwo;
    EditText answerThree, answerFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);


        /* find and bind the first Check Box answer of the layout */

        answerOneChoiceOne = findViewById(R.id.answer_checkbox_one);


        /* find and bind the second Check Box answer of the layout */

        answerOneChoiceTwo = findViewById(R.id.answer_checkbox_two);


        answerTwo = findViewById(R.id.radio_button_three);
        answerThree = findViewById(R.id.answer_three);
        answerFour = findViewById(R.id.answer_four);

        final Button submit = findViewById(R.id.submit_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score = 0;
                if (answerOneChoiceOne.isChecked() && answerOneChoiceTwo.isChecked()) {
                    score++;
                }
                if (answerTwo.isChecked()){
                    score++;
                }
                if (answerThree.getText().toString().equalsIgnoreCase("Oreo")){
                    score++;
                }
                if (answerFour.getText().toString().equalsIgnoreCase("Nougat")) {
                    score++;
                }

                Toast.makeText(submit.getContext(),
                        "score is: " + score + "/4", Toast.LENGTH_LONG).show();
            }
        });


    }
}
