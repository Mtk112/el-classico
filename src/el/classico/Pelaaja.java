package el.classico;

public class Pelaaja {
 
    private String nimi;
    private int pelinumero;
    private int taitopiste;
    private int pelipaikka;
    private int joukkue;
    private int hyökkäys;
    private int puolustus;
            
    public Pelaaja(){}
    
    public Pelaaja(String nimi, int numero, int taito, int paikka, int joukkue, int hyökkäys, int puolustus){
        this.nimi = nimi;
        this.pelinumero = numero;
        this.taitopiste = taito;
        this.pelipaikka = paikka;
        this.joukkue = joukkue;
        this.hyökkäys = hyökkäys;
        this.puolustus = puolustus;
    }
    
    public void setNimi(String nimi){
    this.nimi = nimi;    
    }
    
    public String getNimi(){
        return nimi;
    }
    
    public void setPelinumero(int numero){
        this.pelinumero = numero;
    }
    
    public int getPelinumero(){
        return pelinumero;
    }
    
    public void setTaitopiste(int taito){
        this.taitopiste = taito;
    }
    
    public int getTaitopiste(){
        return taitopiste;
    }
    
    public void setPelipaikka(int paikka){
        this.pelipaikka = paikka;
    }
    
    public int getPelipaikka(){
        return pelipaikka;
    }
    
    public void setJoukkue(int joukkue){
        this.joukkue = joukkue;
    }
    
    public int getJoukkue(){
        return joukkue;
    }
    
    public void setHyokkays(int hyokkays){
        this.hyökkäys = hyokkays;
    }
    
    public int getHyokkays(){
        return hyökkäys;
    }
    
    public void setPuolustus(int puolustus){
        this.puolustus = puolustus;
    }
    
    public int getPuolustus(){
        return puolustus;
    }
}