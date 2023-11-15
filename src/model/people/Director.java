package model.people;

public class Director extends Person {

    private int yearsOfExperience;

    public Director(String name, String lastName, int age, int yearsOfExperience) {
        super(name, lastName, age);
        setYearsOfExperience(yearsOfExperience);
    }

    /** GETTERS AND SETTERS */
    public int getYearsOfExperience() {return yearsOfExperience;}

    public void setYearsOfExperience(int yearsOfExperience) {this.yearsOfExperience = yearsOfExperience;}
}
