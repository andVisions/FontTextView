package com.whinc.widget.fontviewapp;

import android.app.Application;
import android.util.Log;

/**
 * Created by Administrator on 2015/11/23.
 */
public class BaseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Log.i("BaseApplication", "onCreate");
//        FontUtils.getInstance().replaceSystemDefaultFontFromAsset(this, "fonts/my_font.ttf");
    }
}
