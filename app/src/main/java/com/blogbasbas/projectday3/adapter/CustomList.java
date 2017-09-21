package com.blogbasbas.projectday3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogbasbas.projectday3.R;

/**
 * Created by Server on 06/09/2017.
 */

public class CustomList extends BaseAdapter{
    //deklarasi variabel
    Context context;
    String []namaGambar;
    int []gambarWalpaper ;

    public CustomList(Context context, String[] namaGambar, int[] gambarWalpaper) {
        this.context = context;
        this.namaGambar = namaGambar;
        this.gambarWalpaper = gambarWalpaper;
    }

    @Override
    public int getCount() {
        return namaGambar.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.list_item,null);
        //inisialisasi id dari image and textview
        ImageView imageView = (ImageView) view.findViewById(R.id.ivGambar);
        TextView textView = (TextView) view.findViewById(R.id.textView);

        //
        textView.setText(namaGambar[i]);
        imageView.setImageResource(gambarWalpaper[i]);

        return view;
    }
}
