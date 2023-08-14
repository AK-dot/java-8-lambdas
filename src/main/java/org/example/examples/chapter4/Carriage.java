package org.example.examples.chapter4;

public interface Carriage {

    public default String rock() {
        return " ... from side to side";
    }
}
