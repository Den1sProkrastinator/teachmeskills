package homework1;

  public class Exercise2 {
      public static void main(String[] args) {

          int timeOfAmoebaDivision = 3;
          int amoebasCount = 1;
          int hours = 24;
          int allAmoebus=0;

          for (int i = timeOfAmoebaDivision; i <= hours;i+=timeOfAmoebaDivision ) {
              amoebasCount*=2;
              allAmoebus=amoebasCount;

              System.out.println( allAmoebus + " amoebas in " + i + " hours");
          }
          System.out.println("Total  amount " + allAmoebus );

      }
  }
