public class Motor extends Thread {
    
    private int potenciaObjetivo = 0;
    private int potenciaActual = 0;

    public Motor(int idMotor) {
        super("Motor "+ idMotor);

    }

    public void setPotencia(int p) {
        potenciaObjetivo = p;
    }



    @Override 
    public void run() {

        while(true) {
            

            try {
                sleep((long) ((1000) - Math.random()-1001));
            } catch (Exception e) {
                System.err.println("Error");
            }    

            int objetivo = potenciaObjetivo;
            
            
            String movimiento;

            
            while (potenciaActual != objetivo) {
                if (potenciaActual < objetivo) {
                    potenciaActual++;
                    movimiento = "Incre.";
                } else if (potenciaActual > objetivo) {
                    potenciaActual--;
                    movimiento = "Decre.";
                } else {                    
                    movimiento = "FerRes";
                }
            }
        }
    }

}
