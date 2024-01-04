package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    @Test

    public void metoda_test(){
       // nume_cursanti_array();
      // nume_cursanti_lista();
       // obiecte_hashmap();
        //tari_orase();
        reteteGatit("Tiramisu");

    }

    //afisam numele cursantilor
    public void nume_cursanti_array(){
      String[] nume_cursanti=new String[4];
      nume_cursanti[0]="adrian";
        nume_cursanti[1]="anca";
        nume_cursanti[2]="andreea";
        nume_cursanti[3]="claudia";
        for (Integer index=0;index<nume_cursanti.length;index++){
            System.out.println(nume_cursanti[index]);
        }

    }

    public void nume_cursanti_lista(){
        List<String> nume_cursanti=new ArrayList<>();
        nume_cursanti.add("cosmin");
        nume_cursanti.add("letitia");
        nume_cursanti.add("oana");
        nume_cursanti.add("diana");

        for (Integer index=0;index<nume_cursanti.size();index++){
            System.out.println(nume_cursanti.get(index));
        }
    }



    //hashmap=key-value
    public void obiecte_hashmap(){
        HashMap<String,String> obiecte=new HashMap<>();
        obiecte.put("electronic","telefon");
        obiecte.put("aliment","supa");
        obiecte.put("masina","ford");
        for(String key: obiecte.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoarea este "+obiecte.get(key));
        }
    }

    //reprezentam niste tari cu orase
    public void tari_orase(){
        HashMap<String,List<String>>testData=new HashMap<>();

        List<String>oraseRomania=new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Timisoara");
        oraseRomania.add("Cluj");

        List<String>oraseItalia=new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Florenta");
        oraseItalia.add("Venetia");

        List<String>oraseSpania=new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Sevilla");

        testData.put("Romania",oraseRomania);
        testData.put("Italia",oraseItalia);
        testData.put("Spania",oraseSpania);

        for(String key: testData.keySet()){
            System.out.println("Tara este "+key);
            System.out.println("Orasele sunt urmatoarele: ");

            List<String>oraseleCurente=testData.get(key);

            for (Integer index=0;index < oraseleCurente.size(); index++){
                System.out.println(oraseleCurente.get(index));
            }

        }

    }

    //definim retete de gatit
    public  void reteteGatit(String reteta){
       HashMap<String, List<String>>carteRetete=new HashMap<>();

       List<String>ciorbaRadauteana=new ArrayList<>();
       ciorbaRadauteana.add("morcovi-2 bucati");
       ciorbaRadauteana.add("smantana-");
       ciorbaRadauteana.add("ceapa- 3bucati");
       ciorbaRadauteana.add("Telina1/2 bucati");
       ciorbaRadauteana.add("Galbenus ou");
       ciorbaRadauteana.add("apa-4l");
       ciorbaRadauteana.add("carne pui-500gr");
       ciorbaRadauteana.add("sare si piper dupa gust");

       List<String>tiramisu=new ArrayList<>();
       tiramisu.add("piscoturi - 400g");
       tiramisu.add("macarpone -500 gr");
       tiramisu.add("cafea - 50ml");
       tiramisu.add("amareto- 20 ml");
       tiramisu.add("oua - 3 buc");
       tiramisu.add("zahar - 3 lg");

       carteRetete.put("ciorba Radauteana", ciorbaRadauteana);
       carteRetete.put("Tiramisu", tiramisu);

        for(String key: carteRetete.keySet()){
            if (key.equals(reteta)){


            System.out.println("Reteta este pentru "+key);
            System.out.println("Ingredientele pentru reteta sunt urmatoarele: "+carteRetete.get(key));

        }
    }
        }

}
