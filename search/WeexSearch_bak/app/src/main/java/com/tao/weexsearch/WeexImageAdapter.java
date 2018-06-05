package com.tao.weexsearch;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.dom.WXImageQuality;

/**
 * Created by SDT14324 on 2018/5/31.
 */

public class WeexImageAdapter implements IWXImgLoaderAdapter {
    @Override
    public void setImage(String url, ImageView view, WXImageQuality quality, WXImageStrategy strategy) {
        //实现你自己的图片下载，否则图片无法显示。
        Glide.with(view.getContext())
                .load(url)
                .error(R.mipmap.me_image_man)
                .into(view);
    }
}
