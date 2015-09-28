package el.classico;
import javax.swing.JOptionPane;
import java.util.Random;

public class Tapahtumat {

    private Random tapahtumat = new Random();
    private Random arpa = new Random();
    private Pelaaja pelaaja = new Pelaaja();
    
    public Tapahtumat(){}
    
    public int Tapahtumat(int tapahtuma){
        tapahtuma = tapahtumat.nextInt(100);
        
        if (tapahtuma>=1 && tapahtuma<=15)
            JOptionPane.showMessageDialog(null, "Syötönkatko");

        if (tapahtuma>=16 && tapahtuma<=30)
            JOptionPane.showMessageDialog(null, "Sivurajaheitto");
            
        if (tapahtuma>=31 && tapahtuma<=50)
            JOptionPane.showMessageDialog(null, "Paitsio");
            
        if (tapahtuma>=51 && tapahtuma<=60)
            JOptionPane.showMessageDialog(null, "Maalipotku");
        
        if (tapahtuma>=61 && tapahtuma<=70)
            JOptionPane.showMessageDialog(null, "Kulmapotku");
    
        if (tapahtuma>=71 && tapahtuma<=80)
            JOptionPane.showMessageDialog(null, "Laukaus ohi maalin");
        
        if (tapahtuma>=81 && tapahtuma<=85)
            JOptionPane.showMessageDialog(null, "Laukaus maalia kohti");
        
        if (tapahtuma>=86 && tapahtuma<=95)
            JOptionPane.showMessageDialog(null, "Vapaapotku. Ei Maalia");
        
        if (tapahtuma>=96 && tapahtuma<=99)
            JOptionPane.showMessageDialog(null, "Vapaapotku. Maali");
        
        return tapahtuma;
    }
    
    public int Poikkeus(int poikkeus){
        poikkeus = arpa.nextInt(100);
        
        if (poikkeus>=1 && poikkeus<=25)
                    if (pelaaja.getHyokkays() <= pelaaja.getPuolustus())
                        JOptionPane.showMessageDialog(null, "MAAAALLIIII");
        
        if (poikkeus>=26 && poikkeus<=50)
            JOptionPane.showMessageDialog(null, "Keltainen kortti.");
        
        if (poikkeus>=51 && poikkeus<=55)
            JOptionPane.showMessageDialog(null, "Punainen kortti.");
        
        if (poikkeus>=56 && poikkeus<=60)
            JOptionPane.showMessageDialog(null, "Rangaistuspotku.");
        
        if (poikkeus>=61 && poikkeus<=65)
            JOptionPane.showMessageDialog(null, "Loukkaantuminen (voi jatkaa).");
        
        if (poikkeus>=66 && poikkeus<=70)
            JOptionPane.showMessageDialog(null, "Loukkaantuminen (ei voi jakaa).");

        if (poikkeus>=71 && poikkeus<=75)
            JOptionPane.showMessageDialog(null, "Pusku Maali.");
        
        if (poikkeus>=76 && poikkeus<=80)
            JOptionPane.showMessageDialog(null, "Vaihto.");
        
        if (poikkeus>=81 && poikkeus<=85)
            JOptionPane.showMessageDialog(null, "Oma Maali.");
        
        if (poikkeus>=86 && poikkeus<=90)
            JOptionPane.showMessageDialog(null, "Valmentaja stadionin puolelle.");
        
        if (poikkeus>=91 && poikkeus<=97)
            JOptionPane.showMessageDialog(null, "Viuhahtelija!");
        
        if (poikkeus>=98 && poikkeus<=99)
            JOptionPane.showMessageDialog(null, "Ufo laskeutuu ja vie pallot! Peli päättyy.");
        
        return poikkeus;
    }
}