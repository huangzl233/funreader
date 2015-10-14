package com.example.hahahs.funreader.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by hahahs on 2015/10/12.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {
    private static final String[] titles = {"Page1","Page2","Page3"};
    private List<Fragment> fragmentList;
    public MyPagerAdapter(FragmentManager fm,List<Fragment> list){
        super(fm);
        fragmentList = list;
    }
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
