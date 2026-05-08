package Onallofeldadat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Onallofeladat {
    private static List<Auto> autok = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Path path = Path.of("adatok.csv");
        List<String> sorok = Files.readAllLines(path);
        
        for(String sor : sorok){
            String[] s = sor.split(";");
            String rsz= s[0];
            int km = Integer.parseInt(s[1]);
            autok.add(autok);
        }
        feladatok();
    }

    private static void feladatok() {
        final int N=autok.size();
        int i =0;
        while(i<N&&(autok.get(i).getKm()>100)){
            i++;
        }
        String Valasz = i>=N?"igen":"nem";
        System.out.println("minden aoutu ment 1000km felett? = "+Valasz);
        //rendsza,idomp,osszeg,fizetesimodszer(lehet kartyas,keszpensz,utalas,csekk)
    }
