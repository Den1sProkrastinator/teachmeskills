package homework2;

public class Exercise8 {
    public static void main(String[] args) {

        int[] arrayOne=new int[10];
        int[] arrayTwo=new int[10];
        double[] arrayThree=new double[10];

        int control=0;

        for(int i=0,b=1;b<=4;i++){
            if(b==1){
                arrayOne[i]=(int)(Math.random()*8)+1;
                if(i==0)
                    System.out.print((b)+ " массив состоит из следующих элементов: ");
                System.out.print(arrayOne[i]+" ");
                if(i==arrayOne.length-1){
                    b++;
                    i=0;
                    System.out.println(" ");
                }
            }
            if(b==2){
                arrayTwo[i]=(int)(Math.random()*8)+1;
                if(i==0)
                    System.out.print((b)+ " массив состоит из следующих элементов: ");
                System.out.print(arrayTwo[i]+" ");
                if(i==arrayTwo.length-1){
                    b++;
                    i=0;
                    System.out.println(" ");
                }
            }
            if(b==3){
                arrayThree[i]=(double)arrayOne[i]/arrayTwo[i];
                if(i==0)
                    System.out.print((b)+ " массив состоит из следующих элементов: ");
                System.out.print(arrayThree[i]+ " ");
                if(i==arrayThree.length-1){
                    b++;
                    i=0;
                    System.out.println(" ");
                }
            }

            if(b==4){
                if(arrayThree[i]%(int)arrayThree[i]==0){
                    if(control==0)
                        System.out.print("В 3 массиве следующие целые числа: ");
                    control++;
                    System.out.print(arrayThree[i]+", ");
                }
                if(i==arrayThree.length-1){
                    if(control==0)
                        System.out.println("В третьем массиве нет целых чисел!");
                    break;
                }
            }

        }


    }
}


