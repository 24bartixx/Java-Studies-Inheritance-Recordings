package model.recordings;

import model.people.Director;

import java.util.ArrayList;
import java.util.Scanner;

public class Series extends Recording{

    private int seasons;
    private int[] episodes;

    public Series(String title, String des, ArrayList<Director> directors, Recording.Resolution res, int seasons, int[] episodes) {
        super(title, des, directors, res, 0, 0, Recording.Speed.X1);
        setSeasons(seasons);
        setEpisodes(episodes);
    }

    public void play() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("We play the series entitled \"" + getTitle() + "\"");

        System.out.print("Enter the season number (there are " + getSeasons() + " seasons available): ");
        int season = scanner.nextInt();

        System.out.print("Enter the episode number (there are  " + episodes[season-1] + " episodes available in this season): ");
        int episode = scanner.nextInt();

        System.out.println("\tSeason: " + season + "\t\tEpisode:" + episode);
    }

    public void stop() {
        System.out.println("We have stopped the episode of the series entitled \"" + getTitle() + "\"");
    }

    public void changeResolution() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the resolution: ");
        System.out.println("\t1 - 576p");
        System.out.println("\t2 - 720p");
        System.out.println("\t3 - 1080p");
        System.out.println("\t4 - 2K");
        System.out.println("\t5 - 4K");
        System.out.print("Choice: ");

        int option = scanner.nextInt();

        if(option == 1) setResolution(Resolution.P576);
        else if(option == 2) setResolution(Resolution.P720);
        else if(option == 3) setResolution(Resolution.P1080);
        else if(option == 4) setResolution(Resolution.K2);
        else if(option == 5) setResolution(Resolution.K4);

//        switch(option) {
//            case 1: setResolution(Recording.Resolution.P576);
//            case 2: setResolution(Recording.Resolution.P720);
//            case 3: setResolution(Recording.Resolution.P1080);
//            case 4: setResolution(Recording.Resolution.K2);
//            case 5: setResolution(Recording.Resolution.K4);
//        }

        System.out.println("The resolution has been set to " + getResolution());

    }

    public void changeSpeed() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the playback speed: ");
        System.out.println("\t1 - 0.5");
        System.out.println("\t2 - 1.0");
        System.out.println("\t3 - 1.5");
        System.out.println("\t4 - 2.0");

        System.out.print("Choice: ");
        int option = scanner.nextInt();

        if(option == 1) setSpeed(Speed.X0_5);
        else if(option == 2) setSpeed(Speed.X1);
        else if(option == 3) setSpeed(Speed.X1_5);
        else if(option == 4) setSpeed(Speed.X2);

//        switch(option) {
//            case 1: setSpeed(Recording.Speed.X0_5);
//            case 2: setSpeed(Recording.Speed.X1);
//            case 3: setSpeed(Recording.Speed.X1_5);
//            case 4: setSpeed(Recording.Speed.X2);
//        }

        System.out.println("The playback speed has been set: " + getSpeed());

    }

    public void download() {
        System.out.println("Downloading the series! It's going to take forever!");
    }

    public void display(int i) {
        System.out.println("\t" + i + ") Video: ");
        System.out.println("\t\tTitle: " + getTitle() );
        System.out.println("\t\tDescription: " + getDescription());
        System.out.print("\t\tDirectors:\n" + getDirectors());
        System.out.println("\t\tSeasons: " + getSeasons());
        System.out.print("\t\tEpisodes: ");
        for(int episode: episodes) System.out.print(episode + " ");

    }

    /** GETTERS AND SETTERS */
    public int getSeasons() { return seasons; }

    public void setSeasons(int seasons) {this.seasons = seasons;}

    public int[] getEpisodes() {return episodes;}

    public void setEpisodes(int[] episodes) {this.episodes = episodes;}
}
