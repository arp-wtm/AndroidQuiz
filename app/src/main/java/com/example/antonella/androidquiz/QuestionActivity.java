/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.antonella.androidquiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionActivity extends AppCompatActivity {
    /* variable that will contain the number of correct answers*/
    static int score;
    /* variables to bind corresponding at correct answers*/
    CheckBox answerOneChoiceOne, answerOneChoiceTwo;
    RadioButton answerTwo;
    EditText answerThree, answerFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        /* find and bind the first CheckBox correct answer of the layout */
        answerOneChoiceOne = findViewById(R.id.answer_checkbox_one);
        /* find and bind the second CheckBox correct answer of the layout */
        answerOneChoiceTwo = findViewById(R.id.answer_checkbox_two);
         /* find and bind the Three RadioButton choice correct answer of the layout */
        answerTwo = findViewById(R.id.radio_button_three);
         /* find and bind the EditText where user will input answer Three of the layout */
        answerThree = findViewById(R.id.answer_three);
        /* find and bind the EditText where user will input answer Four of the layout */
        answerFour = findViewById(R.id.answer_four);
        /* find the submit button and set a listener to catch user pressing*/
        final Button submit = findViewById(R.id.submit_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* when submit is clicked hide soft keyboard*/
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                if (imm != null) {
                    imm.hideSoftInputFromWindow(answerThree.getWindowToken(), 0);
                }

                /* when submit is clicked, update the variable score that contains number of correct answers*/
                score = 0;
                if (answerOneChoiceOne.isChecked() && answerOneChoiceTwo.isChecked()) {
                    score++;
                }
                if (answerTwo.isChecked()) {
                    score++;
                }
                if (answerThree.getText().toString().equalsIgnoreCase("Oreo")) {
                    score++;
                }
                if (answerFour.getText().toString().equalsIgnoreCase("Nougat")) {
                    score++;
                }
                /* display the total number of correct answers*/
                Toast.makeText(submit.getContext(),
                        "the number of correct answers is : " + score + "/4", Toast.LENGTH_LONG).show();
            }
        });


    }
}
