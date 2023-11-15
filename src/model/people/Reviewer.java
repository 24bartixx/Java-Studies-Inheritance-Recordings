package model.people;

import model.recordings.Recording;
import model.recordings.Video;

import java.util.Random;

public class Reviewer extends Person {

    private int yearsOfExperience;

    public Reviewer(String name, String lastName, int age, int yearsOfExperience) {
        super(name, lastName, age);
        setYearsOfExperience(yearsOfExperience);
    }

    public void reviewRecording(Recording rec) {

        Random random = new Random();
        int reviewsNum = rec.getReviews();
        float rating = rec.getRating();

        rec.setReviews(reviewsNum + 1);
        int reviewerRating = random.nextInt(11);
        float newRating = (rating * reviewsNum + reviewerRating)/(reviewsNum + 1);
        rec.setRating(newRating);

        System.out.println("The reviewer rated this recoding with " + reviewerRating + "!");

    }

    public void giveLike(Video vid) {
        Random random = new Random();
        if(random.nextInt(2) == 1) {
            vid.setLikes(vid.getLikes() + 1);
            System.out.println("The reviewer liked the video! It has " + vid.getLikes() + " likes now!");
        }

    }

    /** GETTERS AND SETTERS */
    public int getYearsOfExperience() {return yearsOfExperience;}

    public void setYearsOfExperience(int yearsOfExperience) {this.yearsOfExperience = yearsOfExperience;}

}
