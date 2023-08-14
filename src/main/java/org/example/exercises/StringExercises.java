package org.example.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.lang.Math.max;

public class StringExercises {

    // Question 6
    public static int countLowercaseLetters(String string) {
        return (int) string.chars()
                .filter(Character::isLowerCase)
                .count();
    }

    // Question 7
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(StringExercises::countLowercaseLetters));
    }

}
