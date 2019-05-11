package com.zxn.mybanner.demo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import com.zxn.mybanner.App;
import com.zxn.mybanner.R;
import com.zxn.mybanner.SampleAdapter;
import com.zxn.mybanner.loader.GlideImageLoader;
import com.zxn.xmbanner.XmBanner;
import com.zxn.xmbanner.listener.OnBannerListener;
import com.zxn.xmbanner.transformer.AccordionTransformer;
import com.zxn.xmbanner.transformer.BackgroundToForegroundTransformer;
import com.zxn.xmbanner.transformer.CubeInTransformer;
import com.zxn.xmbanner.transformer.CubeOutTransformer;
import com.zxn.xmbanner.transformer.DefaultTransformer;
import com.zxn.xmbanner.transformer.DepthPageTransformer;
import com.zxn.xmbanner.transformer.FlipHorizontalTransformer;
import com.zxn.xmbanner.transformer.FlipVerticalTransformer;
import com.zxn.xmbanner.transformer.ForegroundToBackgroundTransformer;
import com.zxn.xmbanner.transformer.RotateDownTransformer;
import com.zxn.xmbanner.transformer.RotateUpTransformer;
import com.zxn.xmbanner.transformer.ScaleInOutTransformer;
import com.zxn.xmbanner.transformer.StackTransformer;
import com.zxn.xmbanner.transformer.TabletTransformer;
import com.zxn.xmbanner.transformer.ZoomInTransformer;
import com.zxn.xmbanner.transformer.ZoomOutSlideTransformer;
import com.zxn.xmbanner.transformer.ZoomOutTranformer;

import java.util.ArrayList;
import java.util.List;

public class BannerAnimationActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, OnBannerListener {
    XmBanner banner;
    List<Class<? extends ViewPager.PageTransformer>> transformers = new ArrayList<>();

    public void initData() {
        transformers.add(DefaultTransformer.class);
        transformers.add(AccordionTransformer.class);
        transformers.add(BackgroundToForegroundTransformer.class);
        transformers.add(ForegroundToBackgroundTransformer.class);
        transformers.add(CubeInTransformer.class);//兼容问题，慎用
        transformers.add(CubeOutTransformer.class);
        transformers.add(DepthPageTransformer.class);
        transformers.add(FlipHorizontalTransformer.class);
        transformers.add(FlipVerticalTransformer.class);
        transformers.add(RotateDownTransformer.class);
        transformers.add(RotateUpTransformer.class);
        transformers.add(ScaleInOutTransformer.class);
        transformers.add(StackTransformer.class);
        transformers.add(TabletTransformer.class);
        transformers.add(ZoomInTransformer.class);
        transformers.add(ZoomOutTranformer.class);
        transformers.add(ZoomOutSlideTransformer.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_animation);
        initData();
        banner = (XmBanner) findViewById(R.id.banner);
        ListView listView = (ListView) findViewById(R.id.list);
        String[] data = getResources().getStringArray(R.array.anim);
        listView.setAdapter(new SampleAdapter(this, data));
        listView.setOnItemClickListener(this);

        String[] urls = getResources().getStringArray(R.array.url);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < urls.length; i++) {
            list.add(urls[i]);
        }
        banner.setImages(list)
                .setImageLoader(new GlideImageLoader())
                .setOnBannerListener(this)
                .start();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        banner.setBannerAnimation(transformers.get(position));
    }

    @Override
    public void OnBannerClick(int position) {
        Toast.makeText(getApplicationContext(), "你点击了：" + position, Toast.LENGTH_SHORT).show();
    }
}
