package com.blogbasbas.projectday3.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Server on 17/09/2017.
 */

public class AdapterCoba extends PagerAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
