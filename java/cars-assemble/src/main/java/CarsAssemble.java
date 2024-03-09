public class CarsAssemble {

    private int producationRatePerHour = 221;

    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
            return speed * producationRatePerHour;
        } else if (speed >= 5 && speed <= 8) {
            return speed * producationRatePerHour * 0.9;
        } else if (speed == 9) {
            return speed * producationRatePerHour * 0.8;
        } else {
            return speed * producationRatePerHour * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) Math.floor(productionRatePerHour(speed) / 60);
    }
}
