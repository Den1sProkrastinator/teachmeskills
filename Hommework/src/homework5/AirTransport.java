package homework5;

public abstract class AirTransport extends Transport{
    int wingspan;
    int takeOffDistance;

    public AirTransport(int enginePower, int maxSpeed, int weight, TypeOfCar typeOfCar, int wingspan, int takeOffDistance) {
        super(enginePower, maxSpeed, weight, typeOfCar);
        this.wingspan = wingspan;
        this.takeOffDistance = takeOffDistance;
    }

}
