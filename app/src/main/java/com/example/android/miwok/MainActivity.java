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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        //set event listener on number view object.
        TextView numberTv = findViewById(R.id.numbers);
        numberTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(),NumbersActivity.class);
               startActivity(intent);
            }
        });
        //set event listener on Family members.
        TextView FMTv = findViewById(R.id.family);
        FMTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FamilyActivity.class);
                startActivity(intent);
            }
        });
        //set event on colors.
        TextView ColorsTV = findViewById(R.id.colors);
        ColorsTV.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "a click on Colors", Toast.LENGTH_SHORT).show();
            }
        });
        //set on click event on Phrases.
        TextView PhrasesTv = findViewById(R.id.phrases);
        PhrasesTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "a click on Phrases", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
