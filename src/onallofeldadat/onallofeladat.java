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
        
        mindenfel_Kiveve_A_Nyolcas();
        
        /*mindenfel();*/ 
        /* ^ Csolti Tanár Úr , ez a metódus meghívja a nyolcas feladatot ami kiírja az összes kocsit, mind a százat */
        
    }
    private static void mindenfel(){
        felegy();
        elvalaszto();
        felket();
        elvalaszto();
        felhar();
        elvalaszto();
        felneg();
        elvalaszto();
        felot();
        elvalaszto();
        felhat();
        elvalaszto();
        felhet();
        elvalaszto();
        felnyol();
    }
    
    private static void mindenfel_Kiveve_A_Nyolcas(){
        felegy();
        elvalaszto();
        felket();
        elvalaszto();
        felhar();
        elvalaszto();
        felneg();
        elvalaszto();
        felot();
        elvalaszto();
        felhat();
        elvalaszto();
        felhet();
        
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
    int kartyas = 0, keszpenz = 0, utalas = 0, csekk = 0;
    final int N = autok.size();
    for(int i = 0; i < N; i++) {
        Enum fiz = autok.get(i).getFiz();
        if(null != fiz) switch (fiz) {
            case KARTYAS:
                kartyas++;
                break;
            case KESZPENZ:
                keszpenz++;
                break;
            case UTALAS:
                utalas++;
                break;
            case CSEKK:
                csekk++;
                break;
            default:
                break;
        }
    }
    System.out.println("5.: minden fizetési mód meghatározott:");
    System.out.println("  KARTYAS: "+ kartyas);
    System.out.println("  KESZPENZ: "+ keszpenz);
    System.out.println("  UTALAS: " +utalas);
    System.out.println("  CSEK: " +csekk);
    }
    private static void elvalaszto(){
        
        System.out.println("-----------------------------------------");
        
    }
    private static void felhat(){
        /*autocount*/
        java.util.Set<String> rszam =new java.util.HashSet<>();
        for(Auto auto : autok) {
            rszam.add(auto.getRsz());
        }
        System.out.println("kul rendszam : "+ rszam.size());
    }
    private static void felhet(){
    java.util.Set<Enum> kul =new java.util.HashSet<>();
    int N = autok.size();
    for(int i = 0; i < N; i++) {
        kul.add(autok.get(i).getFiz());
    }
    System.out.println("fizetesi mod szam: " +kul.size());
    }
    private static void felnyol(){
        int i =0;
        final int N=autok.size();
        while(i<N){
            System.out.println("renszam : "+autok.get(i).getOssz() + "ment : "+autok.get(i).getIdo());
            i++;
        }
        
    }

}
