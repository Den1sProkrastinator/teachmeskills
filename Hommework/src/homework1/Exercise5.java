package homework1;

public class Exercise5 {
    public static void main(String[] args) {
        double centimetres = 2.54;
        int inches = 20;
        double table=0;
        for (int i = 1; i <= inches; i++) {
            table=i*centimetres;
            System.out.println("In " + i +" inches " + table + " centimetres" );

        }

    }
}
