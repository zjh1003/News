package com.example.mrtrsang.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by yls on 2017/5/16.
 */

public class FragmentAdapter extends FragmentPagerAdapter{
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new NewsFragment();
        } else if (position == 2) {
            return new FmFragment();
        }else if (position==3){
            return new VideoFragment();
        }
        return new WoFragment();
    }

    @Override
    public int getCount() {
        return 0;
    }
   /* @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }*/
}
