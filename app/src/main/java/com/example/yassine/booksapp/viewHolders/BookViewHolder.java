package com.example.yassine.booksapp.viewHolders;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yassine.booksapp.R;

/**
 * Created by Yassine on 6/16/2018.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {

    public ImageView book_image;
    public TextView book_title;
    public CardView book_container;

    public BookViewHolder(View itemView) {
        super(itemView);

        book_image =(ImageView) itemView.findViewById(R.id.book_image);
        book_title =(TextView) itemView.findViewById(R.id.book_title);
        book_container =(CardView) itemView.findViewById(R.id.single_book_container);

    }

}
