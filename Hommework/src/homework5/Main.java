package homework5;

public class Main {
    public static void main(String[] args) {
        Car myCar= new Car(5,230,3000,TypeOfCar.AUDI,6,6
                , CorpsType.SEDAN,5);

     Track myTrack= new Track(40,120,12,TypeOfCar.KALHIDA,6,12,12);

     Civil myCivilPlane = new Civil(1000,600,50,TypeOfCar.МИГ,
             40,400,120,true);

     Military myMilitaryPlane = new Military(1200,3000,30,TypeOfCar.МИГ,
             16,1000,false,1);

     myCar.shomMytransport();
     myCar.spendFuelWhenCarMoveWithMaxSpeed(6);

     myTrack.shomMytransport();
     myTrack.checkCarrying(12);

        myCivilPlane.shomMytransport();
        myCivilPlane.checkNumbersOfPassengers(120);

        myMilitaryPlane.shomMytransport();
        myMilitaryPlane.checkEjectionSeat();
        myMilitaryPlane.checkRockets();


    }


}
