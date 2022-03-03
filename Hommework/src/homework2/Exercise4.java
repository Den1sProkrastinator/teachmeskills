package homework2;

public class Exercise4 {
    public static void main(String[] args) {

        int randomArray[] = new int[20];

        for (int i = 0; i < randomArray.length; i++) {
            int x = (int) (Math.random() * 21);
            randomArray[i] = x;
            System.out.print(randomArray[i] + " ");
        }
        for (int i=0; i<randomArray.length;i++){
            if (i%2!=0){
                randomArray[i]=0;
            }
            }
        System.out.println("\n");
        for (int i = 0; i < randomArray.length; i++){
            System.out.print(randomArray[i] + " ");
        }
        }
    }

