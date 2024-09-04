package com.siemens.patterns.adapter;

//Concrete class which implements the new Adapter
public class Mp4Player implements AdvancedMediaPlayer {

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
    public void playVlc(String fileName) {
        //do nothing
    }

}
