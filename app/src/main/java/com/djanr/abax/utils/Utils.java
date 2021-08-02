package com.djanr.abax.utils;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

public class Utils {
    public static void fullScreen(Activity a){
        a. requestWindowFeature(Window.FEATURE_NO_TITLE);
        a.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
