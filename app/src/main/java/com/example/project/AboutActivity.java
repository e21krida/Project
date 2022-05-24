package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    private Button aboutButton;
    private String TAG = "==>";
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        myWebView = findViewById(R.id.webViewAbout);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        aboutButton = findViewById(R.id.aboutIntent);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Intent button in AboutActivity pressed");
                finish();
            }
        });
        showInternalWebPage();
    }

    public void showInternalWebPage() {
        myWebView.loadUrl("file:///android_asset/index.html");
    }
}