package com.tzuhung.android14intentadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenCall(View v){
        final EditText mET_InputCall = findViewById(R.id.ET_InputCall);
        Intent Call = new Intent(Intent.ACTION_DIAL);
        Call.setData(Uri.parse("tel:"+mET_InputCall.getText().toString()));
        startActivity(Call);
        finish();
    }
    public void OpenGoogleMap(View v){
        Uri uri = Uri.parse("https://www.google.com.tw/maps");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
        finish();
    }
    public void OpenGoogle(View v){
        Uri uri = Uri.parse("https://www.google.com");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
        finish();
    }
}