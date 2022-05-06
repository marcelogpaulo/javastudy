package exercises.string;

import org.junit.jupiter.api.Test;

public class CLASSES_A_ElonsToyCar {


    private int distance;
    private int battery = 100;

    public static CLASSES_A_ElonsToyCar buy() {
        return new CLASSES_A_ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) return "Battery empty";
        else return "Battery at " + battery + "%";
    }

    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery -= 1;
        }
    }
}
