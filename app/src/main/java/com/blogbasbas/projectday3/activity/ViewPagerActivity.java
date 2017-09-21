package com.blogbasbas.projectday3.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.blogbasbas.projectday3.R;
import com.blogbasbas.projectday3.adapter.CustomList;
import com.blogbasbas.projectday3.adapter.CustomViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewPagerActivity extends AppCompatActivity {



    String namaGambar[] = {"walpaper 1",
            "walpaper 2"
            , "walpaper 3",
            "walpaper 4"
            , "walpaper 5"};

    int gambarWalpaper[] = {R.drawable.wallpaper1,
            R.drawable.wallpaper2,
            R.drawable.wallpaper3,
            R.drawable.wallpaper4,
            R.drawable.wallpaper5};

    String[] namaBuah = {
            "Alpukat",
            "Apel",
            "Ceri",
            "Durian",
            "Jambu air",

    };

    int[] gambarBuah = {
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,

    };

    int suarabuah[]= {R.raw.alpukat,R.raw.durian,R.raw.ceri,
            R.raw.durian,R.raw.jambuair};


    @BindView(R.id.pager)
    ViewPager pager;
    ListView list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ButterKnife.bind(this);
        CustomViewPager adapter = new CustomViewPager(ViewPagerActivity.this,namaGambar,
                gambarWalpaper);
        pager.setAdapter(adapter);

        CustomList adapter1 = new CustomList(ViewPagerActivity.this, namaBuah, gambarBuah);
        list = (ListView)findViewById(R.id.listView);
        list.setAdapter(adapter1);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //kirim data ke detail activity
                Intent intentkirim = new Intent(ViewPagerActivity.this, DetailListview.class);
                intentkirim.putExtra("nG", namaBuah[i]);
                intentkirim.putExtra("gB", gambarBuah[i]);
                intentkirim.putExtra("sb", suarabuah[i]);


                startActivity(intentkirim);
                Toast.makeText(ViewPagerActivity.this, "berhasil kirim data",
                        Toast.LENGTH_SHORT).show();


            }
        });

    }







}
