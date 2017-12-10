package com.example.marine.tp_final;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by marine on 09/12/17.
 */
public class UserStorage {

    public static final String USER_NAME = "name";
    public static final String USER_EMAIL = "email";

    public static void saveUserInfo(Context context, String name, String email) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString(USER_NAME, name);
        editor.putString(USER_EMAIL, email);
        editor.apply();
    }

    public static User getUser(Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return new User(preferences.getString(USER_NAME, ""), preferences.getString(USER_EMAIL, ""));
    }

    public static boolean isLogged(Context context){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(USER_NAME, "") != "";
    }
}
