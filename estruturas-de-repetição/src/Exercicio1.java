import java.util.Scanner;
/**
 * @author Daniel Mensor;
 * 
 * Exercício lendo nome e idade e repetindo até que informem 0 como nome;
 */
public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        
        String nome;
        int idade;

        while(true){
            
            System.out.println("Qual o nome do Aluno? ");
            nome = s.next();
            if(nome.equals("0"))  break;
    
            System.out.println("Qual a idade do Aluno? ");
            idade = s.nextInt();

            System.out.println("nome do aluno: " + nome + ", Idade: " + idade);
        }

        System.out.println("Terminando");
        s.close();
    }
}
