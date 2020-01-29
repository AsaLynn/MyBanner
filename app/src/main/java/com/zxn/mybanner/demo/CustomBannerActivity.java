package com.zxn.mybanner.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.zxn.mybanner.App;
import com.zxn.mybanner.R;
import com.zxn.mybanner.loader.GlideImageLoader;
import com.zxn.xmbanner.BannerConfig;
import com.zxn.xmbanner.XmBanner;

public class CustomBannerActivity extends AppCompatActivity {
    XmBanner banner1,banner2,banner3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_banner);
        banner1 = (XmBanner) findViewById(R.id.banner1);
        banner2 = (XmBanner) findViewById(R.id.banner2);
        banner3 = (XmBanner) findViewById(R.id.banner3);

        banner1.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .start();

        banner2.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .start();

        banner3.setImages(App.images)
                .setBannerTitles(App.titles)
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE)
                .setImageLoader(new GlideImageLoader())
                .start();
    }
}
