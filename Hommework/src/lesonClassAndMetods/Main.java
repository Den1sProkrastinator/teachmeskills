package lesonClassAndMetods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        int groupSize = 14;
        Student mygrup[] = new Student[groupSize];

        for (int i = 0; i < mygrup.length; i++) {
            name=sc.nextLine();
            mygrup[i] = new Student(name);

        }

        for(int i = 0 ; i < mygrup.length; i++){
            System.out.println(mygrup[i].toString());
        }


        System.out.println("Студент -" + mygrup[2].toString());
    }
}

