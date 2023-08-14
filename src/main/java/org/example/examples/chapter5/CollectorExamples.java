package org.example.examples.chapter5;

import org.example.examples.chapter1.Album;
import org.example.examples.chapter1.Artist;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class CollectorExamples {

    public void toCollectionTreeSet() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        // BEGIN TO_COLLECTION_TREESET
        stream.collect(toCollection(TreeSet::new));
        // END TO_COLLECTION_TREESET
    }

    public Optional<Artist> biggestGroup(Stream<Artist> artists) {
        Function<Artist, Long> getCount = artist -> artist.getMembers().count();
        return artists.collect(maxBy(comparing(getCount)));
    }

    public Map<Boolean, List<Artist>> bandsAndSolo(Stream<Artist> artists) {
        return artists.collect(partitioningBy(artist -> artist.isSolo()));
    }

    public Map<Boolean, List<Artist>> bandsAndSoloRef(Stream<Artist> artists) {
        return artists.collect(partitioningBy(Artist::isSolo));
    }

    public Map<Artist, List<Album>> albumsByArtist(Stream<Album> albums) {
        return albums.collect(groupingBy(album -> album.getMainMusician()));
    }
}
