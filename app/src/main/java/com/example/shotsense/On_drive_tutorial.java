package com.example.shotsense;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class On_drive_tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_drive_tutorial);


        VideoView videoView = findViewById(R.id.on_drive_tutorial);
        String videopath = "android.resource://" + getPackageName() + "/" + R.raw.on_drive;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }
}