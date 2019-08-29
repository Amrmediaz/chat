package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener
        ,home.OnFragmentInteractionListener  {
TabLayout tab1 ;
FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
tab1 = findViewById(R.id.tab);
        tab1.addTab(tab1.newTab().setText("Home"));
        tab1.addTab(tab1.newTab().setText("About"));
        ArrayList <String> arrayList = new ArrayList<>();
        tab1.addTab(tab1.newTab().setText("Contact"));
        final ViewPager viewPager =(ViewPager)findViewById(R.id.view_pager);
        adapter1 tabsAdapter = new adapter1(getSupportFragmentManager(), 3);
        viewPager.setAdapter(tabsAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab1));

tab1.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
Toast.makeText(getApplicationContext(),String.valueOf(tab.getPosition()),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
});
        ;

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    // viewPager.setAdapter(adapter);

    }

