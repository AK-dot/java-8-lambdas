package org.example.examples.chapter3;

import org.example.examples.chapter1.Album;
import org.example.examples.chapter1.Track;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;
import static org.example.examples.chapter1.SampleData.albums;

public class Refactor {

    public static interface LongTrackFinder {
        public Set<String> findLongTracks(List<Album> albums);
    }

    public static class Step0 implements LongTrackFinder {
        // BEGIN findLongTrack_0
        public Set<String> findLongTracks(List<Album> albums) {
            Set<String> trackNames = new HashSet<>();
            for (Album album : albums) {
                for (Track track : album.getTrackList()) {
                    if (track.getLength() > 60) {
                        String name = track.getName();
                        trackNames.add(name);
                    }
                }
            }
            return trackNames;
        }
        // END findLongTrack_0
    }

    public static class Step1 implements LongTrackFinder {
        // BEGIN findLongTrack_1
        public Set<String> findLongTracks(List<Album> albums) {
            Set<String> trackNames = new HashSet<>();
            albums.stream()
                    .forEach(album -> {
                        album.getTracks()
                                .forEach(track -> {
                                    if (track.getLength() > 60) {
                                        String name = track.getName();
                                        trackNames.add(name);
                                    }
                                });
                    });
            return trackNames;
        }
        // END findLongTrack_1
    }

    public static class Step2 implements LongTrackFinder {
        // BEGIN findLongTrack_2


        @Override
        public Set<String> findLongTracks(List<Album> albums) {
            Set<String> trackNames = new HashSet<>();
            albums.stream()
                    .forEach(album -> {
                        album.getTracks()
                                .filter(track -> track.getLength() > 60)
                                .map(track -> track.getName())
                                .forEach(name -> trackNames.add(name));
                    });
            return trackNames;
        }
        // END findLongTrack_2
    }


    public static class Step3 implements LongTrackFinder {
        // BEGIN findLongTrack_3
        public Set<String> findLongTracks(List<Album> albums) {
            Set<String> trackNames = new HashSet<>();

            albums.stream()
                    .flatMap(album -> album.getTracks())
                    .filter(track -> track.getLength() > 60)
                    .map(track -> track.getName())
                    .forEach(name -> trackNames.add(name));

            return trackNames;
        }
        // END findLongTrack_3
    }

    public static class Step4 implements LongTrackFinder {
        // BEGIN findLongTrack_4

        @Override
        public Set<String> findLongTracks(List<Album> albums) {
            return albums.stream()
                    .flatMap(album -> album.getTracks())
                    .filter(track -> track.getLength() > 60)
                    .map(track -> track.getName())
                    .collect(toSet());
        }
        // END findLongTrack_4
    }

}
