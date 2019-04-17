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
//        Bundle bundle = getIntent().getExtras();
//        Intent intent = new Intent(this, bundle.getClass());
//        startActivity(intent);
//        GoogleActivity.this.finish();
//    }
}
