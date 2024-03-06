public class Lasagna {
    private int expectedMinutesInOven = 40;
    private int layerPreparationTime = 2;

    public int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * layerPreparationTime;
    }

    public int totalTimeInMinutes(int layers, int actualMinutesInOven) {
        return preparationTimeInMinutes(layers) + actualMinutesInOven;
    }
}
