package com.example.groupcac2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void browser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.walmart.com/help/article/print-and-use-coupons/205b65e070f247d7a98687b7ff2d5cc9"));
        startActivity(browserIntent);
    }

    public void browser2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://coupons.staterbros.com/"));
        startActivity(browserIntent);

    }
    public void browser3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.target.com/c/top-deals/-/N-4xw74"));
        startActivity(browserIntent);
    }
    //
    public void browser4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://superiorgrocers.com/specials/"));
        startActivity(browserIntent);
    }
    //
}