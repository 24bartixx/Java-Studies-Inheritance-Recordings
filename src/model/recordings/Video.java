package model.recordings;

import model.people.Director;

import java.util.ArrayList;
import java.util.Scanner;

public class Video extends Recording {

    private int length;
    private int likes;

    public Video(String title, String des, ArrayList<Director> directors, Resolution res, int length) {
        super(title, des, directors, res, 0, 0, Speed.X1);
        setLength(length);
        setLikes(0);
    }

    public void play() {
        System.out.println("We play a video with the title \"" + getTitle() + "\"! Enjoy watching!");
    }

    public void stop() {
        System.out.println("We have stopped the video with the title \"" + getTitle() + "\"");
    }

    public void changeResolution() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the resolution: ");
        System.out.println("\t1 - 480p");
        System.out.println("\t2 - 576p");
        System.out.println("\t3 - 720p");
        System.out.println("\t4 - 1080p");
        System.out.println("\t5 - 2K");
        System.out.print("Choice: ");

        int option = scanner.nextInt();

        if(option == 1) setResolution(Resolution.P480);
        else if(option == 2) setResolution(Resolution.P576);
        else if(option == 3) setResolution(Resolution.P720);
        else if(option == 4) setResolution(Resolution.P1080);
        else if(option == 5) setResolution(Resolution.K2);

//        switch(option) {
//            case 1: setResolution(Resolution.P480);
//            case 2: setResolution(Resolution.P576);
//            case 3: setResolution(Resolution.P720);
//            case 4: setResolution(Resolution.P1080);
//            case 5: setResolution(Resolution.K2);
//        }

        System.out.println("The resolution has been set to " + getResolution());

    }

    public void changeSpeed() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the playback speed: ");
        System.out.println("\t1 - 0.25");
        System.out.println("\t2 - 0.5");
        System.out.println("\t3 - 1.0");
        System.out.println("\t4 - 1.5");
        System.out.println("\t5 - 2.0");

        System.out.print("Choice: ");
        int option = scanner.nextInt();

        if(option == 1) setSpeed(Speed.X0_25);
        else if(option == 2) setSpeed(Speed.X0_5);
        else if(option == 3) setSpeed(Speed.X1);
        else if(option == 4) setSpeed(Speed.X1_5);
        else if(option == 5) setSpeed(Speed.X2);
//        switch(option) {
//            case 1: setSpeed(Speed.X0_25);
//            case 2: setSpeed(Speed.X0_5);
//            case 3: setSpeed(Speed.X1);
//            case 4: setSpeed(Speed.X1_5);
//            case 5: setSpeed(Speed.X2);
//            default: setSpeed(Speed.X1);
//        }

        System.out.println("The playback speed has been set: " + getSpeed());

    }

    public void download() {
        System.out.println("Downloading the video! You'll have it soon!");
    }

    public void display(int i) {
        System.out.println("\t" + i + ") Video: ");
        System.out.println("\t\tTitle: " + getTitle() );
        System.out.println("\t\tDescription: " + getDescription());
        System.out.print("\t\tDirectors:\n" + getDirectors());
        System.out.println("\t\tLength: " + getLength());
        System.out.println("\t\tLikes: " + getLikes());
    }

    public boolean isVid() { return true; }

    public String getLikesStat() {
        return "The video has " + getLikes() + " likes!\n";
    }

    /** GETTERS AND SETTERS */
    public int getLength() { return length; }

    public void setLength(int length) { this.length = length; }

    public int getLikes() { return likes; }

    public void setLikes(int likes) { this.likes = likes; }
}
