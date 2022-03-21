package homework5;

public abstract class Transport {
    int enginePower;
    int maxSpeed;
    int weight;
    TypeOfCar typeOfCar;
    double kilovat=0;
    String myNewTransport;

    public int getEnginePower() {
        return enginePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public TypeOfCar getTypeOfCar() {
        return typeOfCar;
    }

    public double getKilovat() {
        return kilovat;
    }

    public String getMyNewTransport() {
        return myNewTransport;
    }

    public Transport(int enginePower, int maxSpeed, int weight, TypeOfCar typeOfCar) {
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.typeOfCar = typeOfCar;
    }

    public  String shomMytransport(){
        kilovats(enginePower);
        return myNewTransport;


    }


     public void kilovats(int enginePower){
        this.enginePower=enginePower;
        kilovat=(double)enginePower*0.74;
    }

}
