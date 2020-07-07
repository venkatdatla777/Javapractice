package InheritanceConcept;

public class Inheritance {
    public  static void main (String[] args){
        CretaModels cretaObj = new CretaModels();
        I20Models i20Obj = new I20Models();
        WagonRModels wagonRObj = new WagonRModels();

        cretaObj.Creta();
        cretaObj.CretaE();

        i20Obj.I20();
        i20Obj.I20Active();

        wagonRObj.WagonR();
        wagonRObj.WagonRHighEnd();



    }
}
