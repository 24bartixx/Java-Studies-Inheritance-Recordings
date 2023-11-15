import data.Data;
import model.Platform;
import model.people.Reviewer;
import model.recordings.Recording;
import model.recordings.Video;

import javax.sound.midi.SysexMessage;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Platform platform = Data.getPlatform();
        // platform.displayPlatform();

        int[] indexes = {0, 4, 7};
        for(int index: indexes) {
            recordingDemo(platform, index);
            reviewDemo(platform, index);
        }

    }

    private static void recordingDemo(Platform platform, int index) {
        Recording rec = platform.getRecordings().get(index);
        System.out.println();
        System.out.println();
        rec.play();
        rec.changeResolution();
        rec.changeSpeed();
        rec.stop();
        rec.download();
        System.out.println();
    }

    private static void reviewDemo(Platform platform, int index) {

        Reviewer reviewer = new Reviewer("Ambroży", "Wasilewski", 37, 11);
        Recording rec = platform.getRecordings().get(index);
        Random random = new Random();

        for(int i = 0; i < random.nextInt(10) + 1; i++) {
            reviewer.reviewRecording(rec);
            if(rec.isVid()) reviewer.giveLike((Video) rec);
        }

        System.out.println();
        rec.getRatingAndReviews();
        System.out.print(rec.getLikesStat());

    }

}