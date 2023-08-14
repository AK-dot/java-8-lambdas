package org.example.examples.chapter4;

public class MusicalCarriage implements Carriage, Jukebox {

    @Override
    public String rock() {
        return Carriage.super.rock();
    }
}
