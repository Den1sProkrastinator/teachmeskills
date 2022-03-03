package homework2;

public class Exercise5 {
    public static void main(String[] args) {
        int randomArrayFirst[] = new int[5];
        int randomArraySecond[] = new int[5];
        double averageFirst=0;
        double averageSecond=0;
        for (int i = 0; i < randomArrayFirst.length; i++) {
            int x = (int) (Math.random() * 16);
            randomArrayFirst[i] = x;
            averageFirst+=x;
            System.out.print(randomArrayFirst[i] + " ");
        }
        averageFirst/=randomArrayFirst.length;
        System.out.println("\n");
        for (int i = 0; i < randomArraySecond.length; i++) {
            int x = (int) (Math.random() * 16);
            randomArraySecond[i] = x;
            averageSecond+=x;
            System.out.print(randomArraySecond[i] + " ");
        }
        averageSecond/=randomArraySecond.length;

        if (averageFirst>averageSecond){
           System.out.println("\nThe first array is greater than the second array ");
       }
        else if (averageFirst<averageSecond){
            System.out.println("\nThe second  array is greater than the first array ");
        }
        else if (averageFirst==averageSecond){
            System.out.println("\nThe first array equals the second array ");
        }


    }
}
