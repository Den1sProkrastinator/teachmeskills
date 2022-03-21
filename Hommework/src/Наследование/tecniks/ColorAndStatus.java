package Наследование.tecniks;

public class ColorAndStatus extends Tecnics implements OnInWeb {
    Colors myColors;

    public ColorAndStatus(TypOftecniks myKithenTecniks, Colors myColors) {
        super(myKithenTecniks);
        this.myColors = myColors;
    }

    public void setMyColors(Colors myColors) {
        this.myColors = myColors;
    }

    public void on(boolean onOff) {
        if (onOff==true){
            System.out.println("\nOn");

        }
        else {
            System.out.println("\nOff");
        }

    }

}
