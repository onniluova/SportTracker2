import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class SportTrackTest {

    @Test
    public void testConstructor() {
        LocalDate date = LocalDate.of(2023, 10, 1);
        SportTrack sportTrack = new SportTrack("Running", 30, date);
        assertEquals("Running", sportTrack.getSportName());
        assertEquals(30, sportTrack.getDuration());
        assertEquals(date, sportTrack.getDate());
    }

    @Test
    public void testGettersAndSetters() {
        SportTrack sportTrack = new SportTrack("Running", 30, LocalDate.of(2023, 10, 1));
        sportTrack.setSportName("Swimming");
        sportTrack.setDuration(45);
        sportTrack.setDate(LocalDate.of(2023, 10, 2));

        assertEquals("Swimming", sportTrack.getSportName());
        assertEquals(45, sportTrack.getDuration());
        assertEquals(LocalDate.of(2023, 10, 2), sportTrack.getDate());
    }

    @Test
    public void testDisplayActivityDetails() {
        LocalDate date = LocalDate.of(2023, 10, 1);
        SportTrack sportTrack = new SportTrack("Running", 30, date);
        sportTrack.displayActivityDetails();
        // This test is for manual verification as it prints to the console.
    }
}