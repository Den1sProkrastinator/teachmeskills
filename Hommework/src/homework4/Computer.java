package homework4;

import java.util.Scanner;

public class Computer {
    Scanner sc = new Scanner(System.in);
    int hardDevice;
    int memory;
    int processor;
    int ressurs;
    int random=1;
    int myNumber;
    int onOff=0;
    boolean onBoolean;
    boolean offBoolean;




   public  void getComputer(){
       System.out.println(
              "Hard-"+hardDevice+"\nProcessor-"+processor+"\nMemmory-"+memory+
               "\n колличество включений " + onOff);
   }
   public void on(){

             for(;;){
//                 random=(int) (Math.random() *2);

                  System.out.println("загадайте 0 или 1");
                   myNumber=sc.nextInt();

                  if(myNumber==1 || myNumber==0){

                      break;
                  }
                  else {
                      System.out.println("попробуйте еще раз");

                 }

                 }


            if (myNumber==random){
                System.out.println("Комп включился");
                onBoolean=true;

            }
            else {
                System.out.println("Комп сгорел(((");

            }
    }




    public  void off(){
                for(;;){
//                    random=(int) (Math.random() *2);

                    System.out.println("загадайте 0 или 1");
                    myNumber=sc.nextInt();
                    if(myNumber==1 || myNumber==0){
                        break;
                    }
                    else {
                        System.out.println("попробуйте еще раз");
                    }
                }


                if (myNumber==random){
                    System.out.println("Комп выключился");
                    offBoolean=true;
                }
                else {
                    System.out.println("Комп сгорел(((");

                }

            }








      public void loadComputer(){
        for (;;){

            on();
            off();

            if (onBoolean==true && offBoolean==true && onOff<ressurs){
                onOff++;
                System.out.println("Циклов работы -" + onOff);
            }
            else {
                System.out.println("комп сгорел (((");
                break;
            }

        }



      }

            }
















