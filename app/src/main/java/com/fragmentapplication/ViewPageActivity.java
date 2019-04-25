package com.fragmentapplication;

import android.support.design.widget.TabLayout;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adopter.ViewPagerAdopter;
import fragment.Celsius_Fragment;
import fragment.FirstFragment;
import fragment.SI_Fragment;
import fragment.SecondFragment;

public class ViewPageActivity extends AppCompatActivity {

private ViewPager viewPager;
private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

tabLayout=findViewById(R.id.tabId);
viewPager=findViewById(R.id.viewPager);


        ViewPagerAdopter adopter=new ViewPagerAdopter(getSupportFragmentManager());
        adopter.addFragment(new FirstFragment(),"sum");
        adopter.addFragment(new SecondFragment(),"area of Circle");
        adopter.addFragment(new SI_Fragment(),"Simple Interest");
        adopter.addFragment(new Celsius_Fragment(),"Celsius");


        viewPager.setAdapter(adopter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
