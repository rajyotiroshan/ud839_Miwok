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

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        //create an array of words.
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("lutti","one"));
        words.add(new Word("","three"));
        words.add(new Word("","four"));
        words.add(new Word("","five"));
        words.add(new Word("","six"));
        words.add(new Word("","seven"));
        words.add(new Word("","eight"));
        words.add(new Word("","nine"));
        words.add(new Word("","ten"));
        words.add(new Word("","eleven"));
        words.add(new Word("","twelve"));
        words.add(new Word("","thirteen"));
        words.add(new Word("","fourteen"));
        words.add(new Word("","fifteen"));
        words.add(new Word("","sixteen"));
        //access root view
        //LinearLayout rootView=findViewById(R.id.root_view);
       //add 10 TV with text as words.
        /*int i=0;
        while(i<words.size()){
            TextView newWord = new TextView(this);
            newWord.setText(words.get(i));
            rootView.addView(newWord);
            i++;
        }*/
        /*

         */
        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
