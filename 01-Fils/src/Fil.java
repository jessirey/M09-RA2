public class Fil extends Thread{

    private final String nombre;
    private final int delay;
    

    public Fil(String nombre, int delay) {
        
        super(nombre);
        this.nombre = nombre;
        this.delay = delay;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 9; i++) {

            System.out.println(nombre + " " + i);

             if (delay > 0) {

                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }    
                
             } else {
                int contador = 1;

                for(int j = 0; j <= 1000; j++) {
                    contador++;
                }
            }
        }    

        System.out.println("Acaba el fil: " + nombre);
        
    }

}