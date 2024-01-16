package OOPAbInterfete;

public class Student extends Persoana implements StudentInt{

    public Student(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void mergeLaFacultate() {
        System.out.println("Studentul merge la facultate");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul a sustinut examene");

    }

    @Override
    public void mergeInVacanta() {
        System.out.println("Studentul merge in vacanta");

    }

    @Override
    public void meregInRestante() {
        System.out.println("Studentul merge in restante");

    }

}
