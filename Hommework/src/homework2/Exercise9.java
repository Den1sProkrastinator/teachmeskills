package homework2;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength=0;
        int sumLeft=0;
        int sumRight=0;

        for ( ;;) {
            System.out.println(" Enter  array  length " );
            arrayLength = sc.nextInt();
            if ( arrayLength>0 && arrayLength%2==0){
               break;
            }
            else {
                System.out.println(" You cannot enter negative  and odd numbers  ");
            }
        }
        int numberArrays[] = new int [arrayLength];

        for (int i=0; i<numberArrays.length;i++ ) {
            numberArrays[i]=(int) (Math.random() * 16);
            System.out.print (numberArrays[i]+" ");
        }
        for (int i = 0 ; i<arrayLength/2;i++){
            sumLeft+=numberArrays[i];
        }
        for (int i =(arrayLength/2); i<arrayLength;i++){
            sumRight+=numberArrays[i];
        }
        if(sumLeft>sumRight){
            System.out.println("\nsum left most than right ");
        }
       else if  ( sumLeft==sumRight ){
            System.out.println("\nsum = right ");
        }
        else if (sumLeft<sumRight) {
            System.out.println("\nsum right  most than left  ");
        }
    }

}
