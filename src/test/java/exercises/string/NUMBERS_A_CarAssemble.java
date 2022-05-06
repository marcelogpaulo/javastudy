package exercises.string;

public class NUMBERS_A_CarAssemble {

    /*Instructions
    In this exercise you'll be writing code to analyze the production of an assembly line in a car factory. The assembly line's speed can range from 0 (off) to 10 (maximum).

    At its lowest speed (1), 221 cars are produced each hour.
    The production increases linearly with the speed.
    So with the speed set to 4, it should produce 4 * 221 = 884 cars per hour.
    However, higher speeds increase the likelihood that faulty cars are produced, which then have to be discarded.
    The following table shows how speed influences the success rate:

        1 to 4: 100% success rate.
        5 to 8: 90% success rate.
        9: 80% success rate.
        10: 77% success rate.
    You have two tasks.

    TASK 1: Calculate the production rate per hour
    Implement the CarsAssemble.productionRatePerHour() method to calculate the assembly line's production rate per hour, taking into account its current assembly line's speed :

    CarsAssemble.productionRatePerHour(6)
    // => 1193.4

    TASK 2: Calculate the number of working items produced per minute
    Implement the CarsAssemble.workingItemsPerMinute() method to calculate how many working cars are produced per minute:

    CarsAssemble.workingItemsPerMinute(6)
    // => 19*/

    // MY CODE
    private final int carsProduced = 221;
    private final double ninetyPercent = 0.9;
    private final double eightyPercent = 0.8;
    private final double seventySevenPercent = 0.77;

    public double productionRatePerHour(int speed) {
        double result = speed * carsProduced;
        if (speed < 5) return result;
        else if (speed > 4 && speed < 9) return result * ninetyPercent;
        else if (speed == 9) return result * eightyPercent;
        else return result * seventySevenPercent;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }

    // COMMUNITY SOLUTION
//    private static final int NUMBER_IN_HOURS = 221;
//    private double speeds (int speed) {
//        if(1 <= speed && speed <= 4) {return 1.0;}
//        if(5 <= speed && speed <= 8) {return 0.9;}
//        if( 9 == speed) {return 0.8;}
//        if(10 == speed) {return 0.77;}
//        return speed;
//    }
//    public double productionRatePerHour(int speed) {
//        return NUMBER_IN_HOURS * speed * speeds(speed);
//    }
//    public int workingItemsPerMinute(int speed) {
//        return (int)productionRatePerHour(speed) / 60;
//    }
}
