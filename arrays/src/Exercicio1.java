public class Exercicio1 {


    /**
     * Inverte um array de 5 inteiros
     * 
     * 
     * @author Daniel Mensor
     */
    public static void main(String[] args) throws Exception {

        int[] valores = {-5, 2, 4, 3, 1};

        for(int i=0;i<valores.length;i++)
        System.out.print(valores[i] + " ");

        System.out.println("");
        System.out.println("======================");
        for(int i=(valores.length-1);i>=0;i--)
        System.out.print(valores[i] +" ");
        
    }
}
