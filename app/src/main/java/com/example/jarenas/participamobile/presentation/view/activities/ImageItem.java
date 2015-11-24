package com.example.jarenas.participamobile.presentation.view.activities;

import android.graphics.Bitmap;

/**
 * Created by jarenas on 31/10/2015.
 */
public class ImageItem {
    private String mTitle;
    private Bitmap mImage;

    public ImageItem(Bitmap image, String title)
    {
        super();
        this.mImage = image;
        this.mTitle = title;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String _Title) {
        this.mTitle = _Title;
    }

    public Bitmap getImage() {
        return this.mImage;
    }

    public void setImage(Bitmap _Bitmap) {
        this.mImage = _Bitmap;
    }

}
