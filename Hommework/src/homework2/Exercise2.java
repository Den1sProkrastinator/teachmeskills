package homework2;

public class Exercise2 {
    public static void main(String[] args) {
        int arrayLength  = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) arrayLength++;
        }
        int[] arrayOfOddNumbers = new int[arrayLength];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                arrayOfOddNumbers[b] = i;
                System.out.print(arrayOfOddNumbers[b] + " ");
                b++;
            }
        }
        System.out.println("\n");
        for (int i = arrayOfOddNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayOfOddNumbers[i] + " ");


        }
    }
}


