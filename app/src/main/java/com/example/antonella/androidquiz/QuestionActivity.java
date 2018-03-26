package com.example.antonella.androidquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Antonella on 25/03/18.
 */

public class QuestionActivity extends AppCompatActivity {

    public static int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }
}
