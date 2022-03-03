package homework2;

public class Exercise3 {
    public static void main(String[] args) {
            int randomArray [] = new int[15];
            int sum=0;
            for (int i=0; i<randomArray.length;i++ ) {
                randomArray[i]=(int) (Math.random() * 100);
                System.out.print(randomArray[i] + " ");
            }

            for(int i =0; i<randomArray.length;i++){
                int x = randomArray[i];
                if (x%2==0 && x!=0){
                    sum++;
                }
            }
            System.out.println("\n" + sum);
        }

    }

