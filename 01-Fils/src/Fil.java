public class Fil implements Runnable {

    private final int contador;

    Fil(int contador) {
        this.contador = contador;
    }

    @Override
    public void run() {

        contador = 1;
        for(int i = 0; i <= 1000; i++) {
            contador++;
        }
        System.out.println("Acaba thread main");
    }

}