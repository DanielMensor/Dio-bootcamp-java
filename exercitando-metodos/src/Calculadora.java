public class Calculadora {
    

    public void soma(double n1, double n2){

        double resposta;

        resposta = n1 +n2;
        System.out.println(n1 + " + " + n2 + " : " + resposta);
    }

    public void subtracao(double n1, double n2){
        double resposta;

        resposta = n1 - n2;
        System.out.println(n1 + " - " + n2 + " : " + resposta);
    }

    public void divisao(double n1, double n2){
        double resposta;

        resposta = n1 / n2;
        System.out.println(n1 + " / " + n2 + " : " + resposta);
    }

    public void multipicacao(double n1, double n2){
        double resposta;

        resposta = n1 * n2;
        System.out.println(n1 + " x " + n2 + " : " + resposta);
    }
}
