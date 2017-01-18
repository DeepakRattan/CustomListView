package com.example.deepakrattan.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SingleRow singleRow;
    private List<SingleRow> singleRowList;
    private ListView lv;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewByID
        lv = (ListView) findViewById(R.id.lv);


        String[] name = {"Deepak", "Shary", "Raj", "Ravi", "Suraj", "Rahul", "Shivani", "Jaswinder", "Dilpreet", "Yogesh"};
        int[] images = {R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image, R.drawable.image};
        String[] desc = {"Welcome to all", "Welcome to all", "Welcome to all", "Welcome to all", "Welcome to all", "Welcome to all", "Welcome to all", "Welcome to all", "Welcome to all", "Welcome to all"};

        singleRowList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            singleRow = new SingleRow(name[i], desc[i], images[i]);
            singleRowList.add(singleRow);
        }


        myAdapter = new MyAdapter(this, singleRowList);
        lv.setAdapter(myAdapter);


    }
}
