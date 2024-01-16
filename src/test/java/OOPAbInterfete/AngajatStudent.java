package OOPAbInterfete;

public class AngajatStudent extends Persoana implements Angajatint,StudentInt{
    public AngajatStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }


    @Override
    public void mergeLaFacultate() {
        System.out.println("Angajatul-student merege la facultate");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Angajatul-student merge la examene");
    }

    @Override
    public void mergeInVacanta() {
        System.out.println("Angajatul-student merge in vacanta");
    }

    @Override
    public void meregInRestante() {
        System.out.println("Angajatul-student merge in restante");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul-studenta munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul-student primeste salariu");
    }

    @Override
    public void areConcediu() {
        System.out.println("Angajatul-student are concediu");
    }

}
