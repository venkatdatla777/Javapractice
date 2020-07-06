package InheritanceConcept;

class Cars extends CretaModels {
    public void Creta(){
        System.out.println("Creta having three models: E, EX, SX");
        System.out.println("All models Coming with Both Petrol and Diesel");
        System.out.println("Engine side everything same for all models");
        System.out.println("Availble in all colours");
    }

    public void I20(String e, String ex, String sx){
        System.out.println("i20 having three models: E, EX, SX");
    }

    public void WagonR(String e){
        System.out.println("wagnoR having three models: E");
    }
}
