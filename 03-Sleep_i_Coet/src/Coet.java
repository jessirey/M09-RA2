
import java.io.IOException;
import java.util.Scanner;

public class Coet {


    private Motor[] motores = new Motor[4];

    public Coet() {
            
        for (int i = 0; i < motores.length; i++) {
            motores[i] = new Motor(i);
        }
    }

    public void passaAPotencia(int p) {
        if (p < 0 || p > 10 ) {
            throw new IllegalArgumentException("La potencia no esta entre 0 y 10");
        }

        System.out.println("Passant a potència " + p);

        for(Motor motor : motores) {
            motor.setPotencia(p);
        }
    }

    public void arranca() {

        for(Motor motor : motores) {
            motor.start();
        }
    }

    public static void main(String[] args) throws  IOException {

        Coet coet = new Coet();
       
        Scanner scanner = new Scanner(System.in);
        boolean estaEnMarcha = true;
        boolean yaArranco = false;
        
        while (estaEnMarcha) { 
            int p = scanner.nextInt();
            try {
                coet.passaAPotencia(p);

                if(!yaArranco) {
                    coet.arranca();
                    yaArranco = true;
                }
                if (p == 0) {
                    estaEnMarcha = false;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        for(Motor motor : coet.motores) {

            try {
                motor.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
         scanner.close();
    }

}


