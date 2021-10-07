package com.example.groupcac2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // end main

    public void groceryClick (View v)
    {
        Toast.makeText(this, "You clicked the budget button!", Toast.LENGTH_SHORT).show();
    }

    public void govClick (View v)
    {
        Toast.makeText(this, "You clicked the gov program button!", Toast.LENGTH_SHORT).show();
    }

    public void couponClick (View v)
    {
        Toast.makeText(this, "You clicked the coupon button!", Toast.LENGTH_SHORT).show();
    }

} // end main class