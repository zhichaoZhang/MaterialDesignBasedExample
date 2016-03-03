package com.aswifter.material;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by zczhang on 16/3/1.
 */
public class SettingActivity extends BaseActivity{
    ImageView ivCpu = null;
    ImageView ivCpuAnim = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView textView = new TextView(this);
//        textView.setText("测试页面");
        setContentView(R.layout.fragment_setting);

        ivCpu = (ImageView)findViewById(R.id.iv_cpu);
        ivCpuAnim = (ImageView)findViewById(R.id.iv_cpu_anim);
        Drawable drawable = ivCpuAnim.getDrawable();
        if(drawable instanceof Animatable) {
            ((Animatable)drawable).start();
        }
//        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(this, R.drawable.animated_arrow);
//        ivCpuAnim.setImageDrawable(animatedVectorDrawableCompat);
//        animatedVectorDrawableCompat.start();
    }
}
