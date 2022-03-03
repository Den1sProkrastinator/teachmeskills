package homework2;

public class Exercise7 {
    public static void main(String[] args) {

        int randomArray[] = new int[12];
        int maxNumber = 0;
        int index = 0;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 16);
            System.out.print(randomArray[i] + " ");
        }


        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] >= maxNumber) {
                maxNumber = randomArray[i];
                index = i;
            }


        }
        System.out.println("\nMax value - " + maxNumber + " index- " + index);
    }
}


