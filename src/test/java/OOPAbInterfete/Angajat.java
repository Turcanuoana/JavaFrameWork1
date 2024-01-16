package OOPAbInterfete;

public class Angajat extends Persoana implements Angajatint{

    public Angajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariu");

    }

    @Override
    public void areConcediu() {
        System.out.println("Angajatul are concediu");

    }


}
