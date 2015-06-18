package org.androidtown.hello;

import android.widget.ImageView;

public class ImageManager {

    public static final ImageManager instance = new ImageManager();
    private int imageNum=0;
    ImageView matImage [] = new ImageView[20];



    public int getImageNum() {
        return imageNum;
    }

    public void setImageNum(int imageNum) {
        this.imageNum = imageNum;
    }


}
