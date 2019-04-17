package com.foodbreak.vishad.toasterlibrary;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.ViewParentCompat;
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
    public void onBackPressed(Activity main) {
        //  this.startActivity(new Intent(GoogleActivity.this, getParent().getClass()));
       // Bundle bundle = getIntent().getExtras();
        Intent intent = new Intent(this,main.getClass());
       // Intent intent = new Intent(this, getParent().getClass());
        startActivity(intent);
        GoogleActivity.this.finish();
    }
}
