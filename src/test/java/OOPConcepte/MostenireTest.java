package OOPConcepte;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {
    @Test
    public void TestMethod(){

        List<String> dotariAudiA5= new ArrayList<>();
                dotariAudiA5.add("jenti");
                dotariAudiA5.add("trapa");
                dotariAudiA5.add("faruri");


        List<String> dotariAudiA7= new ArrayList<>();
        dotariAudiA7.add("jenti");
        dotariAudiA7.add("trapa");
        dotariAudiA7.add("faruri");
        dotariAudiA7.add("spoiler");
        dotariAudiA7.add("oglinzi electrice");

        List<String> dotariBMWX5interior= new ArrayList<>();
        dotariBMWX5interior.add("incalzire scaune");
        dotariBMWX5interior.add("clima bizonica");
        dotariBMWX5interior.add("GPS");


        List<String> dotariBMWX5exterior= new ArrayList<>();
        dotariBMWX5exterior.add("jenti");
        dotariBMWX5exterior.add("trapa");
        dotariBMWX5exterior.add("faruri");
        dotariBMWX5exterior.add("spoiler");
        dotariBMWX5exterior.add("oglinzi electrice");


        FabricaAudi AudiA5=new FabricaAudi("A5", "sedan", "negru",
                20,dotariAudiA5);

        AudiA5.prezentareAudi();

        FabricaAudi AudiA7=new FabricaAudi("A7", "SUV", "rosu",
                40,dotariAudiA7);

        AudiA7.prezentareAudi();
        AudiA7.AfisareRezultate();
        AudiA7.AfisareRezultate(2022);
        AudiA7.AfisareRezultate("X");



        AudiA7.AngajariFirma();

        FabricaBMW BMWX5 = new FabricaBMW("X5", "SUV", "albastru", 30, dotariBMWX5exterior,dotariBMWX5interior);
        BMWX5.prezentareBMW();

        BMWX5.AngajariFirma();


    }
}
