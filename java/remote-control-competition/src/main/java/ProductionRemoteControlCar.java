class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int speed = 10;
    private int distance = 0;
    private int numberOfVictories = 0;

    public void drive() {
        this.distance += this.speed;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar car) {
        return car.getNumberOfVictories() - this.getNumberOfVictories();
    }
}
