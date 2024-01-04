package OOPConcepte;

public class FabricaMasini {

    //oop=programare orientatata pe obiecte
    //4 principii=mostenire,incapsulare,abstractizare,polimorfism
    //mostenire=conceptup+l prin care clasa parinte este mostenita de clasa copil
    //in java o clasa poate sa mosteneasca doar o singura clasa
    //clasa copil trebuie sa apeleze constructorul din clasa parinte
    //copilul are vizibilitate asupra modelelor/variabilelor din parinte daca sunt publice/protected
    //Ca sa apelam constructorul parinte in clasa copil vom folosi SUPER

    //Acces control=public,private,protected,default
    //public=ofera vizibilitate ptr oricine si oriunde (in tot proiectul)
    //private=ofera vizibilitate doar in interiorul clasei
    //



  private String marca;
   private String model;
   private String sasiu;
    private String culoare;
    private Integer motorizare;

    public FabricaMasini(String marca, String model, String sasiu, String culoare, Integer motorizare) {
        this.marca = marca;
        this.model = model;
        this.sasiu = sasiu;
        this.culoare = culoare;
        this.motorizare = motorizare;

    }

    public void prezentareMasina(){
        System.out.println("marca masinii este " + marca);
        System.out.println("modelul masinii este " + model);
        System.out.println("sasiul masinii este " + sasiu);
        System.out.println("culoare masinii este " + culoare);
        System.out.println("motorizarea masinii este "+ motorizare);
    }

    //polimorfism=conceptul prin care o metdoda poate suferi modificari la nivel de continut sau structura
    //polimorfismul este de 2  feluri: dinamic(override) sau static(overload)
    //dinamic= intro ierarhie pe clase extinse prin mostenire o metoda poate avea implementari diferite
    //static=mai multe metode poate avea acelasi nume cu conditia sa se diferentieze prin numar sau tip de parametrii
    // nu se poate aplica polimorfismul la metodele cu RETURN doar la cele cu VOID


    // polimorfism dinamic

    public void AngajariFirma(){
        System.out.println("Fabrica mama nu mai face angajari");
    }


    //
    //ca sa accesam valoarea unei variabile cu PRIVATE ne folosim de conceptul GET
    //ca sa modoficam valoarea unei variabile privtate ne folosim de conceptul SET


//    public String getMarca(){
//        return marca;
//
//    }
//
//    public String getModel(){
//        return model;
//    }


    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Integer getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(Integer motorizare) {
        this.motorizare = motorizare;
    }
}
