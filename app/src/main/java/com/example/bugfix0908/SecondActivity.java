package com.example.bugfix0908;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tv_secondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_secondActivity = findViewById(R.id.tv_secondActivity);
        tv_secondActivity.setVisibility(View.VISIBLE);
    }
}
