package com.example.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewItemsAdapter extends RecyclerView.Adapter<RecyclerViewItemsAdapter.ViewHolder> {

    private List<ItemModel> items;

    RecyclerViewItemsAdapter(List<ItemModel> items){
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerViewItemsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.grid_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewItemsAdapter.ViewHolder holder, int position) {
        ItemModel item = items.get(position);

        TextView name = holder.name;
        ImageView img = holder.img;
        name.setText(item.getName());
        img.setImageResource(item.getImgId());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public ImageView img;

        public ViewHolder(View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.textView);
            img = itemView.findViewById(R.id.imageView);

        }
    }
}
