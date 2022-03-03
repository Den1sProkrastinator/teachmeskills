package homework3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize;
        int k = 0;

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
        System.out.print("Нечетные элементы  главной диагонали и под ней   ");

        for (int i = 0; i < matrixSize; i++) {
            k++;
            for (int j = 0; j < k; j++) {
                if (symmetricMatrix[i][j] % 2 != 0) {
                    System.out.print(" " + symmetricMatrix[i][j]);
                }

            }

        }
    }
}
