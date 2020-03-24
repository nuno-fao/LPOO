import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BarTest {
    @Test
    public void happyHour() {
        Bar bar = new StringBar();
        assertFalse(bar.isHappyHour());

        bar.startHappyHour();
        assertTrue(bar.isHappyHour());

        bar.endHappyHour();
        assertFalse(bar.isHappyHour());
    }

}
