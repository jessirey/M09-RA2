public class Administracio {

    private int num_poblacio_activa = 50;
    private Treballador[] poblacio_activa;

    public Administracio() {
        poblacio_activa =  new Treballador[num_poblacio_activa];
        for (int i = 0; i < num_poblacio_activa; i++) {
            
            poblacio_activa[i] = new Treballador("Ciutadà-"+ i, 25000, 20, 65);
        }
    }

    public void marxa() {

        for(Treballador ciudad : poblacio_activa) {
            ciudad.start();           
        }

        for(Treballador ciudad : poblacio_activa) {
            try {
                ciudad.join();
            } catch (InterruptedException e) {
                System.err.println("Error");
            }
        }

        for(Treballador ciudad : poblacio_activa) {
            
            System.out.printf("%s -> edat: %d / total: %.2f\n", ciudad.getName(), ciudad.getEdat(), ciudad.getCobrat());
        }
    }

    public static void main(String[] args) {
 
        new Administracio().marxa();
    }
}
