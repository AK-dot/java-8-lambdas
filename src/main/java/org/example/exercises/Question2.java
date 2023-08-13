package org.example.exercises;

import org.example.examples.chapter1.Artist;

import java.util.List;
import java.util.stream.Stream;

public class Question2 {

    public static int countBandMembersExternal(List<Artist> artists) {
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMembers();
            totalMembers += members.count();
        }
        return totalMembers;
    }

    public static int countBandMembersInternal(List<Artist> artists) {
        return (int) artists.stream()
                .flatMap(artist -> artist.getMembers())
                .count();
    }
}
