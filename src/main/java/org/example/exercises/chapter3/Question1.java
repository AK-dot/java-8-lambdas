package org.example.exercises.chapter3;

import org.example.examples.chapter1.Album;
import org.example.examples.chapter1.Artist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Question1 {

    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (acc, result) -> acc + result);
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
         return artists.stream()
                 .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
                 .collect(toList());
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        return input.stream()
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(toList());
    }


}
