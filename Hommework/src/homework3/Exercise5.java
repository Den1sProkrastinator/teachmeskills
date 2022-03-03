package homework3;

import java.util.Scanner;

public class Exercise5 {
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
        int transporingMatrix[][]= new int [matrixSize][matrixSize];


        for (int i = 0; i < symmetricMatrix.length; i++) {
            for (int j = 0; j < symmetricMatrix[i].length; j++) {
                symmetricMatrix[i][j] = (int) (Math.random() * 51);
                System.out.print("   " + symmetricMatrix[i][j]);
            }
            System.out.println();
        }

        for(int i = 0 ; i<matrixSize; i++){


            for (int j = 0; j<matrixSize ; j++){
                transporingMatrix[i][j]=symmetricMatrix[j][i];

                System.out.print("  "+transporingMatrix[i][j]);
            }

            System.out.println();


        }
    }




}
