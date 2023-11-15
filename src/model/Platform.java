package model;

import model.recordings.Recording;

import java.util.ArrayList;

public class Platform {

    private int recordingsCount;
    private String name;
    private ArrayList<Recording> recordings;

    public Platform(String name) {
        setName(name);
        setRecordingsCount(0);
        setRecordings(new ArrayList<>());
    }

    public void addRecording(Recording rec) {
        recordings.add(rec);
        recordingsCount += 1;
    }

    public void displayPlatform() {
        System.out.println("\nPlatform name: " + getName());
        int i = 1;
        for(Recording rec: recordings) {
            rec.display(i);
            i++;
        }
        System.out.println();
        System.out.println();
    }

    /** GETTERS AND SETTERS */
    public int getRecordingsCount() {return recordingsCount;}

    public void setRecordingsCount(int recordingsCount) {this.recordingsCount = recordingsCount;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public ArrayList<Recording> getRecordings() { return recordings; }

    public void printRecording() {
        System.out.println("Recordings of " + getName());
        int i = 1;
        for(Recording rec: recordings) {
            System.out.println("\t" + i + ") " + rec.getTitle());
        }
    }

    public void setRecordings(ArrayList<Recording> recordings) {this.recordings = recordings;}
}
