package leson3;

public class Exercsie1 {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
//        int diagonalsSum = 0;
//        int min = 0;
        int max=0;
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
//        min = array[0][0];
//        max = array[0][0];

//        for (int i = 0; i < array.length; i++) {
//            diagonalsSum += array[i][i];
//        }
//        System.out.println(diagonalsSum);

//        for (int i = 0; i < array.length; i+=2) {
//            for (int j = 0; j < array[i].length; j++) {
//
//                if (min > array[i][j]) {
//                    min = array[i][j];
//
//                }
//
//            }
//        }
            for (int i = 0; i < array.length; i++) {
                max = array[i][0];
                for (int j = 0; j < array[i].length; j++) {
                    if (max < array[i][j]) {
                        max = array[i][j];
                    }
                }
                sum+=max;

        }
//        System.out.println(min);
        System.out.println(sum);


    }
}



