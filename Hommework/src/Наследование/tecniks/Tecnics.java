package Наследование.tecniks;

abstract class Tecnics  {



    TypOftecniks myKithenTecniks;

    public Tecnics(TypOftecniks myKithenTecniks) {
        this.myKithenTecniks = myKithenTecniks;
    }

    protected void setMyKithenTecniks (TypOftecniks myKithenTecniks){
        this.myKithenTecniks=myKithenTecniks;
        System.out.println("my tecnik" + myKithenTecniks);

    }


}
