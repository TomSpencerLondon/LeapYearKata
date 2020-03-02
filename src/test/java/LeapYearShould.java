import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearShould {

    @Test
    void return_false_if_not_divisible_by_4() {
        Assertions.assertFalse(LeapYear.isLeap(405));
    }
}
