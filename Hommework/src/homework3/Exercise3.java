package homework3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize;


        for (; ; ) {
            System.out.println(" Enter  matrix  length  ");
            matrixSize = sc.nextInt();
            if (matrixSize > 0 && matrixSize % 2 == 0) {
                break;
            } else {
                System.out.println(" You cannot enter negative  and odd numbers  ");
            }
        }

        int symmetricMatrix[][] = new int[matrixSize][matrixSize];

        for (int i = 0; i < symmetricMatrix.length; i++) {
            for (int j = 0; j < symmetricMatrix[i].length; j++) {
                symmetricMatrix[i][j] = (int) (Math.random() * 51);
                System.out.print("   " + symmetricMatrix[i][j]);
            }
            System.out.println();
        }

        long productOfMainDiagonal=symmetricMatrix[0][0];
        long productOfSideDiagonal=symmetricMatrix[matrixSize-1][matrixSize-1];

        for (int i = 0; i < symmetricMatrix.length; i++) {
            productOfMainDiagonal*=symmetricMatrix[i][i];

        }

        System.out.println ("Product of main diagonal " + productOfMainDiagonal);

        for (int j=0,i = symmetricMatrix.length-1 ; i>=0; i--,j++) {

            productOfSideDiagonal*=symmetricMatrix[i][j];

        }
        System.out.println("Product of said diagonal " + productOfSideDiagonal);

        if (productOfSideDiagonal> productOfMainDiagonal){
            System.out.println( " Product of side diagonal more than  product of main diagonal");
        }

       else if (productOfSideDiagonal < productOfMainDiagonal){
            System.out.println("Product of main diagonal more than product of side diagonal");
        }
       else {
            System.out.println(" IMPOSSIBLE!!!!!!!!!!!!");
        }


    }

}
