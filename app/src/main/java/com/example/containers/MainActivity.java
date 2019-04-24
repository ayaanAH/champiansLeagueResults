package com.example.containers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    //TODO Declaration
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO Initialization
        String planets[] = {"Mercury","venus","Earth","Mars","Jupitor","Saturn"};
        listView=findViewById(R.id.list_items);

        //TODO Setting Adapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, planets);
        listView.setAdapter(adapter);
    }
}
