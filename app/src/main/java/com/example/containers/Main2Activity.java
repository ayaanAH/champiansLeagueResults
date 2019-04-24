package com.example.containers;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main2Activity extends Activity
{
    Spinner spinner;
    String planets[] = {"Mercury","venus","Earth","Mars","Jupitor","Saturn"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner=findViewById(R.id.spinner_sample);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Main2Activity.this, R.layout.support_simple_spinner_dropdown_item, planets);
        spinner.setAdapter(adapter);
    }
}
