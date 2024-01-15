package StaticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test


    public void TestMethod(){

        Elev unu=new Elev("Popescu", "Mihai");
        unu.prezentareElevi();

        Elev doi=new Elev("Popescu2", "Mihai2");
        doi.prezentareElevi();

        Elev trei=new Elev("Popescu3", "Mihai3");
        trei.prezentareElevi();
    }
}
