package sam.ui;

import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlineTest {
    @Test
    public void toString_validDate_formatsCorrectly() {
        Deadline d = new Deadline("Submit assignment", "1/9/2025 1800");
        String expected = "[D][ ] Submit assignment (by: Sep 1 2025, 6:00pm)";
        assertEquals(expected, d.toString());
    }

    @Test
    public void toString_invalidDate_showsInvalid() {
        Deadline d = new Deadline("Submit assignment", "invalid-date");
        String expected = "[D][ ] Submit assignment (by: invalid date)";
        assertEquals(expected, d.toString());
    }
}