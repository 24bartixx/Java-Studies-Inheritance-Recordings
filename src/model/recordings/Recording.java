package model.recordings;

import model.people.Director;

import java.util.ArrayList;

public abstract class Recording {

    public enum Resolution {
        P480, P576, P720, P1080, K2, K4
    }

    public enum Speed {
        X0_25, X0_5, X1, X1_5, X2
    }

    private String title;
    private String description;
    private ArrayList<Director> directors;
    private Resolution resolution;
    private int reviews;
    private float rating;
    private Speed speed;

    public Recording(String title, String des, ArrayList<Director> directors, Resolution res, int reviews, int rating, Speed speed) {
        setTitle(title);
        setDescription(des);
        setDirectors(directors);
        // setResolution(res);
        setReviews(reviews);
        setRating(rating);
        // setSpeed(speed);
    }

    public abstract void play();
    public abstract void stop();
    public abstract void changeResolution();
    public abstract void changeSpeed();
    public abstract void download();
    public abstract void display(int i);

    public void getRatingAndReviews() {
        System.out.printf("The recording has the rating of %.2f with " + getReviews() + " reviews!%n", getRating());
    }

    public boolean isVid() { return false; }

    public String getLikesStat() {
        return "";
    }

    /** SETTERS AND GETTERS */
    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getDirectors() {
        String directorsStr = "";
        for(Director director: directors) {
            directorsStr += "\t\t\t" + director.getName() + " " + director.getLastName() + "\n";
        }
        return directorsStr;
    }

    public void setDirectors(ArrayList<Director> directors) {this.directors = directors;}

    public String getResolution() {
        return switch (resolution) {
            case Resolution.P480 -> "480p";
            case Resolution.P576 -> "576p";
            case Resolution.P720 -> "720p";
            case Resolution.P1080 -> "1080p";
            case Resolution.K2 -> "2K";
            case Resolution.K4 -> "4K";
        };
    }

    public void setResolution(Resolution resolution) {this.resolution = resolution;}

    public int getReviews() {return reviews;}

    public void setReviews(int reviews) {this.reviews = reviews;}

    public float getRating() {return rating;}

    public void setRating(float rating) {this.rating = rating;}

    public String getSpeed() {

        return switch(speed) {
            case Speed.X0_25 -> "0.25";
            case Speed.X0_5  -> "0.5";
            case Speed.X1    -> "1.0";
            case Speed.X1_5  -> "1.5";
            case Speed.X2    -> "2.0";
        };
    }

    public void setSpeed(Speed speed) { this.speed = speed;}

}
