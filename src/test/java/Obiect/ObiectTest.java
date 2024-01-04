package Obiect;

import org.testng.annotations.Test;

public class ObiectTest {
    @Test
    public void testMethod(){
        FabricaMasini MercedesG63AMG=new FabricaMasini("Mercedes",
                "G6 63AMG", "electric" ,"manuala",2023, 4.89);
        MercedesG63AMG.prezentareProdus();
        MercedesG63AMG.calculImpozit();
        System.out.println("=====================");
        FabricaMasini DaewooMatiz= new FabricaMasini("Daewoo", "Matiz","GPL",
                "Automata", 2023,0.8);
        DaewooMatiz.prezentareProdus();
        DaewooMatiz.calculImpozit();
        System.out.println("=====================");
        FabricaMasini AudiR8=new FabricaMasini("Audi", "R8",
                "Electric","Manuala",2022, 3.2 , 99000);
        AudiR8.prezentareProdus();
        System.out.println("=====================");
        AudiR8.calculImpozit();
    }


}
