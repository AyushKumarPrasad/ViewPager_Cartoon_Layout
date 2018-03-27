package com.example.ayushkumar.viewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    List<Integer> lstimages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager) findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(lstimages,getBaseContext());
        pager.setAdapter(adapter);

    }

    private void initData()
    {
        lstimages.add(R.drawable.one);
        lstimages.add(R.drawable.two);
        lstimages.add(R.drawable.three);
        lstimages.add(R.drawable.four);

        lstimages.add(R.drawable.heart);
        lstimages.add(R.drawable.heartstar);
        lstimages.add(R.drawable.kool);


    }
}
