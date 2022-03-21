package homework5;

public class Car extends LandTransport {
    CorpsType corpsType;
    int numberOfPassengers;

    double time;
    double fuelSpend;
    public Car(int enginePower, int maxSpeed, int weight, TypeOfCar typeOfCar, int valuesOfWhiles, double fuelСonsumption, CorpsType corpsType, int numberOfPassengers) {
        super(enginePower, maxSpeed, weight, typeOfCar, valuesOfWhiles, fuelСonsumption);
        this.corpsType = corpsType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String shomMytransport() {
        kilovats(enginePower);
        System.out.println("Я создал легковой автомобиль со соледующими параметрами " +
                "\n тип кузова =" + corpsType +
                "\n колличество пассажиров=" + numberOfPassengers+
                "\n колличество колес=" + valuesOfWhiles +
                "\n расход топлива на 100км=" + fuelСonsumption +"л/100км"+
                "\n мощность двигателя=" + enginePower + " л.с"+
                "\n максимальная скорость=" + maxSpeed +" км/ч"+
                "\n масса=" + weight +" кг"+
                "\n марка машины =" + typeOfCar+
                "\n мощнасть в киловатах="+kilovat+" киловат"
                );
        return myNewTransport;
    }

 public void  spendFuelWhenCarMoveWithMaxSpeed(double time){
        this.time=time;
       spendFuel();
     System.out.println(" за время "+ time+ " ч. автомобиль " + typeOfCar+" двигаясь с максимальной скоростью "+ maxSpeed+" км/ч " +
             "\n проедет " +(time*maxSpeed) + " и израсходует " + fuelSpend );

 }

 private void spendFuel() {

         fuelSpend =  (time*maxSpeed)*(fuelСonsumption/100);
    }


        }



