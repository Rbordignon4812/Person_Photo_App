package com.example.person_photo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Integer[] Life = {R.drawable.cat,R.drawable.sans,R.drawable.michelle,R.drawable.dragon,R.drawable.belemere,R.drawable.yassop};
    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid = (GridView)findViewById(R.id.gridView);
        final ImageView pic = (ImageView) findViewById(R.id.imgLarge);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Toast.makeText(getBaseContext(),"Roger and Grigio (cat)" + (position + 1), Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(),"Comic con with Skye" + (position + 2), Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(),"Roger and Michelle" + (position + 3), Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(),"Rosa and Monkey D. Dragon" + (position + 4), Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(),"Belemere, Nami, and Nojiko" + (position + 5), Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(),"Banchina and Yassop" + (position + 5), Toast.LENGTH_SHORT).show();
                pic.setImageResource(Life[position]);
            }
        });
}

    private class ImageAdapter extends BaseAdapter {
        private Context context;
        public ImageAdapter(Context c) {
            context = c;
        }

        @Override
        public int getCount() {
            return Life.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            pic = new ImageView(context);
            pic.setImageResource(Life[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(300,300));
            return pic;
        }
    }

    }
