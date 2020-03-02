import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LeapYearShould {

    @Test
    void return_false_if_not_divisible_by_4() {
        assertFalse(LeapYear.isLeap(405));
    }

    @Test
    void return_false_if_not_divisible_by_4_test_2() {
        assertFalse(LeapYear.isLeap(407));
    }

    @Test
    void return_true_if_year_divisible_by_4() {
        assertTrue(LeapYear.isLeap(404));
    }

    @Test
    void return_true_if_year_is_408() {
        assertTrue(LeapYear.isLeap(408));
    }
}
