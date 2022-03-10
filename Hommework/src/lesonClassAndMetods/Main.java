package lesonClassAndMetods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        int groupSize = 4;
        Student mygrup[] = new Student[groupSize];
        Student arrayReiting[]= new Student[groupSize];

        for (int i = 0; i < mygrup.length; i++) {
            name=sc.nextLine();
            mygrup[i] = new Student(name);


        }

        for(int i = 0 ; i < mygrup.length; i++){
            System.out.println(mygrup[i].toString());
        }


    }
}

