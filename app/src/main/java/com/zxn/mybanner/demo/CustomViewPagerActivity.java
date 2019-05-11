package com.zxn.mybanner.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.zxn.mybanner.App;
import com.zxn.mybanner.R;
import com.zxn.mybanner.loader.GlideImageLoader;
import com.zxn.xmbanner.XmBanner;
import com.zxn.xmbanner.listener.OnBannerListener;


public class CustomViewPagerActivity extends AppCompatActivity implements OnBannerListener {
    XmBanner banner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_pager);

        banner = (XmBanner) findViewById(R.id.banner);
        banner.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, App.H / 4));
        //简单使用
        banner.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .setOnBannerListener(this)
                .start();
    }

    @Override
    public void OnBannerClick(int position) {

    }

    //如果你需要考虑更好的体验，可以这么操作
    @Override
    protected void onStart() {
        super.onStart();
        //开始轮播
        banner.startAutoPlay();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //结束轮播
        banner.stopAutoPlay();
    }
}
