import java.util.Scanner;


/**
 * exercicio que recebe um programa que lê um vetor de letras e dovolve as consoante e a quantidade.
 * 
 * @author Daniel Mensor
 */

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] vetor = new String[6];

        int count=0;
        do{
            System.out.println("letra: ");
            vetor[count]= scan.next();
            count++;
        }while(count<6);

        System.out.println(" ");

        int quantidadeDeConsoantes=0;

        for(int i=0;i<vetor.length;i++){
            if(!(vetor[i].equalsIgnoreCase("a")) && !(vetor[i].equalsIgnoreCase("e")) && !(vetor[i].equalsIgnoreCase("i")) && !(vetor[i].equalsIgnoreCase("o")) && !(vetor[i].equalsIgnoreCase("u"))){
                quantidadeDeConsoantes++;
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("quantidade de consoantes: " +quantidadeDeConsoantes);

        scan.close();
    }
}
