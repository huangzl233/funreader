package com.example.hahahs.funreader.utils;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.content.IntentCompat;

import com.example.hahahs.funreader.R;

/**
 * Created by hahahs on 2015/10/12.
 */
public class ThemeUtil {
    private  static boolean showOriginTheme = false;
    private  static int currentTheme;

    public static void changeTheme(Activity activity){


         activity.finish();
         Intent intent = new Intent(activity,activity.getClass());
         activity.startActivity(intent);
         activity.overridePendingTransition(0,0);




    }
    public static void onActivityCreateSetTheme(Activity activity){
        if (!showOriginTheme){
            activity.setTheme(R.style.AppTheme);
            currentTheme = R.style.AppTheme;
            showOriginTheme = true;
        }else {
            activity.setTheme(R.style.AppTheme1);
            currentTheme = R.style.AppTheme1;
            showOriginTheme = false;

        }






    }
    public static void otherActivityCreateTheme(Activity activity){
        activity.setTheme(currentTheme);
    }

}
