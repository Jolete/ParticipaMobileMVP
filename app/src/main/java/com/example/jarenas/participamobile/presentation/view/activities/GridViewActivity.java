package com.example.jarenas.participamobile.presentation.view.activities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.jarenas.participamobile.R;

import java.net.URL;
import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    private GridView gridView;
    private ImageAdapter gridAdapter;

    /*private Integer[] mThumbIds = {R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };*/
    private Integer[] mThumbIds = {R.drawable.imgtest, R.drawable.imgtest,
            R.drawable.imgtest, R.drawable.imgtest,
            R.drawable.imgtest, R.drawable.imgtest,
            R.drawable.imgtest, R.drawable.imgtest,
            R.drawable.imgtest, R.drawable.imgtest,
            R.drawable.imgtest, R.drawable.imgtest,
            R.drawable.imgtest, R.drawable.imgtest,
            R.drawable.imgtest, R.drawable.imgtest,
            R.drawable.imgtest, R.drawable.imgtest,
            R.drawable.imgtest, R.drawable.imgtest,
            R.drawable.imgtest, R.drawable.imgtest
    };
    private ArrayList<Bitmap> mBitmapList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        /*try {
            for(int i = 0; i < 10; i++) {
                this.mBitmapList.add(urlImageToBitmap("http://placehold.it/150x150"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
        //gridview.setAdapter(new ImageAdapter(this, mBitmapList));

        gridView = (GridView) findViewById(R.id.gridView);
        gridAdapter = new ImageAdapter(this, mThumbIds);

        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(GridViewActivity.this, "" + position, Toast.LENGTH_SHORT).show();

                //ImageItem item = (ImageItem) parent.getItemAtPosition(position);
                int imageId = (Integer) (parent.getItemAtPosition(position));
                ImageItem item = (ImageItem) gridAdapter.getItem(imageId);

                //Create intent
                /*Intent intent = new Intent(GridViewActivity.this, GridItemActivity.class);
                intent.putExtra("title", item.getTitle());
                intent.putExtra("image", item.getImage());

                //Start details activity
                startActivity(intent);*/
            }
        });
    }

    private Bitmap urlImageToBitmap(String imageUrl) throws Exception {
        Bitmap result = null;
        URL url = new URL(imageUrl);
        if(url != null) {
            result = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        }
        return result;
    }
}
