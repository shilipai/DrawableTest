package com.lxs.drawabletest;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class TintJavaCodeActivity extends AppCompatActivity {
    private ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tint_java_code);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);

        Drawable drawable = ContextCompat.getDrawable(this,R.drawable.icon1);
        img1.setImageDrawable(drawable);

        Drawable.ConstantState state = drawable.getConstantState();

        Drawable drawable1 = DrawableCompat.wrap(state == null ? drawable : state.newDrawable()).mutate();
        DrawableCompat.setTint(drawable1,ContextCompat.getColor(this,R.color.colorAccent));

        img2.setImageDrawable(drawable1);
    }
}