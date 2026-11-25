public class Motor extends Thread {
    
    private volatile int potenciaObjetivo = 0;
    private int potenciaActual = 0;

    public Motor(int idMotor) {
        super("Motor "+ idMotor);

    }

    public void setPotencia(int p) {
        potenciaObjetivo = p;
    }



    @Override 
    public void run() {

        while(potenciaObjetivo != 0 || potenciaActual != 0) {
            

            try {
                sleep((long) (1000 + Math.random() * 1000));
            } catch (Exception e) {
                return;
            }    

            int objetivo = potenciaObjetivo;
            
            
            String movimiento;

            
            if (potenciaActual < objetivo) {
                potenciaActual++;
                movimiento = "Incre.";
            } else if (potenciaActual > objetivo) {
                potenciaActual--;
                movimiento = "Decre.";
            } else {                    
                movimiento = "FerRes";
            }

            System.out.printf("%s: %s Objectiu: %d Actual: %d\n", getName(), movimiento, objetivo, potenciaActual);
        }
    }

}
