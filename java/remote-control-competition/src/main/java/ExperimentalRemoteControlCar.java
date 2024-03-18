public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int speed = 20;
    private int distance = 0;

    public void drive() {
        this.distance += this.speed;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }
}
