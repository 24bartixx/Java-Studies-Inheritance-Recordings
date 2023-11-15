package model.recordings;

import model.people.Director;

import java.util.ArrayList;
import java.util.Scanner;

public class Movie extends Recording {

    private int length;

    public Movie(String title, String des, ArrayList<Director> directors, Resolution res, int length) {
        super(title, des, directors, res, 0, 0, Speed.X1);
        setLength(length);
    }

    public void play() {
        System.out.println("We are playing a feature-length film entitled \"" + getTitle() + "\"! Enjoy!");
    }

    public void stop() {
        System.out.println("We have stopped a feature-length film entitled \"" + getTitle() + "\"");
    }

    public void changeResolution() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the resolution: ");
        System.out.println("\t1 - 720p");
        System.out.println("\t2 - 1080p");
        System.out.println("\t3 - 2K");
        System.out.println("\t4 - 4K");
        System.out.print("Choice: ");

        int option = scanner.nextInt();

        if(option == 1) setResolution(Resolution.P720);
        if(option == 2) setResolution(Resolution.P1080);
        if(option == 3) setResolution(Resolution.K2);
        if(option == 4) setResolution(Resolution.K4);

//        switch(option) {
//            case 1: setResolution(Resolution.P720);
//            case 2: setResolution(Resolution.P1080);
//            case 3: setResolution(Resolution.K2);
//            case 4: setResolution(Resolution.K4);
//            default: setResolution(Resolution.P1080);
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
//            case 1: setSpeed(Speed.X0_5);
//            case 2: setSpeed(Speed.X1);
//            case 3: setSpeed(Speed.X1_5);
//            case 4: setSpeed(Speed.X2);
//            default: setSpeed(Speed.X1);
//        }

        System.out.println("The playback speed has been set to " + getSpeed());
    }

    public void download() {
        System.out.println("Downloading the movie! It might take a while!");
    }

    public void display(int i) {
        System.out.println("\t" + i + ") Movie: ");
        System.out.println("\t\tTitle: " + getTitle() );
        System.out.println("\t\tDescription: " + getDescription());
        System.out.print("\t\tDirectors:\n" + getDirectors());
        System.out.println("\t\tLength: " + getLength());

    }

    /** GETTERS AND SETTERS */
    public int getLength() {return length;}

    public void setLength(int length) {this.length = length;}
}
