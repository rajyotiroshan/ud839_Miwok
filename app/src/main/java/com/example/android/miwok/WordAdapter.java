package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    //constructor
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listitem,parent,false);
                   }
        //access the current Object located at the position index in the WordAdapter.
        Word currentWord = getItem(position);
        //access TV for english
        TextView defaultTv = listItemView.findViewById(R.id.default_word_translation);
        //set eng word
        defaultTv.setText(currentWord.getDefaultTranslation());
        //access Tv for miwok word to display
        TextView miwokTv = listItemView.findViewById(R.id.miwok_word);
        //set text as miwok translation.
        miwokTv.setText(currentWord.getMiwokTranslation());
        //access ImageView and set imageResId
        ImageView imageIV = listItemView.findViewById(R.id.img);
        imageIV.setImageResource(currentWord.getImgResourceID());
        return listItemView;
    }
}
