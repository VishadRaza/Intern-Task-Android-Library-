package com.foodbreak.vishad.toasterlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class GoogleActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.google.com.pk/");
    }
//    public void onBackPressed() {
//        //  this.startActivity(new Intent(New.this, MainActivity.class));
//        try {
//            Intent intent = new Intent(this,Class.forName("com.foodbreak.vishad.repaettask.MainActivity"));
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        GoogleActivity.this.finish();
//    }
}
