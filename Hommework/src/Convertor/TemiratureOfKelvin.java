package Convertor;

public class TemiratureOfKelvin implements Convertor {



    @Override
    public void convertation(double celsia) {
        System.out.println("Kelvins "+(celsia+273.15) );



    }
}
