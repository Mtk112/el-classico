package el.classico;        //Petteri Sylvänne

public class Kokoonpano {

    Pelaaja pelaajat[] = new Pelaaja[11];
    int hyökkäyspisteet;
    int puolustuspisteet;
    
    public Kokoonpano(){}
    
    public Kokoonpano(int hyökkäys, int puolustus){
        this.hyökkäyspisteet = hyökkäys;
        this.puolustuspisteet = puolustus;        
    }
}
