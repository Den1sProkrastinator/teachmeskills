package homework5;

public class Civil extends AirTransport {
    int numbersOfPassengers;
    boolean businessClass;

    public Civil(int enginePower, int maxSpeed, int weight, TypeOfCar typeOfCar,
                 int wingspan, int takeOffDistance, int numbersOfPassengers, boolean businessClass) {
        super(enginePower, maxSpeed, weight, typeOfCar, wingspan, takeOffDistance);
        this.numbersOfPassengers = numbersOfPassengers;
        this.businessClass = businessClass;
    }
    public String shomMytransport() {
        kilovats(enginePower);
        System.out.println("Я создал амолет со соледующими параметрами " +
                "\n размах крыла  =" + wingspan +" м."+
                "\n длинна разгона =" + takeOffDistance +
                "\n колличество пассажиров" + numbersOfPassengers +" шт"+
                "\n бизнес класс " + businessClass +
                "\n мощность двигателя=" + enginePower + " л.с"+
                "\n максимальная скорость=" + maxSpeed +" км/ч"+
                "\n масса=" + weight +" кг"+
                "\n марка машины =" + typeOfCar+
                "\n мощнасть в киловатах="+kilovat+"киловат"
        );
        return myNewTransport;
    }
    public void checkNumbersOfPassengers(int youNumbersOfPassengers){
        if (youNumbersOfPassengers<=numbersOfPassengers){
            System.out.println("все влезли");
        }
        else{
            System.out.println("мало места, возмем на крыло ? ");
        }
    }
}
