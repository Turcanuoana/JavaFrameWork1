package Structuri_alternative;

import org.testng.annotations.Test;

public class curs {
    //Structurile pot fi de doua feluri alternative si repetitive
    //Structuri alternative:if...then...else, switch...case
    @Test
    public void test_metod(){
    //verific_nr_mai_mare(9);
    //verific_nr_mai_mare(1);
    //verific_nr_mai_mare(5);
    //verific_nr_mai_mare(-6);
    //verific_nr_mai_mare(4);
    //verific_nr_mai_mare(6);
//    verific_nr_par(6000000);
//    verific_nr_par(-3);
//    verific_nr_par(2);
//    verific_nr_par(-10);
//    verific_nr_par(1);
//    verific_nr_par(0);
        persoana_majora(17);
        persoana_majora(18);
        persoana_majora(19);
    }
    //verificam daca un nr este mai mare decat 5

    public void verific_nr_mai_mare(Integer nr){
        if(nr>5){
            System.out.println("Numarul "+nr+" este mai mare ca 5");
        }
        else {
            System.out.println("Numarul "+nr+" este mai mic ca 5");
        }

    }

    //verificam daca un nr este par si pozitiv
    public void verific_nr_par(Integer nr){
        //daca vreau catul= / (dive)
        //daca vreau restul =% (mod)
        if(nr>0) {
            if (nr%2==0) {
                System.out.println("numarul "+nr+" este par si pozitiv");
            } else {
                System.out.println("Numarul "+nr+"este impar si pozitiv");
            }
        }
        else if (nr<0){
            if (nr%2==0) {
                System.out.println("numarul "+nr+"este par si negativ");
            }
            else {
                System.out.println("Numarul "+nr+"este impar si negativ");
            }
        }

        else{
            System.out.println("Numarul este 0");
        }
        }
        //verificam daca o persoana este majora
    public void persoana_majora(Integer varsta){
        if (varsta>=18){
            System.out.println("persoana cu varsta "+varsta+" este majora");
        }
        else {
            System.out.println("Persoana cu varsta "+varsta+" nu este minora");
        }
    }
    }



