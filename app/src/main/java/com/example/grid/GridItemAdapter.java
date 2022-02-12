package com.example.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class GridItemAdapter extends ArrayAdapter<ItemModel> {

    public GridItemAdapter(@NonNull Context context,  @NonNull ArrayList<ItemModel> arrayListItemModel) {
        super(context, 0,   arrayListItemModel);
    }

    @NonNull
    @Override
    public View getView(int pos, @Nullable View cv, @NonNull ViewGroup parent){
        View gridItemView = cv;
        if(gridItemView == null){
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item,parent,false);
        }

        ItemModel item = getItem(pos);
        TextView Tv = gridItemView.findViewById(R.id.textView);
        ImageView iv = gridItemView.findViewById(R.id.imageView);
        Tv.setText(item.getName());
        iv.setImageResource(item.getImgId());
        return  gridItemView;
    }
}
