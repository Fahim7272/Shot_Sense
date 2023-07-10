package com.example.shotsense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pull_Shot_Doc extends AppCompatActivity {


    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_shot_doc);

        b1=(Button)findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"PULL SHOT TUTORIAL",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Pull_Shot_Doc.this, Pull_shot_tutorial.class);
                startActivity(intent);
            }
        });
    }
}