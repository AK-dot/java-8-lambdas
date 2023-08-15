package org.example.examples.chapter5;

import org.example.examples.chapter1.Artist;

import java.util.List;
import java.util.stream.Collectors;

public class StringExamples {

    public static String formatArtists(List<Artist> artists) {
        // BEGIN collectors_joining
        String result =
                artists.stream()
                        .map(Artist::getName)
                        .collect(Collectors.joining(", ", "[", "]"));
        // END collectors_joining
        return result;
    }

    public static String formatArtistsForLoop(List<Artist> artists) {
        // BEGIN for_loop
        StringBuilder builder = new StringBuilder("[");
        for (Artist artist : artists) {
            if (builder.length() > 1)
                builder.append(", ");

            String name = artist.getName();
            builder.append(name);
        }
        builder.append("]");
        String result = builder.toString();
        // END for_loop
        return result;
    }

    
}
