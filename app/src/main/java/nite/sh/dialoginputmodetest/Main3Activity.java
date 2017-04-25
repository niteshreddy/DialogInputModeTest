package nite.sh.dialoginputmodetest;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //setUpWindowSize();
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        //setUpWindowSize();
    }

    private void setUpWindowSize() {

        int height = getDialogHeight();
        int width = getDialogWidth();
        getWindow().setLayout(width,height);

    }



    private int getDialogHeight() {

        WindowManager wm = (WindowManager) Main3Activity.this.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();

        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        return (int) (height * 0.83);
    }


    /**
     * Return the group folder dialog width.
     * Width is 80% of screen width in both orientations.
     * * Only for tablet.
     */
    public int getDialogWidth() {

        WindowManager wm = (WindowManager) Main3Activity.this.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();

        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        //Width is 80% in both the orientations.
        return (int) (width * 0.8);
    }
}
