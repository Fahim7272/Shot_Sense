package com.example.shotsense;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Pull_shot_tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_shot_tutorial);

        VideoView videoView = findViewById(R.id.pull_shot_tutorial);
        String videopath = "android.resource://" + getPackageName() + "/" + R.raw.pull_shot;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();

    }
}