package exercises.string;

import org.junit.jupiter.api.Test;

public class NUMBERS_B_RaindDropConverter {
    /*Instructions
    Your task is to convert a number into a string that contains raindrop sounds corresponding to certain potential factors.
    A factor is a number that evenly divides into another number, leaving no remainder.
    The simplest way to test if a one number is a factor of another is to use the modulo operation.

    The rules of raindrops are that if a given number:
        has 3 as a factor, add 'Pling' to the result.
        has 5 as a factor, add 'Plang' to the result.
        has 7 as a factor, add 'Plong' to the result.
        does not have any of 3, 5, or 7 as a factor, the result should be the digits of the number.
    Examples
        28 has 7 as a factor, but not 3 or 5, so the result would be "Plong".
        30 has both 3 and 5 as factors, but not 7, so the result would be "PlingPlang".
        34 is not factored by 3, 5, or 7, so the result would be "34".*/

    String convert(int number) {

        //MY CODE
        boolean pling = false;
        boolean plang = false;
        boolean plong = false;

        if (number % 3 == 0) pling = true;
        if (number % 5 == 0) plang = true;
        if (number % 7 == 0) plong = true;


        if (pling && plang && plong) return "PlingPlangPlong";
        if (pling && plong) return "PlingPlong";
        if (plang && plong) return "PlangPlong";
        if (pling && plang) return "PlingPlang";
        if (pling) return "Pling";
        if (plang) return "Plang";
        if (plong) return "Plong";
        else return Integer.toString(number);

        //COMMUNITY CODE
//        StringBuilder stringBuilder = new StringBuilder();
//        if (number % 3 == 0){stringBuilder.append("Pling");}
//        if (number % 5 == 0){stringBuilder.append("Plang");}
//        if (number % 7 == 0){stringBuilder.append("Plong");}
//        if (stringBuilder.toString().isEmpty() ) {stringBuilder.append(number);
//        return stringBuilder.toString();
    }

    @Test
    public void teste() {
        double batteryCalc = 100.0 / 20.0;
        double distanceCalc = 16.0 / 3.0;

        if (batteryCalc >= distanceCalc) {
            System.out.println("é igual mas não deveria");
            System.out.println("Valor de batteryCalc: " + batteryCalc + "\n" + "Valor de distanceCalc: " + distanceCalc);
        }
        else System.out.println("Valor de batteryCalc: " + batteryCalc + "\n" + "Valor de distanceCalc: " + distanceCalc);
    }

}
