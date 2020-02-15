package com.example.listmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainListActivity extends AppCompatActivity {

    //Create a list to hold temp values for now
    ArrayList<String> MainList;

    //List view var to hold reference to XML listview
    ListView list;

    //Array adapter to connect array list ot list view
    ArrayAdapter<String> connecter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        populateListView();
    }

    public void populateListView(){
        MainList =  new ArrayList<String>();
        MainList.add("hello");
        MainList.add("world");

        list = (ListView) findViewById(R.id.MainList);

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        //Second and third in this instance are basic given layouts and text views
        connecter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, MainList);
        list.setAdapter(connecter);
    }
}
