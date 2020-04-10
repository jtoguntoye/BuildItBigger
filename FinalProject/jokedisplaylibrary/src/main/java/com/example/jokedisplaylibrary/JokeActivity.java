package com.example.jokedisplaylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static String JOKE_TAG = "JOKE TAG";
    private String jokeString=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeView  = findViewById(R.id.text_joke);
        Intent jokePassed = getIntent();
        if(jokePassed.getStringExtra(JOKE_TAG)!=null){
            jokeString =jokePassed.getStringExtra(JOKE_TAG);
        }

        jokeView.setText(jokeString);

    }
}
