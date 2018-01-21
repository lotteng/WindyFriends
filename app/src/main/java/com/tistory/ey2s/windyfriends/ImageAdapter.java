package com.tistory.ey2s.windyfriends;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by 151120 on 2018-01-15.
 */

public class ImageAdapter extends BaseAdapter{

    private Context mContext;

    private Integer[] mThumbIds = {
            R.drawable.red, R.drawable.yellow,
            R.drawable.char1 , R.drawable.char2, R.drawable.char3, R.drawable.char4, R.drawable.char5, R.drawable.char6, R.drawable.char7, R.drawable.char8, R.drawable.char9,
            R.drawable.red, R.drawable.yellow,
            R.drawable.char1 , R.drawable.char2, R.drawable.char3, R.drawable.char4, R.drawable.char5, R.drawable.char6, R.drawable.char7, R.drawable.char8, R.drawable.char9
    };


    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(250,300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5, 5, 5, 5);
        }else{
            imageView = (ImageView)convertView;
        }

        imageView.setImageResource(mThumbIds[position]);

        return imageView;
    }



}
