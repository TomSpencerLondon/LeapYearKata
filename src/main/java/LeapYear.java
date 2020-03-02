public class LeapYear {

    public static boolean check(int year){
        if (isDivisibleBy(year, 100) && !(isDivisibleBy(year, 400))){
            return false;
        }
        if (isDivisibleBy(year, 4)){
            return true;
        }
        return false;
    }

    private static boolean isDivisibleBy(int year, int factor) {
        return year % factor == 0;
    }
}
