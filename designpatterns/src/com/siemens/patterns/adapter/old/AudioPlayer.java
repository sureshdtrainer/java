package com.siemens.patterns.adapter.old;

//Existing class implements the MediaPlayer
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            System.out.println("Invalid media. mp3 format supported.");
        }

    }

}
