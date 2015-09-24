package el.classico;
import javax.swing.JOptionPane;
import java.util.Random;

public class Tapahtumat {

    private Random tapahtumat = new Random();
    private Random arpa = new Random();
    
    public Tapahtumat(){}
    
    public Tapahtumat(int tapahtuma){
        tapahtuma = tapahtumat.nextInt(100);

        if (tapahtuma>=1 && tapahtuma<=30)
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
    }
    public void Maali(int maali){
        maali = arpa.nextInt(100);
        
        if (maali>=1 && maali<=25)
            JOptionPane.showMessageDialog(null, "Maali.");
        
        if (maali>=26 && maali<=50)
            JOptionPane.showMessageDialog(null, "Keltainen kortti.");
        
        if (maali>=51 && maali<=55)
            JOptionPane.showMessageDialog(null, "Punainen kortti.");
        
        if (maali>=56 && maali<=60)
            JOptionPane.showMessageDialog(null, "Rangaistuspotku.");
        
        if (maali>=61 && maali<=65)
            JOptionPane.showMessageDialog(null, "Loukkaantuminen (voi jatkaa).");
        
        if (maali>=66 && maali<=70)
            JOptionPane.showMessageDialog(null, "Loukkaantuminen (ei voi jakaa).");

        if (maali>=71 && maali<=75)
            JOptionPane.showMessageDialog(null, "Pusku Maali.");
        
        if (maali>=76 && maali<=80)
            JOptionPane.showMessageDialog(null, "Vaihto.");
        
        if (maali>=81 && maali<=85)
            JOptionPane.showMessageDialog(null, "Oma Maali.");
        
        if (maali>=86 && maali<=90)
            JOptionPane.showMessageDialog(null, "Valmentaja stadionin puolelle.");
        
        if (maali>=91 && maali<=97)
            JOptionPane.showMessageDialog(null, "Viuhahtelija!");
        
        if (maali>=98 && maali<=99)
            JOptionPane.showMessageDialog(null, "Ufo laskeutuu ja vie pallot! Peli päättyy.");
    }
}