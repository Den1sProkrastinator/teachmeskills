package homework5;

public class Track  extends LandTransport{
   int carrying;

    public Track(int enginePower, int maxSpeed, int weight, TypeOfCar typeOfCar, int valuesOfWhiles,
                 double fuelСonsumption, int carrying) {
        super(enginePower, maxSpeed, weight, typeOfCar, valuesOfWhiles, fuelСonsumption);
        this.carrying = carrying;
    }

    public String shomMytransport() {
        kilovats(enginePower);
        System.out.println("Я создал грузовик со соледующими параметрами " +
                "\n грузоподъемность =" + carrying +" т."+
                "\n колличество колес=" + valuesOfWhiles +
                "\n расход топлива на 100км=" + fuelСonsumption +"л/100км"+
                "\n мощность двигателя=" + enginePower + " л.с"+
                "\n максимальная скорость=" + maxSpeed +" км/ч"+
                "\n масса=" + weight +" кг"+
                "\n марка машины =" + typeOfCar+
                "\n мощнасть в киловатах="+kilovat+"киловат"
        );
        return myNewTransport;
    }

    public void checkCarrying(int youCarrying){
        if (youCarrying<=carrying){
            System.out.println("Машина загружена");

        }
        else {
            System.out.println("Нужен грузовик побольше");
        }

    }
}
