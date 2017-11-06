package com.example.clareblackburne.wordcounterdebugged;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button wordCountBtn;
    private EditText enterText;
    private WordCounterClass wordCounter;
    private TextView wordResult;
    private TextView results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterText = (EditText) findViewById(R.id.enterText);
        wordCountBtn = (Button) findViewById(R.id.wordCountBtn);
        wordCounter = new WordCounterClass();
        wordResult = (TextView) findViewById(R.id.wordResult);
        results = (TextView) findViewById(R.id.results);

    }

    public void onWordCountButton(View button){
        String textToCount = enterText.getText().toString();
        Log.d(getClass().toString(), textToCount);
        wordCounter.addWords(textToCount);
        int result = wordCounter.countWords();
        wordResult.setText("Total words: " + result);
        wordCounter.keepCount();
        results.setText("Results" + wordCounter.reportResults());
        wordCounter.clearWords();
    }
}