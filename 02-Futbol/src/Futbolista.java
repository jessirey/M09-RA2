public class Futbolista extends Thread {

    private static final int NUM_JUGADORS = 11;
    private static final int NUM_TIRADES = 20;
    private static final float PROBABILITAT = 0.5f;

    private int ngols;
    private int ntirades;
    
    public Futbolista(String nombre) {
        super(nombre);
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

        for(int j = 1; j <=NUM_TIRADES; j++) {
                
            if(Math.random() < PROBABILITAT) {
                ngols++;
            }
            ntirades++;
              
        }
        
    }
    public static void main(String[] args) {
        
        String[] nombreFutbolistas = {"Piqué", "Vinicius", "Torres", "Ramos", "Ronaldo",
                         "Lewan", "Belli", "Arnau", "Aspas", "Messi", "MBapé"};

        Futbolista[] futbolistas = new Futbolista[NUM_JUGADORS];

        for (int i = 0; i < NUM_JUGADORS; i++) {
            futbolistas[i] = new Futbolista(nombreFutbolistas[i]);
        }

        System.out.println("Inici dels xuts---------------");
        for (Futbolista futbol : futbolistas ) {
            futbol.start();
        }
        System.out.println("Fi dels xuts---------------");
        System.out.println("-------Estadístiques-------");
        for (Futbolista futbol : futbolistas) {

            try {
                futbol.join();               
            } catch (InterruptedException e) {
                System.err.println("Error");
            }
            System.out.printf("%-10s-> %d gols\n", futbol.getName(), futbol.ngols);
        }

    }

}
