package org.example.examples.chapter3;

import org.example.examples.chapter1.Album;
import org.example.examples.chapter1.Artist;

import java.util.HashSet;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class Decisions {

    public static class Imperative {
        //BEGIN origins_of_bands_meth_imp
        public Set<String> originsOfBands(Album album) {
            Set<String> nationalities = new HashSet<>();
            for (Artist artist : album.getMusicianList()) {
                if (artist.getName().startsWith("The")) {
                    String nationality = artist.getNationality();
                    nationalities.add(nationality);
                }
            }
            return nationalities;
        }
        // END origins_of_bands_meth_imp
    }

    public Set<String> originsOfBands(Album album) {
        // BEGIN origins_of_bands
        Set<String> origins = album.getMusicians()
                .filter(artist -> artist.getName().startsWith("The"))
                .map(artist -> artist.getNationality())
                .collect(toSet());
        // END origins_of_bands
        return origins;
    }

}
