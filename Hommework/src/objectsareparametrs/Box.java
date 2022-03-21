package objectsareparametrs;

public class Box {
    private double widht;
    private double height;
    private double depth;
    Box(Box ob){
        widht = ob.widht;
        height= ob.height;
        depth= ob.depth;

    }

     Box(double w, double h, double d) {
        this.widht = w;
        this.height = h;
        this.depth = d;
    }
    Box(){
        widht=-1;
        height=-1;
        depth=-1;
    }
    Box(double len){
        widht=height=depth=len;
    }

    double volume(){
        return widht*height*depth;
    }


}
class BoxWeight extends Box{
    double weight;
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
    BoxWeight(){
        super();
        weight =-1;
    }
    BoxWeight(double len, double m){
        super(len);
        weight=m;
    }

}

class DemoSuper{
    public static void main(String[] args) {

    }
}
