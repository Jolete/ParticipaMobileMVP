package com.example.jarenas.participamobile.presentation.view.activities;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by jarenas on 30/10/2015.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private Integer[] mThumbIds;
    private ArrayList<ImageItem> mBitmapsList;
    private boolean mIsThumb;

    public ImageAdapter (Context context, Integer[] ThumbsIds) {
        this.mContext = context;
        mThumbIds = ThumbsIds;
        mIsThumb = true;
    }

    public ImageAdapter (Context context, ArrayList<ImageItem> ImageItemList) {
        this.mContext = context;
        mBitmapsList = ImageItemList;
        mIsThumb = false;
    }

    @Override
    public int getCount() {
        if (mThumbIds != null)
            return mThumbIds.length;

        if (mBitmapsList != null)
            return mBitmapsList.size();

        return 0;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        //ImageItem image = (ImageItem) getItem(position);
        return position;//image.getTitle()
    }

    @Override
    // Creem un nou ImageView per cada item referenciat per l'adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null ) {
            imageView  = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(GridView.LayoutParams.MATCH_PARENT, GridView.LayoutParams.MATCH_PARENT));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(0, 0, 0, 0);
        }
        else
        {
            imageView = (ImageView) convertView;
        }

        if (mIsThumb == true)
            imageView.setImageResource(mThumbIds[position]);
        //else
            //imageView.setImageBitmap(mBitmapsList.get(position));

        return imageView;
    }
}
