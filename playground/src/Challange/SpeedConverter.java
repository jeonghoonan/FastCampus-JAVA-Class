package Challange;

/**
 * Speed Converter
 * method called toMilesPerHour that has 1 paramter of type dobule with the name kilometersPerHour
 * this method needs to return the rounded value of the calculation of type loong
 * if the parameter kilometersPerHour is less than 0, method toMilesPerHour needs to reutrn -1
 * if it is positive, calculate the value of miles per hour, rounded it and return it
 */

//class SpeedConverter {
//    public static double toMilesPerHour(long kilometersPerHour) {
//        if (kilometersPerHour < 0) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//    public static double convert(long speed) {
//
//    }
//
//    public static void main(String[] args) {
//        double speed = toMilesPerHour(1);
//    }
//}
//
//public class SpeedConverter {
//    public static void main(String[] args) {
//        toMilesPerHour(1.6);
//        toMilesPerHour(0);
//        toMilesPerHour(25.42);
//        toMilesPerHour(3.2);
//        System.out.println("");
//    }
    // my solution
//    public static long toMilesPerHour(double kilometersPerHour) {
        // 1 mile = 1.60934km  / 1km = 0.621371 mile
//        double result;
//        double x = -1;
//        result = kilometersPerHour * 0.621371;
//        if (kilometersPerHour > 0) {
//            System.out.println((int)Math.ceil(result));
//        } else
//            System.out.println((int)x);
//        return -1;
//    }
//    // Tim
//    public static long toMilesPerHour1(double kilometersPerHour1) {
//        if(kilometersPerHour1 < 0) {
//            return -1;
//        }
//        long milesPerHour1 = Math.round(kilometersPerHour1 / 1.60934);
//        return milesPerHour1;
//    }
//    // Bae's
//    public static long toMilesPerHour2(double kilometersPerHour2) {
//        if(kilometersPerHour2 < 0) {
//            return -1;
//        }
//        return Math.round(kilometersPerHour2 / 1.60934);
//    }
//}

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else{
            return Math.round(kilometersPerHour / 1.60934);
        }
    }
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(24));
    }
}