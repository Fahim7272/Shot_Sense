package com.example.shotsense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class On_Drive_Doc extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_drive_doc);

        b1=(Button)findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"On Drive Tutorial",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(On_Drive_Doc.this, On_drive_tutorial.class);
                startActivity(intent);
            }
        });
    }
}