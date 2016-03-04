package com.asburymotors.gridviewapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.GridView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

public class GridViewApp extends Activity implements AdapterView.OnItemClickListener{

        TextView selectedOpt;
            String[] fruits={"Apple", "Mango", "Banana","Grape","Orange","Pineapple", "Strawberry", "Papaya", "Guava", "Pomegranate", "Watermelon", "Chickoo", "Dates", "Plum", "Cherry","Kiwi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_app);
        selectedOpt = (TextView) findViewById(R.id.selectedopt);
        GridView g = (GridView) findViewById(R.id.grid);
        ArrayAdapter<String> arrayAdpt = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, fruits);
        g.setAdapter(arrayAdpt);
        g.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        selectedOpt.setText("You have selected "+fruits[position]);
            }
    public void onNothingSelected(AdapterView<?> parent) {
        selectedOpt.setText("");
    }
}
