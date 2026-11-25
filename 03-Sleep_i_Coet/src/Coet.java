
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
        if (p > 0 || p <= 10 ) {

        }

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
        int p;
        while () { 
            
        }
    }

}


