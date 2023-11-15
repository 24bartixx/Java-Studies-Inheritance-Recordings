package data;

import model.Platform;
import model.people.Director;
import model.recordings.Movie;
import model.recordings.Recording;
import model.recordings.Series;
import model.recordings.Video;

import java.util.ArrayList;

public class Data {

    public static Platform getPlatform() {
        Director director1 = new Director("Stefan", "Kowalski", 48, 20);
        Director director2 = new Director("Andrzej", "Pasternak", 37, 15);
        Director director3 = new Director("Władysław", "Wiśniewski", 57, 24);
        Director director4 = new Director("Włodzimierz", "Nowak", 26, 2);
        Director director5 = new Director("Kazimierz", "Mierzejewski", 67, 36);
        Director director6 = new Director("Stanisław", "Wolski", 36, 7);
        Director director7 = new Director("Edward", "Krakowiak", 51, 27);
        Director director8 = new Director("Bolesław", "Spulski", 31, 8);
        Director director9 = new Director("Zbigniew", "Szymański", 66, 44);
        Director director10 = new Director("Henryk", "Zieliński", 22, 3);

        ArrayList<Director> directorsRec1 = new ArrayList<>();
        directorsRec1.add(director4);
        Video video1 = new Video(
                "How to pass collage?",
                "The video is meant for students who want to graduate from a collage. It provides useful tips how to pass classes",
                directorsRec1,
                Recording.Resolution.P1080,
                1456
        );

        ArrayList<Director> directorsRec2 = new ArrayList<>();
        directorsRec2.add(director5);
        directorsRec2.add(director8);
        Video video2 = new Video(
                "How to get first million?",
                "A step by step guide how to become a millionaire",
                directorsRec2,
                Recording.Resolution.P1080,
                2147
        );

        ArrayList<Director> directorsRec3 = new ArrayList<>();
        directorsRec3.add(director1);
        directorsRec3.add(director10);
        Video video3 = new Video(
                "Gameplay 1",
                "We start playing a game together",
                directorsRec3,
                Recording.Resolution.P1080,
                834
        );

        ArrayList<Director> directorsRec4 = new ArrayList<>();
        directorsRec4.add(director2);
        directorsRec4.add(director8);
        directorsRec4.add(director9);
        Movie movie1 = new Movie(
                "Interstellar",
                "Space travel, black holes, physics, SCI-FI",
                directorsRec4,
                Recording.Resolution.K2,
                7134
        );

        ArrayList<Director> directorsRec5 = new ArrayList<>();
        directorsRec5.add(director7);
        Movie movie2 = new Movie(
                "Fight Club",
                "Brad Pitt, my favorite movie",
                directorsRec5,
                Recording.Resolution.K2,
                7536
        );

        ArrayList<Director> directorsRec6 = new ArrayList<>();
        directorsRec6.add(director1);
        directorsRec6.add(director3);
        Movie movie3 = new Movie(
                "Wolf of Wallstreet",
                "The life of brokers going through enormous wealth",
                directorsRec6,
                Recording.Resolution.K2,
                5379
        );

        ArrayList<Director> directorsRec7 = new ArrayList<>();
        directorsRec7.add(director6);
        directorsRec7.add(director5);
        int[] episodes1 = {7 , 13, 13, 13, 16};
        Series series1 = new Series(
                "Braking Bad",
                "The story of Walter White, chemistry teacher and drug boss",
                directorsRec6,
                Recording.Resolution.K2,
                5,
                episodes1
        );

        ArrayList<Director> directorsRec8 = new ArrayList<>();
        directorsRec8.add(director4);
        directorsRec8.add(director3);
        directorsRec8.add(director8);
        int[] episodes2 = {10, 12, 10, 13};
        Series series2 = new Series(
                "Mr. Robot",
                "Psychological show about an introverted hacker with social anxiety disorder recruited to hacktivists group called fsociety",
                directorsRec8,
                Recording.Resolution.K2,
                4,
                episodes2
        );

        Platform platform = new Platform("Netflix");

        platform.addRecording(video1);
        platform.addRecording(video2);
        platform.addRecording(video3);
        platform.addRecording(movie1);
        platform.addRecording(movie2);
        platform.addRecording(movie3);
        platform.addRecording(series1);
        platform.addRecording(series2);

        return platform;

    }



}
