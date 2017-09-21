package com.blogbasbas.projectday3.helper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.blogbasbas.projectday3.R;

public class MyFunction extends AppCompatActivity {
    //kelas context
    public Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_function);
        //funsi kelas context sama dengan kelas MyFunction
        context = MyFunction.this;

    }
    //method pengganti intent
    public void akseskelas (Class kelastujuan){
        startActivity(new Intent(context, kelastujuan));
    }
        //method pengganti toast
    public void pesan (String isipesan){
        Toast.makeText(context, isipesan, Toast.LENGTH_SHORT).show();
    }

}
