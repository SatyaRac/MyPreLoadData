package com.example.mypreloaddata.prefs;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreference {
    private static final String PREFS_NAME = "MahasiswaPrefs";
    private static final String APP_FIRST_RUN = "app_firs_run";
    private SharedPreferences prefs;

    public AppPreference(Context context){
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public void setFirstRun(Boolean input){
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(APP_FIRST_RUN, input);
        editor.apply();
    }

    public boolean getFirstRun(){
        return prefs.getBoolean(APP_FIRST_RUN, true);
    }
}
