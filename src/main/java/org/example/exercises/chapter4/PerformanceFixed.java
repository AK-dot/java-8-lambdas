package org.example.exercises.chapter4;

import org.example.examples.chapter1.Artist;

import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

public class PerformanceFixed {

    public String getName();

    public Stream<Artist> getMusicians();

    public Stream<Artist> getAllMusicians () {
        return getMusicians()
                .flatMap(artist -> concat(Stream.of(artist), artist.getMembers()));
    }
}
