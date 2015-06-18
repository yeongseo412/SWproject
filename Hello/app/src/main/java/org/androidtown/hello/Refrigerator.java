package org.androidtown.hello;


import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.support.v7.app.ActionBarActivity;


public class Refrigerator extends ActionBarActivity {
    ImageView imageView01;
    BitmapDrawable bitmap;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_refrigerator);
    }

    public void onButton1Clicked(View v) {
        changeImage();
    }


    private void changeImage() {
        if (ImageManager.instance.getImageNum() == 0) {
            imageView01 = (ImageView) findViewById(R.id.imageView01);

            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.backward);

            imageView01.setImageDrawable(bitmap);

            ImageManager.instance.setImageNum(1);
        } else if (ImageManager.instance.getImageNum() == 1) {
            imageView01 = (ImageView) findViewById(R.id.imageView02);

            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.forward);

            imageView01.setImageDrawable(bitmap);

            ImageManager.instance.setImageNum(0);
        }
    }

//imageView.setImage(ImageManager.instacne.getImgNum());
}
