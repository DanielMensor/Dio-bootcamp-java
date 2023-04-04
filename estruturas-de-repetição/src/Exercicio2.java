import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        double nota;

        System.out.println("Informe uma nota entre 0 e 10");
        nota = scan.nextDouble();

        while(nota>10||nota<0){
            System.out.println("Nota invalida informe novamente uma nota entre 0 e 10:");
            nota = scan.nextDouble();
        }
        System.out.println("nota informada: " + nota);
        scan.close();
    }
}
