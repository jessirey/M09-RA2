public class DormAleatori extends Thread {

   
    private Thread thread;
    

    public DormAleatori(String nombre) {
        super(nombre);
        this.thread = new Thread();
       
    }

    @Override 
    public void run() {

        for (int i = 0; i < 10; i++) {
            
        
        try {
            sleep(1000);

           
        } catch (InterruptedException ex) {
            System.err.print("Error");
        }
        long tiempo = System.currentTimeMillis();
        System.out.printf("%s (%d) a dormir %d ms total \n", getName(), thread.getPriority(), (System.currentTimeMillis()- tiempo));
    }
    }


    public static void main (String[] agrs) {

        DormAleatori joan = new DormAleatori("Joan");
        DormAleatori pep = new DormAleatori("Pep");
        
        joan.setPriority(NORM_PRIORITY);
        pep.setPriority(NORM_PRIORITY);

        joan.start();
        pep.start();
      
        System.out.println("--Fi de main---------");
    }

}
