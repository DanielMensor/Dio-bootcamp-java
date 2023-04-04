import java.util.Scanner;

public class Exercicio5 {
    
    /**
     * Exercicio aonde imprime a tabuada de um numero informado;
     * 
     * 
     * @author Danie Mensor;
     * 
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Qual tabuada você deseja visualizar?");
        numero = scan.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(numero + " x " + i + " = " + (numero*i) );
        }

        scan.close();
    }
}
