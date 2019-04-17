package com.foodbreak.vishad.toasterlibrary;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToasterMessage {

    public static void sendmessage(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

    public static Intent testTask(Context context){
        Intent intent = new Intent(context, GoogleActivity.class);
        return intent;
    }
}
