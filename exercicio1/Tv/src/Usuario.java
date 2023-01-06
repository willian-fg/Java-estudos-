public class Usuario {

    public static void main(String[] args) {
        
    

        Tv smarTv = new Tv();

        System.out.println("Ligada ; " + smarTv.ligada);
        System.out.println("Canal ; " + smarTv.canal);
        System.out.println("Volume ; " + smarTv.volume);

        smarTv.ligar();

        System.out.println(" Ligada? ; " + smarTv.ligada);


    }

}
