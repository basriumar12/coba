package com.blogbasbas.projectday3.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.blogbasbas.projectday3.R;

/**
 * Created by Server on 06/09/2017.
 */

public class CustomViewPager extends PagerAdapter{
    public CustomViewPager(Context context, String[] namagambar, int[] gambar) {
        this.context = context;
        this.namagambar = namagambar;
        this.gambar = gambar;
    }

    //deklrassi Variabel

    Context context;
    String [] namagambar;
    int[]gambar;




    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout)object);
    }



    //instantiateItem
    @Override
    public Object instantiateItem (ViewGroup container, int posisi) {

        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View  view = inflater.inflate(R.layout.tampilanviewpager, null);

        //panggil image n textview pada tampilanviewpager.xml
        ImageView imageView = (ImageView) view.findViewById(R.id.imgpager);
        TextView textView = (TextView) view.findViewById(R.id.tvnamagambar);
        //set image and text
        textView.setText(namagambar[posisi]);
        imageView.setImageResource(gambar[posisi]);
        ((ViewPager)container).addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ((ViewPager)container).removeView((LinearLayout)object);
    }
}
