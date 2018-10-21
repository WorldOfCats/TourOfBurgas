package com.example.sotito.tourofburgas;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager activityDisplay = (ViewPager) findViewById(R.id.display);

        BurgasAdapter adapterHome = new BurgasAdapter(MainActivity.this, getSupportFragmentManager());

        activityDisplay.setAdapter(adapterHome);

        TabLayout sliderDesign = (TabLayout) findViewById(R.id.sliders);

        sliderDesign.setupWithViewPager(activityDisplay);
    }
}
