package com.example.examples.chapter3;

import org.example.examples.chapter1.SampleData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.example.examples.chapter1.SampleData.*;
import static org.example.exercises.chapter3.Question1.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question1Test {

    @Test
    public void addUpTest() {
        assertEquals(10, addUp(Stream.of(1, 2, 3, 4)) );
    }

    @Test
    public void getNamesAndOriginsTest() {
        assertEquals(Arrays.asList("John Coltrane", "US"), getNamesAndOrigins(
                Arrays.asList(SampleData.johnColtrane)
        ));
    }

    @Test
    public void getAlbumsWithAtMostThreeTracksTest() {
        assertEquals(Arrays.asList( sampleShortAlbum, aLoveSupreme),
                getAlbumsWithAtMostThreeTracks(
                Arrays.asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme)));
    }
}
