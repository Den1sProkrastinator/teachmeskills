package homework2;

public class Exercise6 {
    public static void main(String[] args) {
        int randomArray [] = new int[4];
        int x = 0;
        int b = 0;

        for (int i=0; i<randomArray.length;i++ ) {
            randomArray[i]=(int) (Math.random() * 11);
            System.out.print(randomArray[i] + " ");
        }

        for (int i=0, a=1; a<randomArray.length;i++,a++ ){
            x = randomArray[i];
            b = randomArray[a];

            if (x>b || x==b) {
                System.out.println("Массив не возрастает ");
                break;
            }

            }
        if(x<b){
            System.out.println("Массив возрастает ");
        }

           }
        }




