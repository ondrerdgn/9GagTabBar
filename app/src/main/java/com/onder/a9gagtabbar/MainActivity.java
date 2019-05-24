package com.onder.a9gagtabbar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    SectionsPageAdaptor sectionsPageAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sectionsPageAdapter = new SectionsPageAdaptor(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.container);
        setupPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);




    }
    private void setupPager(ViewPager viewPager){
        SectionsPageAdaptor adapter = new SectionsPageAdaptor(getSupportFragmentManager());
        adapter.addFragment(new FragmentHot(), "Hot");
        adapter.addFragment(new FragmentFresh(), "Fresh");
        adapter.addFragment(new FragmentTrending(), "Trending");
        viewPager.setAdapter(adapter);
    }
}