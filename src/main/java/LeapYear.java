public class LeapYear {

    public static boolean check(int year){
        if (isDivisibleBy(year, 100) && !(year % 400 == 0)){
            return false;
        }
        if (year % 4 == 0){
            return true;
        }
        return false;
    }

    private static boolean isDivisibleBy(int year, int factor) {
        return year % factor == 0;
    }
}
