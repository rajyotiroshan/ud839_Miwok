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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        //creat ArrayList of Word obj
        ArrayList<Word> colors = new ArrayList<>();
        //add colors.
        colors.add(new Word("wetetti","red"));
        colors.add(new Word("chokokki","green"));
        colors.add(new Word("brown","takaakki"));

        colors.add(new Word("gray","topoppi"));
        colors.add(new Word("black","kululli"));
        colors.add(new Word("white","kelelli"));

        colors.add(new Word("dusty yellow","topiise"));
        colors.add(new Word("mustard yellow","chiwiite"));
        colors.add(new Word("nila","blue"));
        colors.add(new Word("baingni","violet"));
        //attach this colors to WordAdapter.
        WordAdapter adapter = new WordAdapter(this,colors);
        //access an adapter view here it is ListView
        ListView listView = findViewById(R.id.list);
        //link listview to wordAdapter adapter.
        listView.setAdapter(adapter);


    }
}
