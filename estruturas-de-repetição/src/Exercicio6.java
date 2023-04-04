import java.util.Scanner;

/**
 * Exercicio que calcula o fatorial de um numero;
 * 
 * @author Daniel Mensor;
 */

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        


        System.out.println("Informe o numero do fatorial que deseja ver:");
        numero = scan.nextInt();
        int res=numero;
        for(int i=(numero-1); i >0 ; i--){
            res *= i;
        }

        System.out.println("Resultado = " +  res);

        scan.close();
    }
}
