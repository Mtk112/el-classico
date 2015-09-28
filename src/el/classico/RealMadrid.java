package el.classico;        //Petteri Sylvänne

public class RealMadrid {
 
    String maalivahti;
    String puolustaja;
    String keskikentta;
    String hyokkaaja;
    
    public RealMadrid(){}
    
    public RealMadrid(String mv, String puo, String kk, String hyo){
        this.maalivahti = mv;
        this.puolustaja = puo;
        this.keskikentta = kk;
        this.hyokkaaja = hyo;
    }
    
    public void setMaalivahti(String maalivahti){
        this.maalivahti = maalivahti;
    }
    
    public String getMaalivahti(){
        return maalivahti;
    }
    
    public void setPuolustaja(String puolustaja){
        this.puolustaja = puolustaja;
    }
    
    public String getPuolustaja(){
        return puolustaja;
    }
    
    public void setKeskikentta(String keskikentta){
        this.keskikentta = keskikentta;
    }
    
    public String getKeskikentta(){
        return keskikentta;
    }
    
    public void setHyökkääjä(String hyokkaaja){
        this.hyokkaaja = hyokkaaja;
    }
    
    public String getHyökkääjä(){
        return hyokkaaja;
    }
}