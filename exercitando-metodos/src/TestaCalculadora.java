import java.text.SimpleDateFormat;
import java.util.Date;


public class TestaCalculadora {
    

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.soma(5, 7);
        c.subtracao(3, 4);
        c.divisao(10, 2);
        c.multipicacao(5, 5);


        Date dataHoraAtual = new Date();
        String hora = new SimpleDateFormat("HH").format(dataHoraAtual);

        Mensagem.obterMensagem(Integer.parseInt(hora));
        Mensagem.obterMensagem(2);
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(14);

        
    }
}
