public class DormAleatori extends Thread {

   
    private final long tiempo;
    

    public DormAleatori(String nombre) {
        super(nombre);
        tiempo = System.currentTimeMillis();
    }

    @Override 
    public void run() {

        for (int i = 0; i < 10; i++) {
            int delay = (int) (Math.random() * 1000);

            long tiempoTotal = System.currentTimeMillis() - tiempo;
            
            System.out.printf("%-5s(%d) a dormir %4dms total %6dms%n", getName(), i, delay, tiempoTotal);
        
            try {
                sleep(delay);
            
            } catch (InterruptedException ex) {
                System.err.print("Error");
            }
                
        }
    }


    public static void main (String[] agrs) {

        DormAleatori joan = new DormAleatori("Joan");
        DormAleatori pep = new DormAleatori("Pep");
        
    
        joan.start();
        pep.start();
      
        System.out.println("--Fi de main---------");
    }

}
