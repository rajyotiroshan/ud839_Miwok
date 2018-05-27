/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        //creat ArrayList of Word obj
        ArrayList<Word> colors = new ArrayList<>();
        //add colors.
        colors.add(new Word("wetetti","red",R.drawable.color_red));
        colors.add(new Word("chokokki","green",R.drawable.color_green));
        colors.add(new Word("brown","takaakki",R.drawable.color_brown));

        colors.add(new Word("gray","topoppi",R.drawable.color_gray));
        colors.add(new Word("black","kululli",R.drawable.color_black));
        colors.add(new Word("white","kelelli",R.drawable.color_white));

        colors.add(new Word("dusty yellow","topiise",R.drawable.color_dusty_yellow));
        colors.add(new Word("mustard yellow","chiwiite",R.drawable.color_mustard_yellow));
        colors.add(new Word("nila","blue",R.mipmap.ic_launcher));
        colors.add(new Word("baingni","violet",R.mipmap.ic_launcher));
        //attach this colors to WordAdapter.
        WordAdapter adapter = new WordAdapter(this,colors);
        //access an adapter view here it is ListView
        ListView listView = findViewById(R.id.list);
        //link listview to wordAdapter adapter.
        listView.setAdapter(adapter);


    }
}
