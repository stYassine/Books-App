package com.example.yassine.booksapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.yassine.booksapp.adapters.BooksRecyclerAdapter;
import com.example.yassine.booksapp.models.Book;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public List<Book> bookList;

    public BooksRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookList =new ArrayList<>();
        bookList.add(new Book("Title 1", "Category", "Description", R.drawable.thevigitarian));
        bookList.add(new Book("Title 2", "Category", "Description", R.drawable.thewildrobot));
        bookList.add(new Book("Title 3", "Category", "Description", R.drawable.themartian));
        bookList.add(new Book("Title 4", "Category", "Description", R.drawable.mariasemples));
        bookList.add(new Book("Title 5", "Category", "Description", R.drawable.privacy));

        recyclerView =(RecyclerView) findViewById(R.id.books_recycler_view);

        GridLayoutManager gridLayoutManager =new GridLayoutManager(getApplicationContext(), 3);
        adapter =new BooksRecyclerAdapter(this, bookList);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

    }

}
