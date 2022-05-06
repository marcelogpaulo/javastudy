package exercises.string;

public class CONSTRUCTORS_A_NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    public int speed;
    public int batteryDrain;
    public static int battery;
    private static int distance;

    public CONSTRUCTORS_A_NeedForSpeed(int speedWanted, int batteryDrainWanted) {
        this.speed = speedWanted;
        this.batteryDrain = batteryDrainWanted;
        this.distance = 0;
        this.battery = 100;
        //var car = new NeedForSpeed(this.speed, this.batteryDrain);
    }

    public boolean batteryDrained() {
        if (battery == 0) return true;
        else return false;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            distance += this.speed;
            battery -= batteryDrain;
        }
    }

    public static CONSTRUCTORS_A_NeedForSpeed nitro() {
        return new CONSTRUCTORS_A_NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distanceTrack;

    // TODO: define the constructor for the 'RaceTrack' class
    public RaceTrack(int distance) {
        this.distanceTrack = distance;
    }

    public boolean carCanFinish(CONSTRUCTORS_A_NeedForSpeed car) {
        float batteryCalc = (float) car.battery / car.batteryDrain;
        float distanceCalc = (float) distanceTrack / car.speed;

        if (batteryCalc >= distanceCalc) return true;
        else return false;
    }
}