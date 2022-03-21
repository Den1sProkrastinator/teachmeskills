package Наследование.tecniks;

public class App  {
    public static void main(String[] args) {
        MyTecniks my=new MyTecniks(TypOftecniks.TV,Colors.BLACK);
        MyTecniks my2=new MyTecniks(null, null);

        my2.myTecniksPokazat(my);

        my.myTecniksPokazat(my);
        my.on(true);

    }
}
