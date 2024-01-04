package Obiect;

public class FabricaMasini {


    //constructor=are ca rol sa initializeze atributele unei clase
    //un constructor este public si are acelasi nume cu clasa
    //un constructor poate sa fire de 2 feluri cu parametrii si fara parametrii
    //un contructor fara parametrii se mai numeste DEFAULT
    //daca nu am definit noi un constructor, avem unul default
    //intr-o clasa putem avea n constructori diferentiati prin nr sau tip de parametrii

    //obiect=instanta unei clase
    //un obiect reprezinta o structura pe care o are clasa si din care poate accesa variabilele si metodele respective

    //dintr-o clasa putem initializa n obiecte
    //in momentul in care initializam un obiect apelam constructorul din clasa

    public String marca;
    public String model;
    public String combustibil;
    public String transmisie;
    public Integer anul;
    public Double motorizare;
    public Integer pret;

    public FabricaMasini(String marca, String model, String combustibil,
                         String transmisie, Integer anul, Double motorizare) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.anul = anul;
        this.motorizare = motorizare;
    }

    public FabricaMasini(String marca, String model, String combustibil, String transmisie,
                         Integer anul, Double motorizare, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.anul = anul;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareProdus() {
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Tipul de combustibil folosit este " + combustibil);
        System.out.println("Transmisia este " + transmisie);
        System.out.println("Anul fabricarii este " + anul);
        System.out.println(" Motorizarea este " + motorizare);
        if (pret != null) {
            System.out.println("Pretul produsului este" + pret);
        }
    }
    public void calculImpozit(){
        if(anul >=2020 && combustibil.equals("Electric")){
            System.out.println("Clientul trebuie sa plateasca 5 ron.");
        }
        else {
            System.out.println("Clientul trebuie sa plateasca in functie de anul masinii.");
        }

    }
}


