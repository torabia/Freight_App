package com.example.freightapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.freightapp.Adapters.ViewPager.ViewPagerAdapter;

public class ExperimentalAccess extends AppCompatActivity {
    private TabLayout tabLayout ;
    private ViewPager viewPager ;
    private ViewPagerAdapter viewPagerAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experimental_access);
        tabLayout = findViewById(R.id.tab_Frieght);
        viewPager = findViewById(R.id.viewPage_Freight);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.AddFragment(new frgBolghdar(),"بلغدار");
        viewPagerAdapter.AddFragment(new frgBonker(),"بونکر");
        viewPagerAdapter.AddFragment(new frgCompersi() , "کمپرسی");
        viewPagerAdapter.AddFragment(new frgKafi() , "کفی");
        viewPagerAdapter.AddFragment(new frgPickup() , "وانت و کامیون");
        viewPagerAdapter.AddFragment(new frgtanker() , "تانکر");
        viewPagerAdapter.AddFragment(new frgYakhchaldar() , "یخچالدار");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.back_pn);

    }
}
