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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        //create ArrayList of Word
        ArrayList<Word> words = new ArrayList<>();
        //populate word object.
        words.add(new Word("epe","father",R.drawable.family_father));
        words.add(new Word("eta","mother",R.drawable.family_mother));
        words.add(new Word("angsi","son",R.drawable.family_son));
        words.add(new Word("tune","daughter",R.drawable.family_daughter));
        words.add(new Word("taachi","older brother",R.drawable.family_older_brother));
        words.add(new Word("chaliti","younger brother",R.drawable.family_younger_brother));
        words.add(new Word("tete","older sister",R.drawable.family_older_sister));
        words.add(new Word("koliti","younger sister",R.drawable.family_younger_sister));
        words.add(new Word("amo","grandmother",R.drawable.family_grandmother));
        words.add(new Word("paapa","grandfather",R.drawable.family_grandfather));
        //An wordAdapter with words
        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
