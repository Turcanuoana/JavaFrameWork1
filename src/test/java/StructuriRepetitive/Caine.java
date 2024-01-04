package StructuriRepetitive;

import org.testng.annotations.Test;

public class Caine {
    //Structuri repetitive= for,while,for each

    @Test
    public void metoda_test() {
        //afisare_numere_for();
        //afisare_numere_while();
        //afisare_nume();
        //suma_numerelor();
        afisare_nr_divizibil();
    }

    //afisam primele 10 numere
    public void afisare_numere_for() {
        for (Integer index = 0; index < 50; index++) {
            System.out.println(index);
        }

    }

    public void afisare_numere_while() {
        Integer index = 0;
        while (index < 50) {
            System.out.println(index);
            index++;
        }

    }

    //afisam numele nostru de 5 ori
    public void afisare_nume() {
        for (Integer index = 0; index < 5; index++) {
            System.out.println("oana");
        }
    }


    //calculam suma primelor 10 numere
    public void suma_numerelor() {
        Integer index = 0;
        Integer suma_numerelor = index;
        while (index <= 10) {
            suma_numerelor = suma_numerelor + index;
            index++;

        }
        System.out.println("suma_numerelor este:" + suma_numerelor);
    }


    //afisam primele 3 numere divizibie cu 5

    public void afisare_nr_divizibil() {
        Integer a = 0;
        for (Integer index = 0; index < 21; index++) {
            if (index%5==0 && a<=3) {
                a++;
                System.out.println(index);
            }
 //           if (a==3){
  //              break;
 //           }

        }


    }
}
