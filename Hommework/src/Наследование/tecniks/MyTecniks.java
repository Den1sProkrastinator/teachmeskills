package Наследование.tecniks;

public class MyTecniks extends ColorAndStatus{

    public MyTecniks(TypOftecniks myKithenTecniks, Colors myColors) {
        super(myKithenTecniks, myColors);
    }

    void myTecniksPokazat(MyTecniks my){


        System.out.println("я создал некоторое дерьмо "+ my.myColors + my.myKithenTecniks);

    }
}
