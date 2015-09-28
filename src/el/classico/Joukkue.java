package el.classico;
import java.util.Scanner;

public class Joukkue {
    Pelaaja pelaaja[] = new Pelaaja[10];
    Scanner kysy = new Scanner(System.in);
    
    String nimi;
    String valmentaja;
    
    public Joukkue(){}
    
    public Joukkue(String nimi, String valmentaja){
        this.nimi = nimi;
        this.valmentaja = valmentaja;
    }
    
    public void setNimi(String nimi){
        this.nimi = nimi;
    }
    
    public String getNimi(){
        return nimi;
    }
    
    public void setValmentaja(String valmentaja){
        this.valmentaja = valmentaja;
    }
    
    public String getValmentaja(){
        return valmentaja;
    }           
}