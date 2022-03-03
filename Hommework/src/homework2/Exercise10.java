package homework2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int evens=0;
        double midlCount=0;
        int x=0;
        int cNew=5;
        double midlCountWithC=0;
        int numberForMidlC=0;

        for (; ; ) {
            System.out.println(" Enter  -n-  length ");
            n = sc.nextInt();
            if (n >=3) {
                break;
            } else {
                System.out.println(" You cannot enter  numbers  less then 3 ");

            }
        }
        int numberArrays[] = new int [n];

        for (int i=0; i<numberArrays.length;i++ ) {
            numberArrays[i]=(int) (Math.random() * (n+1) );
            if(numberArrays[i]%2==0 && numberArrays[i] !=0){
                evens++;
            }
            System.out.print (  numberArrays[i]+" ");
        }
        if (evens ==0 ){
            System.out.println( " array haven't got evens numbers");
        }

        int evenArray[]= new int [evens];
        System.out.println("\n");

        for (int i =0 ; i < numberArrays.length; i++ ){
            int kostyl;
            kostyl= numberArrays[i];
            if (numberArrays[i]%2==0 && numberArrays[i]!=0) {

                for (int c=0; c<evens;c++){
                    evenArray[c]=kostyl;

                }
                System.out.print(    kostyl + " ");

            }

        }
        // среднее арифметическое с нечетными номерами
        for (int i  = 1 ; i< numberArrays.length; i+=2){

          if (numberArrays[i]==0){

          }
          else x++;
           midlCount+=numberArrays[i];
        }
        midlCount=midlCount/x;
        if (midlCount==0){
            System.out.println("\nВот не повезло ((( одни нули ");
        }
         else {
        System.out.println("\nСреднее значение - " + midlCount) ;
         }
         // среднее арифметическое  превосходящих число С
        for(int i: numberArrays){
            if(numberArrays[i]>cNew){
                midlCountWithC+=numberArrays[i];
                numberForMidlC++;
            }

        }
        midlCountWithC=midlCountWithC/numberForMidlC;
        System.out.println("Средне арифметическое, из чисел которые больше  С " + midlCountWithC );

    }
}
