package org.example.exercises.chapter4;

import org.example.examples.chapter1.Artist;

import java.util.stream.Stream;

public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();
}
