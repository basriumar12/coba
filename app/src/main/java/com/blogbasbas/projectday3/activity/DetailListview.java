package com.blogbasbas.projectday3.activity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogbasbas.projectday3.R;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailListview extends AppCompatActivity {

    @BindView(R.id.imgdetail)
    ImageView imgdetail;
    @BindView(R.id.txtdetail)
    TextView txtdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_listview);
        ButterKnife.bind(this);
        //untuk nangkap data
        Intent intentterima = getIntent();
        txtdetail.setText(intentterima.getStringExtra("nG"));
        imgdetail.setImageResource(intentterima.getIntExtra("gB", 0));


        MediaPlayer mediaPlayer = new MediaPlayer();
        Uri lokasi = Uri.parse("android.resource://"+getPackageName()+"/"
                +intentterima.getIntExtra("sb",0));
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        //cek error
        try{
            mediaPlayer.setDataSource(DetailListview.this,lokasi);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
