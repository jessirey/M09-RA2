public class Futbolista extends Thread {

    private final int NUM_JUGADORS = 11;
    private final int NUM_TIRADES = 20;
    private final float PROBABILITAT = 0.5f;

    private int ngols;
    private int ntirades;
    
    public Futbolista() {
        ngols = 0;
        ntirades= 0;
    }

    public int getGols() {
        return ngols;
    }
    public void setGols(int ngols) {
        this.ngols = ngols;
    }
    public int getTirades() {
        return ntirades;
    }
    public void setTirades(int ntirades) {
        this.ntirades = ntirades;
    }

    @Override 
    public void run() {

        for (int i = 0; i <= NUM_JUGADORS; i++) {
                       
            for(int j = 0; j <=NUM_TIRADES; j++) {
                
                if(Math.random() > PROBABILITAT) {
                    ngols++;
                }
                ntirades++;
                
            }
        }
        
    }




    public static void main(String[] args) {
        
        Futbolista pique = new Futbolista();
        Futbolista vinicus = new Futbolista();
        Futbolista torres = new Futbolista();
        Futbolista ramos = new Futbolista();
        Futbolista ronaldo = new Futbolista();
        Futbolista lewan = new Futbolista();
        Futbolista belli = new Futbolista();
        Futbolista arnau = new Futbolista();
        Futbolista aspas = new Futbolista();
        Futbolista messi = new Futbolista();
        Futbolista mbape = new Futbolista();
        
        pique.setName("Piqué");
        vinicus.setName("Vinicus");
        torres.setName("Torres");
        ramos.setName("Ramos");
        ronaldo.setName("Ronaldo");
        lewan.setName("Lewan");
        belli.setName("Belli");
        arnau.setName("Arnau");
        aspas.setName("Aspas");
        messi.setName("Messi");
        mbape.setName("MBapé");

        pique.start();
        vinicus.start();
        torres.start();
        ramos.start();
        ronaldo.start();
        lewan.start();
        belli.start();
        arnau.start();
        aspas.start();
        messi.start();
        mbape.start();

    }

}
