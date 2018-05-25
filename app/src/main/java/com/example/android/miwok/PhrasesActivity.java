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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        //ArrayList of Word
        ArrayList<Word> phrases = new ArrayList<>();
        //add phrases in Arraylist
        phrases.add(new Word("minto wuksus","Where are you?"));
        phrases.add(new Word("tinne oyaase'ne","What is your name?"));
        phrases.add(new Word("oyaaset","My name is..."));
        phrases.add(new Word("How are you feeling?","michekses"));

        phrases.add(new Word("I'm feeling good.","kuchi achit"));
        phrases.add(new Word("Are you coming?","eenes'aa?"));
        phrases.add(new Word("Yes,I'm coming.","hee'eenem"));
        phrases.add(new Word("I'm coming.","eenem"));

        phrases.add(new Word("Let's go","yoowutis"));
        phrases.add(new Word("come here.","enninem"));
        phrases.add(new Word("ki hal?","How are you??"));
        phrases.add(new Word("kata gel chhela?","where had you gone?"));
        //adapter
        WordAdapter adapter = new WordAdapter(this,phrases);
        //Adpterview
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
