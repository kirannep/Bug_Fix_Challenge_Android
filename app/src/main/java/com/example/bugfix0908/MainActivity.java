package com.example.bugfix0908;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnGoToActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGoToActivity = findViewById(R.id.btn_go_to_activity);
        btnGoToActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextActivity();
            }
        });
    }

    private void goToNextActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
