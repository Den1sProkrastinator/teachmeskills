package lesonClassAndMetods;


import java.util.Scanner;

public class Student {
    String name  ;
    int group;
    int  mark ;


    Student(String name){
           this.name = name;
           mark=(int) (Math.random() * 11);
           group = 18;
       }

       
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", score=" + mark +
                '}';
    }
}
