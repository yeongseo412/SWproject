package org.androidtown.hello;

<<<<<<< HEAD
import android.widget.ImageView;

public class ImageManager {

    public static final ImageManager instance = new ImageManager();
    private int imageNum=0;
    ImageView matImage [] = new ImageView[20];


=======
/**
 * Created by Lewis on 2015-06-17.
 */
public class ImageManager {

    public static final ImageManager instance=new ImageManager();
    private int imageNum=0;
>>>>>>> origin/master

    public int getImageNum() {
        return imageNum;
    }

    public void setImageNum(int imageNum) {
        this.imageNum = imageNum;
    }
<<<<<<< HEAD


=======
>>>>>>> origin/master
}
