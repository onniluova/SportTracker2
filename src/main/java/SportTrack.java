import java.time.LocalDate;

public class SportTrack {
    private String sportName;
    private int duration; // duration in minutes
    private LocalDate date;

    // Constructor
    public SportTrack(String sportName, int duration, LocalDate date) {
        this.sportName = sportName;
        this.duration = duration;
        this.date = date;
    }

    // Getters and Setters
    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // Method to display activity details
    public void displayActivityDetails() {
        System.out.println("Sport: " + sportName);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Date: " + date);
    }
}