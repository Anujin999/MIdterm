package com.example.navigationdrawer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;

import com.example.navigationdrawer.ui.gallery.GalleryFragment;

public class adapter extends BaseAdapter {

    Context c;
    int[] images;
    public adapter (Context c, int[] images){
        this.c =c;
        this.images=images;

    }

    public adapter(GalleryFragment galleryFragment, int[] images) {


    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img=new ImageView(c);
        img.setImageResource(images[position]);
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        img.setLayoutParams(new GridLayout.LayoutParams());

        return img;
    }
}
