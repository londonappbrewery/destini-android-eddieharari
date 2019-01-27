package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button mAns1;
    Button mAns2;
    int mStoryIndex;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
    mStory = findViewById(R.id.storyTextView);
    mAns1 = findViewById(R.id.buttonTop);
    mAns2 = findViewById(R.id.buttonBottom);
    mStoryIndex=1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

    mAns1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("Destiny","Button up was pressed");
            if (mStoryIndex==1 || mStoryIndex==2) {
                mStory.setText(R.string.T3_Story);
                mAns1.setText(R.string.T3_Ans1);
                mAns2.setText(R.string.T3_Ans2);
                mStoryIndex = 3;
            } else if (mStoryIndex==3) {
                mStory.setText(R.string.T6_End);
                mStoryIndex=6;
                mAns1.setVisibility(View.GONE);
                mAns2.setVisibility(View.GONE);
            }
        }
    });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("desitny","Bottom button was pressed");
                if(mStoryIndex==1) {
                    mStory.setText(R.string.T2_Story);
                    mAns1.setText(R.string.T2_Ans1);
                    mAns2.setText(R.string.T2_Ans2);
                    mStoryIndex=2;
                } else if (mStoryIndex==2) {
                    mStory.setText(R.string.T4_End);
                    mStoryIndex=4;
                    mAns1.setVisibility(View.GONE);
                    mAns2.setVisibility(View.GONE);
                } else if (mStoryIndex==3) {
                    mStory.setText(R.string.T5_End);
                    mAns1.setVisibility(View.GONE);
                    mAns2.setVisibility(View.GONE); 


                }
            }
        });


    }
}
