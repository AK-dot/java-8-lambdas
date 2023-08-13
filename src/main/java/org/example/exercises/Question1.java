package org.example.exercises;

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
         List<String> nationality = artists.stream()

                .map(artist -> artist.getNationality())
                .collect(toList());

         List<String> name = artists.stream()
                 .map(artist -> artist.getName())
                 .collect(toList());
         return Stream.of( name, nationality)
                 .flatMap(strings -> strings.stream())
                 .collect(toList());
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        return input.stream()
                .flatMap(album -> album.getTrackList())
                .filter(trackList -> trackList.size() <= 3)
                .collect(toList());
    }


}
