package com.example.examples.chapter3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.example.exercises.StringExercises.countLowercaseLetters;
import static org.example.exercises.StringExercises.mostLowercaseString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExercisesTest {

    @Test
    public void countLowercaseLettersTest() {
        assertEquals(2, countLowercaseLetters("Add"));
    }

    @Test
    public void mostLowercaseStringTest() {
        assertEquals(Optional.of("Sake"),
                mostLowercaseString(Arrays.asList("Sake", "Ad", "Sun")));
    }
}
