package com.bao.android_custom_ratingbarview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBarView ratingBarView = (RatingBarView)findViewById(R.id.starView);
        ratingBarView.setmClickable(true);
        //you can set up view here or in XML

        //ratingBarView.setStarCount(5);
        //ratingBarView.setStarEmptyDrawable(...);
        //ratingBarView.setStarFillDrawable(...);
        //ratingBarView.setStarImageSize();

        //bind some data
        ratingBarView.setBindObject(1);
        ratingBarView.setOnRatingListener(new RatingBarView.OnRatingListener() {
            @Override
            public void onRating(Object bindObject) {
                Toast.makeText(MainActivity.this ,"bindObject : "+bindObject,Toast.LENGTH_SHORT).show();
            }
        });

    }


}
