package org.example.exercises.chapter4;

import org.example.examples.chapter1.Artist;

import java.util.List;
import java.util.Optional;

public class ArtistFixed {

    private List<Artist> artists;

    public ArtistFixed(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            return Optional.empty();
        }
        return Optional.of(artists.get(index));
    }

    public String getArtistName(int index) {
        Optional<Artist> artist = getArtist(index);
        return artist.map(Artist::getName)
                .orElse("unknown");
    }
}
