public class PrincipalDiferents {

    public static void main(String[] args) {
        
        fil juan = new Fil();
        fil pepe = new Fil();

        juan.setPriority(Thread.MAX_PRIORITY);
        pepe.setPriority(Thread.MIN_PRIORITY);

        juan.start();
        pepe.start();
    }
}