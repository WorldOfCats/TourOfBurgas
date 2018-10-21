package com.example.sotito.tourofburgas;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.sotito.tourofburgas.Landmarks;
import com.example.sotito.tourofburgas.Lesure;
import com.example.sotito.tourofburgas.Nature;
import com.example.sotito.tourofburgas.Shopping;

public class BurgasAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public BurgasAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Landmarks();
        } else if (position == 1) {
            return new Nature();
        } else if (position == 2) {
            return new Shopping();
        } else {
            return new Lesure();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.landmarks);
        } else if (position == 1) {
            return mContext.getString(R.string.nature);
        } else if (position == 2) {
            return mContext.getString(R.string.shopping);
        } else {
            return mContext.getString(R.string.lesure);
        }
    }
}