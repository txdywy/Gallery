package com.grafixartist.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GalleryAdapter mAdapter;
    RecyclerView mRecyclerView;

    ArrayList<ImageModel> data = new ArrayList<>();

    public static String IMGS[] = {
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/e35/17495355_204095713419293_5015082622611619840_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/e35/17495355_204095713419293_5015082622611619840_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/e35/17495355_204095713419293_5015082622611619840_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/e35/17495355_204095713419293_5015082622611619840_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/e35/17495355_204095713419293_5015082622611619840_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/e35/17495355_204095713419293_5015082622611619840_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/e35/17495355_204095713419293_5015082622611619840_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/e35/17495355_204095713419293_5015082622611619840_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/e35/17495355_204095713419293_5015082622611619840_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/e35/17495355_204095713419293_5015082622611619840_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-b-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265902_267101913747541_3627374961242406912_n.jpg",
            "https://ig-s-c-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265929_1872900959649050_6674006739894927360_n.jpg",
            "https://ig-s-c-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265929_1872900959649050_6674006739894927360_n.jpg",
            "https://ig-s-c-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265929_1872900959649050_6674006739894927360_n.jpg",
            "https://ig-s-c-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265929_1872900959649050_6674006739894927360_n.jpg",
            "https://ig-s-c-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265929_1872900959649050_6674006739894927360_n.jpg",
            "https://ig-s-c-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265929_1872900959649050_6674006739894927360_n.jpg",
            "https://ig-s-c-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265929_1872900959649050_6674006739894927360_n.jpg",
            "https://ig-s-c-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17265929_1872900959649050_6674006739894927360_n.jpg",
            "https://ig-s-d-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17333244_432413040428315_4438697573401755648_n.jpg",
            "https://ig-s-d-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17333244_432413040428315_4438697573401755648_n.jpg",
            "https://ig-s-d-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17333244_432413040428315_4438697573401755648_n.jpg",
            "https://ig-s-d-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17333244_432413040428315_4438697573401755648_n.jpg",
            "https://ig-s-d-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17333244_432413040428315_4438697573401755648_n.jpg",
            "https://ig-s-d-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17333244_432413040428315_4438697573401755648_n.jpg",
            "https://ig-s-d-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17333244_432413040428315_4438697573401755648_n.jpg",
            "https://ig-s-d-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17333244_432413040428315_4438697573401755648_n.jpg",
            "https://ig-s-d-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17333244_432413040428315_4438697573401755648_n.jpg",
            "https://ig-s-d-a.akamaihd.net/hphotos-ak-xta1/t51.2885-15/s640x640/sh0.08/e35/c0.134.1080.1080/17333244_432413040428315_4438697573401755648_n.jpg",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < IMGS.length; i++) {

            ImageModel imageModel = new ImageModel();
            imageModel.setName("Image " + i);
            imageModel.setUrl(IMGS[i]);
            data.add(imageModel);

        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        mRecyclerView.setHasFixedSize(true);


        mAdapter = new GalleryAdapter(MainActivity.this, data);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this,
                new RecyclerItemClickListener.OnItemClickListener() {

                    @Override
                    public void onItemClick(View view, int position) {

                        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                        intent.putParcelableArrayListExtra("data", data);
                        intent.putExtra("pos", position);
                        startActivity(intent);

                    }
                }));

    }

}
