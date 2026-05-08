package onallofeldadat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class onallofeladat {
    private static List<Auto> autok = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Path path = Path.of("adatok.csv");
        List<String> sorok = Files.readAllLines(path);
        
        for(String sor : sorok){
            String[] s = sor.split(";");
            String rsz= s[0];
            int km = Integer.parseInt(s[1]);
            autok.add(auto);
        }
    }

}
