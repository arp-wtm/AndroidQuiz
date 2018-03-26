
package com.example.antonella.androidquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* find the text view that says to observe image*/
        TextView observe = findViewById(R.id.observe_text_view);
        /* styles the observe TextView  with size 30 and color blue */
        observe.setTextSize(30);
        observe.setTextColor(Color.BLUE);

        /* find the button that shows click here when ready */
        Button start = findViewById(R.id.start_button);

         /* styles the button start  with size 25 and background color green */
        start.setTextSize(25);
        start.setBackgroundColor(Color.GREEN);
        /* set a click listener to button to control user input*/
        start.setOnClickListener(new View.OnClickListener() {
            /* when the button of start "click here when ready" is clicked
              * this method is called to send an intent
              * that opens the second screen
              */
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, QuestionActivity.class));
            }
        });
    }
}
