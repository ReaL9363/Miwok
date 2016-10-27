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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    TextView tvNumbers,tvFamily,tvColors,tvPhrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        componentInit();
        addListener();
    }

    private void addListener() {
        tvNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Numbers Activity ", Toast.LENGTH_SHORT).show();
            }
        });
        tvFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Family Activity", Toast.LENGTH_SHORT).show();
            }
        });
        tvColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Colors Activity ", Toast.LENGTH_SHORT).show();
            }
        });
        tvPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Phrases Activity", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void componentInit() {
        tvNumbers=(TextView) findViewById(R.id.numbers);
        tvFamily=(TextView) findViewById(R.id.family);
        tvColors=(TextView) findViewById(R.id.colors);
        tvPhrases=(TextView) findViewById(R.id.phrases);
    }


}
