package com.example.navigationdrawer.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private Context context;
    private LayoutInflater inflater;
    private int[] Images;

    private MutableLiveData<String> mText;

    public GalleryViewModel(Context c, int[] Images) {
        context = c;
        this.Images = Images;
    }

}