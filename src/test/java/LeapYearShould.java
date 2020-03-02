import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LeapYearShould {

    @Test
    void return_false_if_not_divisible_by_4() {
        Assertions.assertFalse(LeapYear.isLeap(405));
    }

    @Test
    void return_false_if_not_divisible_by_4_test_2() {
        Assertions.assertFalse(LeapYear.isLeap(407));
    }

    @Test
    void return_true_if_year_divisible_by_4() {
        Assertions.assertTrue(LeapYear.isLeap(404));
    }
}
