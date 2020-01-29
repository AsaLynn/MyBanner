package com.zxn.xmbanner;


import androidx.viewpager.widget.ViewPager;

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


public class Transformer {
    public static Class<? extends ViewPager.PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
