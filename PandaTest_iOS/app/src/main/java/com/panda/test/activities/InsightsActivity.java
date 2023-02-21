package com.panda.test.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.panda.test.R;
import com.panda.test.adapters.InsightsPagerAdapter;

public class InsightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insights);

        initView();
    }

    private void initView() {
        ViewPager viewPager = findViewById(R.id.viewPager);
        InsightsPagerAdapter insightsPagerAdapter = new InsightsPagerAdapter();
        viewPager.setAdapter(insightsPagerAdapter);
    }
}
