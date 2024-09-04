package com.siemens.patterns.adapter;

//Concrete Class implemeted the new Adapter
public class VlcPlayer implements AdvancedMediaPlayer{

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
    public void playMp4(String fileName) {
        //do nothing
    }

}
