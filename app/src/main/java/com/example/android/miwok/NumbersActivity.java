package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();

        /*//typical
        Word w = new Word("lutti", "one");
        words.add(w);*/

        words.add(new Word("lutti","one"));
        words.add(new Word( "otiiko","two"));
        words.add(new Word("tolookosu", "three"));
        words.add(new Word( "oyyisa","four"));
        words.add(new Word("massokka","five"));
        words.add(new Word( "temmokka","six"));
        words.add(new Word( "kenekaku","seven"));
        words.add(new Word( "kawinta","eight"));
        words.add(new Word("wo’e","nine"));
        words.add(new Word("na’aacha","ten"));


        /**
         * Implementation of ListView with ArrayAdapter
         *
         **/
        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


        /*Find the root view so we can add child views to it
        LinearLayout rootView = (LinearLayout) findViewById(R.id.word_list);

        // Create a variable to keep track of the current index position


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        for (int count = 0;count<words.size();count++){

            // Create a new TextView
            TextView tvNumberText = new TextView(this);

            // Set the text to be word at the current index
            tvNumberText.setText(words.get(count));

            // Add this TextView as another child to the root view of this layout
            rootView.addView(tvNumberText);}*/


    }
}
