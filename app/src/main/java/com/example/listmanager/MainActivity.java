package com.example.listmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Will take the user to the main page
     * in which will contain a list view of the users lists
     * THis method will also connect the app to the local db
     * @param view
     */
    public void EnterApp(View view){
        Intent intent = new Intent(MainActivity.this, MainListActivity.class);
        startActivity(intent);
    }

    //Will just exit the app
    public void ExitApp(View view){
        finish();
        System.exit(0);
    }
}
