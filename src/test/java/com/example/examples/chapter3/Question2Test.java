package com.example.examples.chapter3;

import org.example.examples.chapter1.SampleData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.example.examples.chapter3.StreamExercises.countBandMembersExternal;
import static org.example.exercises.chapter3.Question2.countBandMembersInternal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question2Test {

    @Test
    public void internal() {
        assertEquals(4, countBandMembersInternal(
                Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)
        ));
    }
    
    @Test
    public void external() {
        assertEquals(4, countBandMembersExternal(
                Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)
        ));
    }
}
