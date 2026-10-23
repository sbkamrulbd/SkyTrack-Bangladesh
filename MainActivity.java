package com.example.skytrack;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.graphics.Color;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  getWindow().setStatusBarColor(Color.rgb(7,18,35));
  getWindow().setNavigationBarColor(Color.rgb(7,18,35));
  WebView web=new WebView(this); web.setBackgroundColor(Color.rgb(7,18,35));
  WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
  web.setWebViewClient(new WebViewClient()); web.setWebChromeClient(new WebChromeClient());
  setContentView(web); web.loadUrl("file:///android_asset/index.html");
 }
}
