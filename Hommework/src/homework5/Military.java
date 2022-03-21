package homework5;

public class Military extends AirTransport{
    boolean ejectionSeat;
    int rockets;

    public Military(int enginePower, int maxSpeed, int weight, TypeOfCar typeOfCar, int wingspan,
                    int takeOffDistance, boolean ejectionSeat, int rockets) {
        super(enginePower, maxSpeed, weight, typeOfCar, wingspan, takeOffDistance);
        this.ejectionSeat = ejectionSeat;
        this.rockets = rockets;
    }
    public String shomMytransport() {
        kilovats(enginePower);
        System.out.println("Я создал истребитель со соледующими параметрами " +
                "\n размах крыла  =" + wingspan +" м."+
                "\n длинна разгона =" + takeOffDistance +
                "\n колличество ракет" + rockets +" шт"+
                "\n наличие кресла-катапулльты" + ejectionSeat +
                "\n мощность двигателя=" + enginePower + " л.с"+
                "\n максимальная скорость=" + maxSpeed +" км/ч"+
                "\n масса=" + weight +" кг"+
                "\n марка машины =" + typeOfCar+
                "\n мощнасть в киловатах="+kilovat+"киловат"
        );
        return myNewTransport;
    }
    public void checkRockets(){
        if (rockets>0){
            System.out.println("ракета пошла");
        }
        else {
            System.out.println("ракет нет(( ");
        }

    }

     public  void checkEjectionSeat(){
        if (ejectionSeat==true){
            System.out.println("катапультирование прошло успешно");
        }
        else {
            System.out.println("нет такой системы ");
        }
     }
}
