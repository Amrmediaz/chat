package com.example.myapplication;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class adapter extends FragmentStatePagerAdapter {
    int numberTabs ;
    public adapter(FragmentManager fm , int noTabs){
        super(fm);
        noTabs = numberTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                home home = new home();
                return home;
            case 1:
                story about = new story();
                return about;
            case 2:
                chat contact = new chat();
                return contact;
            default:
                return null;
        }    }

    @Override
    public int getCount() {
        return numberTabs;
    }
}
