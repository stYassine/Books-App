package com.example.yassine.booksapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yassine.booksapp.R;

public class BookDetails extends AppCompatActivity {

    private ImageView bd_image;
    private TextView bd_title;
    private TextView bd_category;
    private TextView bd_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_book_details);

        bd_image =(ImageView) findViewById(R.id.bd_image);
        bd_title =(TextView) findViewById(R.id.bd_title);
        bd_category =(TextView) findViewById(R.id.bd_category);
        bd_description =(TextView) findViewById(R.id.bd_description);

        int recived_image =getIntent().getExtras().getInt("image");
        String recived_title =getIntent().getExtras().getString("title");
        String recived_category =getIntent().getExtras().getString("category");
        String recived_description =getIntent().getExtras().getString("description");

        bd_image.setImageResource(recived_image);
        bd_title.setText(recived_title);
        bd_category.setText(recived_category);
        bd_description.setText(recived_description);

    }



}
