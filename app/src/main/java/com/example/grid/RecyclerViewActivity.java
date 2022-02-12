package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView rv = findViewById(R.id.recycle);
        ArrayList<ItemModel> Al = new ArrayList<>();
        Al.add(new ItemModel("Segrio Auguero",R.drawable.auguero));
        Al.add(new ItemModel("David Becham",R.drawable.becham));
        Al.add(new ItemModel("Lionel Messi",R.drawable.messi));
        Al.add(new ItemModel("Neymar junior",R.drawable.neymar));
        Al.add(new ItemModel("Cristiano Ronaldo",R.drawable.ronaldo));
        Al.add(new ItemModel("Jamie Vardy",R.drawable.vardy));
        Al.add(new ItemModel("Zlatan Ibramovic",R.drawable.zlatan));

        RecyclerViewItemsAdapter adapter = new RecyclerViewItemsAdapter(Al);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
    }
}