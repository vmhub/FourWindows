package com.example.seventhree.fourwindows;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class WindowOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_one);
    }

    public void movenext(View view){
        Intent moveNext = new Intent(this,WindowTwo.class);
        startActivity(moveNext);
    }
}
