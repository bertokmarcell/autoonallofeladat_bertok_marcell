package onallofeldadat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class onallofeladat {
    private static List<Auto> autok = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Path path = Path.of("fuvarok.csv");
        List<String> sorok = Files.readAllLines(path);
        
        for(String sor : sorok){
            String[] s = sor.split(";");
            String rsz= s[0];
            int ido = Integer.parseInt(s[1]);
            float ossz = Float.parseFloat(s[2]);
            Enum fsz = Enum.valueOf(s[3].toUpperCase());
            Auto auto = new Auto(rsz,ido,ossz,fsz);
            autok.add(auto);
        }
        felegy();
        felket();
        felhar();
        felneg();
        felot();
    }

    private static void felegy() {
        final int N=autok.size();
        int i =0;
        float osszeg=0;
        while(i<N){
            osszeg+=autok.get(i).getOssz();
            i++;
        }
        System.out.println("osszar"+osszeg);
        
    }

    private static void felket() {
        int i =0;
        String rendszam="";
        int maxosz=0;
        final int N=autok.size();
        while(i<N){
            if(autok.get(i).getOssz()>autok.get(maxosz).getOssz()){
                rendszam=autok.get(i).getRsz();
                maxosz=i;
            }
            i++;
        }
        System.out.println("legnagyobbosszeg= "+rendszam);
    }

    private static void felhar() {
        int i =0;
        String rendszam="";
        float minossz=autok.get(1).getOssz();
        final int N=autok.size();
        while(i<N){
            if(autok.get(i).getOssz()<minossz){
                rendszam=autok.get(i).getRsz();
                minossz=autok.get(i).getOssz();
            }
            i++;
        }
        System.out.println("legnagyobbosszeg= "+rendszam);
    }

    private static void felneg() {
        int i =0;
        int k=0;
        final int N=autok.size();
        while(i<N){
            if(autok.get(i).getFiz()==Enum.KARTYAS){
                k++;
            }
            i++;
        }
        System.out.println("kartyas fizetes volt= "+k);
    }

    private static void felot() {
        
    }

}
