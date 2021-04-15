package com.example.dentistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button servicesBtn = (Button) findViewById(R.id.buttonServices);

        Button contactBtn = (Button) findViewById(R.id.button6);

        servicesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }


        });

    }

    private void openNewActivity() {
        Intent intent = new Intent(this, DisplayServicesActivity.class);
        startActivity(intent);
    }

    ;

}