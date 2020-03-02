import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LeapYearShould {

    @Test
    void return_false_if_not_divisible_by_4() {
        assertFalse(LeapYear.check(405));
    }

    @Test
    void return_false_if_not_divisible_by_4_test_2() {
        assertFalse(LeapYear.check(407));
    }

    @Test
    void return_true_if_year_divisible_by_4() {
        assertTrue(LeapYear.check(404));
    }

    @Test
    void return_true_if_year_is_408() {
        assertTrue(LeapYear.check(408));
    }

    @Test
    void return_true_if_year_is_412() {
       assertTrue(LeapYear.check(412));
    }
}
