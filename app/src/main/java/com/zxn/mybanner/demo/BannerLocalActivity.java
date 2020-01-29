package com.zxn.mybanner.demo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.zxn.mybanner.R;
import com.zxn.mybanner.loader.GlideImageLoader;
import com.zxn.xmbanner.XmBanner;

import java.util.ArrayList;
import java.util.List;

public class BannerLocalActivity extends AppCompatActivity {

    XmBanner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_local);
        initView();
    }

    private void initView() {
        banner = (XmBanner) findViewById(R.id.banner);
        //本地图片数据（资源文件）
        List<Integer> list=new ArrayList<>();
        list.add(R.mipmap.b1);
        list.add(R.mipmap.b2);
        list.add(R.mipmap.b3);



        banner.setImages(list)
                .setImageLoader(new GlideImageLoader())
                .start();
    }
}
