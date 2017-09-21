package com.blogbasbas.projectday3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogbasbas.projectday3.activity.SplashScreen;
import com.blogbasbas.projectday3.activity.ViewPagerActivity;
import com.blogbasbas.projectday3.helper.MyFunction;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends MyFunction {


    @BindView(R.id.btn_viewpager)
    Button btnViewpager;
    @BindView(R.id.btn_coba)
    Button btnCoba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_viewpager, R.id.btn_coba})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_viewpager:
                akseskelas(ViewPagerActivity.class);
                pesan("ke view pager");
                break;
            case R.id.btn_coba:
                akseskelas(SplashScreen.class);
                pesan("ke splash screen");
                break;
        }
    }

}
