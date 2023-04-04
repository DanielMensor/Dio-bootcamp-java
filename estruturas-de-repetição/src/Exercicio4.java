import java.util.Scanner;


/**
 * Exercicio que pede uma quantidade de numeros N e retorna a quantidade de numeros impares e pares informada;
 * 
 * @author Daniel Mensor
 */
public class Exercicio4 {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n;
        int quantidadePar = 0;
        int quantidadeInpar = 0;

        int count=0;

        System.out.println("quantos numeros você irá informar?");
        n = scan.nextInt();
        do{
            int numero;
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if((numero%2) == 0){
                quantidadePar++;
            }else{
                quantidadeInpar++;
            }
            count++;

        }while(count<n);

        System.out.println("Quantidade de numeros pares " + quantidadePar);
        System.out.println("Quantidade de numeros Inpares " + quantidadeInpar);

        scan.close();

    }
}
