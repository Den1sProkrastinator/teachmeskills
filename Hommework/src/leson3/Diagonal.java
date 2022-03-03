package leson3;

public class Diagonal {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; i >= 0; i--) {


                sum += array[i][j];
            }
            System.out.println(sum);
        }
    }
}
