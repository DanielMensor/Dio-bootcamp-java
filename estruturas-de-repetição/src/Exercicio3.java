import java.util.Locale;
import java.util.Scanner;

/**
 * Exercíco Pedindo 5 numero e informando a média deles e o maior numero informado;
 * 
 * @author Daniel Mensor;
 */

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double numero;
        double maior=0;
        double soma=0;


        int count=0;
        do{
            System.out.println("numero:");
            numero = scan.nextDouble();

            if(numero> maior){
                maior = numero;
            }

            soma +=numero;
            count++;
        }while(count<5);

        System.out.println("maior numero informado : " + maior);
        System.out.println("média dos 5 numeros:" + (soma/5));

        scan.close();

    }
}
