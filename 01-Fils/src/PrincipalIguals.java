public class PrincipalIguals {

    public static void main(String[] args) throws Exception {

        Fil juan = new Fil("Juan", 0);
        Fil pepe = new Fil("Pepe", 0);

        juan.setPriority(Thread.MAX_PRIORITY);
        pepe.setPriority(Thread.MAX_PRIORITY);
        
        pepe.start();
        juan.start();

        System.out.println("Acaba thread main");
    }
}