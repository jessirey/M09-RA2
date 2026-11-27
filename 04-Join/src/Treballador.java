
import java.util.Random;

public class Treballador extends Thread {

    private float sou_anual_brut;
    private int edat_inici_treball;
    private int edad_fi_treball;
    private float cobrat;
    private int edat_actual;
    private Random rnd;

    public Treballador(String nombre, float sou_anual_brut, int edat_inici_treball, int edad_fi_treball) {
        super(nombre);
        this.sou_anual_brut = sou_anual_brut;
        this.edat_inici_treball = edat_inici_treball;
        this.edad_fi_treball = edad_fi_treball;
        edat_actual = 0;
        cobrat = 0.0f; 
        this.rnd = new Random();
    }

    public float cobra() {
        return cobrat += (sou_anual_brut/12);
    }

    public float pagaImpostos() {
        return cobrat -= (sou_anual_brut/12) * 0.24f;
    }

    public float getCobrat() {
        return cobrat;
    }

    public int getEdat() {
        return edat_actual;
    }

    @Override
    public void run() {
        
        for (edat_actual = edat_inici_treball; edat_actual < edad_fi_treball; edat_actual++) {  
           
            for (int j = 0; j < 12; j++) {              
                cobra();
                pagaImpostos();
                
            } 
        }
        edat_actual = edad_fi_treball;    
    }    
        
}
