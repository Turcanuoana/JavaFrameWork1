package OOPAbabstractClass;

public abstract class Persoana {

    //ca sa facem o clasa abstracta trebuie sa adaugam cuvantul abstract intre public si class
    //o clasa abstracta poate sau nu sa contina metode abstracte
    //o clasa abstracta se mosteneste
    //o clasa abstracta poate implementa o interfata
    //o clasa abstracta poate avea un constructor insa nu putem face un obiect
    //putem avea metode/variabile cu diferite tipuri de access control(public,private,protected)
   //metodele abstracte trebuie sa contina cuvantul abstract
    //trebuie sa specificam access control ptr metodele abstracte

   public abstract void munceste();

   public abstract void primesteSalariu();

    public abstract void areConcediu();
   public abstract void mergeLaFacultate();
   public abstract void sustineExamene();
    public abstract void mergeInVacanta();
    public abstract void meregInRestante();

    public void verificaVarsta(Integer varsta){
        if (varsta>=18){
            System.out.println("Persoana e majora");
        }
        else {
            System.out.println("Persoana e minora");
        }
    }

}
