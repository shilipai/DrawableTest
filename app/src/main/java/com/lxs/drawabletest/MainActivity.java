package com.lxs.drawabletest;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img1, img2;
    private Button btnGotoSecondActivity, btnChangeImg1Alpha, btnChangeImg1Color,btnGotoTintActivity,btnGotoTintJava,btnGotoSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        btnChangeImg1Alpha = (Button) findViewById(R.id.btn_change_img1_alpha);
        btnChangeImg1Color = (Button) findViewById(R.id.btn_change_img1_color);
        btnGotoSecondActivity = (Button) findViewById(R.id.btn_goto_second_activity);
        btnGotoTintActivity = (Button) findViewById(R.id.btn_goto_tint_activity);
        btnGotoTintJava= (Button) findViewById(R.id.btn_goto_tint_java);
        btnGotoSelector = (Button) findViewById(R.id.btn_goto_selector);
        btnChangeImg1Alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setAlpha(0.5f);
            }
        });
        btnChangeImg1Color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.getDrawable().setColorFilter(Color.parseColor("#FFD84A"), PorterDuff.Mode.SRC_IN);
            }
        });


        btnGotoSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
        btnGotoTintActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,TintActivity.class));
            }
        });
        btnGotoTintJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TintJavaCodeActivity.class));
            }
        });
        btnGotoSelector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SelectorActivity.class));
            }
        });
    }
}
