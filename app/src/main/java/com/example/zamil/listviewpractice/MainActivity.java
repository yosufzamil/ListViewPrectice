package com.example.zamil.listviewpractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    ListView listView;
    String imageFileName[] = {"Blue","Clue","Redu","Green","White","Black","Pink","Orange"};

    Integer imageId[] = {
            R.drawable.im1,
            R.drawable.im2,
            R.drawable.im3,
            R.drawable.im4,
            R.drawable.im5,
            R.drawable.im6,
            R.drawable.im7,
            R.drawable.im8

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Customlist adapter = new Customlist(this,imageId,imageFileName);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);


    }



}
