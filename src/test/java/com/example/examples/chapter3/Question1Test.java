package com.example.examples.chapter3;

import org.example.examples.chapter1.Album;
import org.example.examples.chapter1.SampleData;
import org.example.exercises.Question1;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.example.examples.chapter1.SampleData.*;
import static org.example.exercises.Question1.*;
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
        assertEquals(Arrays.asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme), getAlbumsWithAtMostThreeTracks(
                Arrays.asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme)));
    }
}
