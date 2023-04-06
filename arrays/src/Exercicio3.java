import java.util.Random;


/**
 * exercicio que lê 20 numeros aleatórios e os exibe, e mostra os sucessores e antecessores.
 * 
 * @author Daniel Mensor
 */
public class Exercicio3 {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numeros = new int[20];

        for(int i = 0; i<20;i++){
            numeros[i] = random.nextInt(100);
        }

        System.out.println("Numeros aleatórios: ");
        for (int i : numeros) {
            System.out.print(i +" ");
        }

        System.out.println("");
        System.out.println("Antecessor dos numeros aleatórios");
        for (int i : numeros) {
            System.out.print((i-1) + " ");
        }

        System.out.println("");
        System.out.println("Sucessores dos numeros aleatórios");
        for (int i : numeros) {
            System.out.print((i+1) + " ");
        }


    }
}
