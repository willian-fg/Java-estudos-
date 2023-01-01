package Cursojava.Sintax;

public class TesteDeVariaveiseMetodos{

    public static void main (String [] args) {

        String primeironome = "will";
        String segundonome = "flor";

        String nomecompleto = nomecompleto (primeironome, segundonome, " ");

        System.out.print(nomecompleto);
    }

    public static String nomecompleto (String primeironome, String segundonome, String string) {
        return primeironome.concat(" ").concat(segundonome);

        
    }
}