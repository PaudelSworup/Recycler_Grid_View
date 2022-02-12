package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        gridView = findViewById(R.id.gridView);

        ArrayList<ItemModel> Al = new ArrayList<>();
        Al.add(new ItemModel("Segrio Auguero",R.drawable.auguero));
        Al.add(new ItemModel("David Becham",R.drawable.becham));
        Al.add(new ItemModel("Lionel Messi",R.drawable.messi));
        Al.add(new ItemModel("Neymar junior",R.drawable.neymar));
        Al.add(new ItemModel("Cristiano Ronaldo",R.drawable.ronaldo));
        Al.add(new ItemModel("Jamie Vardy",R.drawable.vardy));
        Al.add(new ItemModel("Zlatan Ibramovic",R.drawable.zlatan));

        GridItemAdapter gridia = new GridItemAdapter(this,Al);
        gridView.setAdapter(gridia);
    }
}