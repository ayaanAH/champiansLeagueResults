package com.example.containers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class customListView extends AppCompatActivity
{

    ListView listView;
    String mTitle[]={"FC Barcelona","Juventus FC","Real Madrid C.F","PSG FC","Arsenal"};
    String mDescription[]={"FC Barcelona Description", "Juventus FC Description","Real Madrid C.F Description","PSG FC Description","Arsenal Description"};
    int images[]={R.drawable.fcb, R.drawable.jfc, R.drawable.rm, R.drawable.psg, R.drawable.afc};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listView=findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position==0)
                    Toast.makeText(customListView.this, "Winners : FC Barcelona"      , Toast.LENGTH_SHORT).show();
                if(position==1)
                    Toast.makeText(customListView.this, "Runner Ups : Juventus FC"    , Toast.LENGTH_SHORT).show();
                if(position==2)
                    Toast.makeText(customListView.this, "3rd Place : Real Madrid C.F" , Toast.LENGTH_SHORT).show();
                if(position==3)
                    Toast.makeText(customListView.this, "4th Place : PSG FC"          , Toast.LENGTH_SHORT).show();
                if(position==4)
                    Toast.makeText(customListView.this, "5th Place : Arsenal"         , Toast.LENGTH_SHORT).show();
            }
        });

    }

    class MyAdapter extends ArrayAdapter<String>
    {
        Context context;
        String rTitle[], rDescription[];
        int rImgs[];

        MyAdapter(Context c, String tittle[], String description[], int imgs[])
        {
            super(c, R.layout.row, R.id.title1, tittle);
            this.context = c;
            this.rTitle = tittle;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
        {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.img1);
            TextView myTitle = row.findViewById(R.id.title1);
            TextView myDescription = row.findViewById(R.id.description1);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }

}
