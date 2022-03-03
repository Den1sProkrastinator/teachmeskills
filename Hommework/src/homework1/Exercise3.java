package homework1;

public class Exercise3 {
    public static void main(String[] args) {
        int rightNumber = 256 ;
        int sum = 0;
        for(int i=1 ; i<=rightNumber; i*=2){
            sum += i ;
        }
        System.out.println(sum);


    }
}
