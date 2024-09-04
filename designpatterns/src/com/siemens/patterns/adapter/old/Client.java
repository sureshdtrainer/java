package com.siemens.patterns.adapter.old;

import com.siemens.patterns.adapter.AudioPlayerWithAdapter;
import com.siemens.patterns.adapter.MediaAdapter;

public class Client {

    public static void main(String[] args) {
        
        //AudioPlayer player = new AudioPlayer();
        AudioPlayerWithAdapter player= new AudioPlayerWithAdapter();

        player.play("mp3", "Tum hi ho");

        player.play("mp4", "tum hi ho");
       player.play("vlc", "Tum hi ho");
       player.play("mp4", "Tum hi ho");
    }

}
