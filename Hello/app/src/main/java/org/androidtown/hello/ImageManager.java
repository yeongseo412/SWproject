package org.androidtown.hello;

/**
 * Created by Lewis on 2015-06-17.
 */
public class ImageManager {

    public static final ImageManager instance=new ImageManager();
    private int imageNum=0;

    public int getImageNum() {
        return imageNum;
    }

    public void setImageNum(int imageNum) {
        this.imageNum = imageNum;
    }
}
