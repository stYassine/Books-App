package com.example.yassine.booksapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yassine.booksapp.R;
import com.example.yassine.booksapp.activities.BookDetails;
import com.example.yassine.booksapp.models.Book;
import com.example.yassine.booksapp.viewHolders.BookViewHolder;

import java.util.List;

/**
 * Created by Yassine on 6/16/2018.
 */

public class BooksRecyclerAdapter extends RecyclerView.Adapter<BookViewHolder> {

    public List<Book> bookList;
    public Context context;

    public BooksRecyclerAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_book, parent, false);

        return new BookViewHolder(view);

    }

    @Override
    public void onBindViewHolder(final BookViewHolder holder, final int position) {

        holder.book_image.setImageResource(bookList.get(position).getImage());
        holder.book_title.setText(bookList.get(position).getTitle());
        holder.book_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(context, BookDetails.class);
                intent.putExtra("image", bookList.get(position).getImage());
                intent.putExtra("title", bookList.get(position).getTitle());
                intent.putExtra("category", bookList.get(position).getCategory());
                intent.putExtra("description", bookList.get(position).getDescription());

                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }


}
