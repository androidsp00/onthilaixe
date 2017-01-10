package com.example.androidsp.appgplx.BtnDethi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Androidsp on 10/01/2017.
 */

public class SectionsPagerAdapter extends FragmentStatePagerAdapter {
    private List<ObjCauHoi> mObjCauHoiList;

    public SectionsPagerAdapter(FragmentManager fm, List<ObjCauHoi> objCauHoiList) {
        super(fm);
        mObjCauHoiList = objCauHoiList;
    }


    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(mObjCauHoiList.get(position));
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Câu " + String.valueOf(position + 1);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
