# Android_custom_ratingbarview
###### a custom RatingBarView with Animation and you can set Image and count
###### 一个带有动画的评分控件，可以设置图片和个数

### Usage

#### In XML  Directly

    <com.bao.android_custom_ratingbarview.RatingBarView
        android:id="@+id/starView"
        bao:starImageSize = "22dp"
        bao:starCount = "7"
        bao:starEmpty = "@drawable/icon_star_empty"
        bao:starFill = "@drawable/icon_star_fill"
        android:layout_centerInParent="true"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
    </com.bao.android_custom_ratingbarview.RatingBarView>
    
#### In Java Code

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
            public void onRating(Object bindObject,int RatingScore) {
                Toast.makeText(MainActivity.this ,"bindObject : "+bindObject,Toast.LENGTH_SHORT).show();
            }
        });


![image](https://github.com/JackWong025/Android_custom_ratingbarview/blob/master/1.gif)
