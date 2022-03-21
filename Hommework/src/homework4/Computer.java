package homework4;

import sun.security.mscapi.CPublicKey;

import java.util.Scanner;

public class Computer {
    Scanner sc = new Scanner(System.in);
    private int hardDevice;
    private int memory;
    private int processor;
    private int ressurs;
    private int random;
    private int myNumber;
    private int onOff;

    private boolean in;
    private boolean out;



    public Computer(int hardDevice, int memory, int processor, int ressurs) {
        this.hardDevice = hardDevice;
        this.memory = memory;
        this.processor = processor;
        this.ressurs = ressurs;
    }

    public void getComputer() {
        System.out.println(
                "Hard-" + hardDevice + "\nProcessor-" + processor + "\nMemmory-" + memory + "\nЦиклов включений.выключений-"+onOff );
    }


    public void inputNumber0or1(){
        for(;;){
        random = (int) (Math.random() * 2);

        System.out.println("загадайте 0 или 1");
        myNumber = sc.nextInt();

        if (myNumber == 1 || myNumber == 0) {
            break;
        } else {
            System.out.println(" Только 0 или 1 !!! Попробуйте еще раз");
        }
    }

    }
    public boolean on() {

       inputNumber0or1();


            if (myNumber != random) {

                System.out.println("Мать сгорела (((");
                return in=false;

            } else {
                System.out.println("Комп включился");
                return in=true;
            }

    }

        public boolean off() {

                inputNumber0or1();

                if (myNumber != random) {
                    System.out.println("Мать сгорела (((");
                    return out=false;

                } else {
                    System.out.println("Комп выключился");
                    return out=true;
                }

            }

        public void loadComputer() {
            for (int i =0; ; i++) {

                on();
                if(in!=true || i>=ressurs ){
                    System.out.println("Мать сгорела (((((");
                    break;
                }
                off();
                if(out!=true || i>=ressurs){
                    System.out.println("Мать сгорела (((((");
                    break;
                }
                onOff++;

                    System.out.println("Циклов работы -  " + onOff);

            }


        }
    }



















