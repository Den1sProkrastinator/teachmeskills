package homework5;

public abstract class LandTransport  extends  Transport {
       int valuesOfWhiles;
       double fuelСonsumption;

       public LandTransport(int enginePower, int maxSpeed, int weight, TypeOfCar typeOfCar, int valuesOfWhiles,
                            double fuelСonsumption) {
              super(enginePower, maxSpeed, weight, typeOfCar);
              this.valuesOfWhiles = valuesOfWhiles;
              this.fuelСonsumption = fuelСonsumption;
       }


       }







