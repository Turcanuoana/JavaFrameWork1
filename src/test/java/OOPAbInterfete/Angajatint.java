package OOPAbInterfete;

public interface Angajatint {
    //abstractizare=conceptul in baza caruia definim comportamentul unei clase
    //acest concept se poate face prin interfete sau clase abstarcte
    //interfete=putem recunoaste o interfata dupa cuvantul interface
    //o interfata contine doar metode abstracte(metode care nu au body)
    //o interfata se implementeaza
    //clasa care implemnteaza interfata trebuie sa implementeze toate metodele abstracte
    //o clasa poate implementa n interfete
    //o clasa abstracta poate implementa una sa mai multe interfete
    //o interfata nu poate extinde o clasa /clasa abstracta
    //o interfata poate extinde o alta interfata
    //toate metodele dintr-o interfata sunt publice
    //interfata nu poate avea un constructor=nu putem face un obiect dintr-o interfata


    void munceste();

    void primesteSalariu();

    void areConcediu();






}
