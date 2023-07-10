package com.example.shotsense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    Button cover_drive;
    Button straight_drive;
    Button on_drive;
    Button cut_shot;
    Button hook_shot;
    Button flick_shot;
    Button pull_shot;
    Button sweep_shot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        cover_drive=(Button)findViewById(R.id.cover_drive_bt);
        cover_drive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cover Drive",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu.this, Cover_Drive_Doc.class);
                startActivity(intent);
            }
        });




        straight_drive=(Button)findViewById(R.id.straight_drive_bt);
        straight_drive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Straight Drive",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu.this, Straight_Drive_Doc.class);
                startActivity(intent);
            }
        });


        on_drive=(Button)findViewById(R.id.on_drive_bt);
        on_drive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"On Drive",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu.this, On_Drive_Doc.class);
                startActivity(intent);
            }
        });




        cut_shot=(Button)findViewById(R.id.cut_shot_bt);
        cut_shot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cut Shot",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu.this, Cut_Shot_Doc.class);
                startActivity(intent);
            }
        });


        hook_shot=(Button)findViewById(R.id.hook_shot_bt);
        hook_shot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hook Shot",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu.this, Hook_Shot_Doc.class);
                startActivity(intent);
            }
        });






        flick_shot=(Button)findViewById(R.id.flick_shot_bt);
        flick_shot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Flick Shot",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu.this, Flick_Shot_Doc.class);
                startActivity(intent);
            }
        });





        pull_shot=(Button)findViewById(R.id.pull_shot_bt);
        pull_shot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Pull Shot",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu.this, Pull_Shot_Doc.class);
                startActivity(intent);
            }
        });





        sweep_shot=(Button)findViewById(R.id.sweep_shot_bt);
        sweep_shot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Sweep Shot",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu.this, Sweep_Shot_Doc.class);
                startActivity(intent);
            }
        });






    }
}