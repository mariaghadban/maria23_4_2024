package hus.example.communicate1;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import hus.example.maria23_4_2024.R;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        //  support contact

        WebView webView = findViewById(R.id.help_webview);
        webView.loadUrl("file:///android_asset/help.html");

    }
}