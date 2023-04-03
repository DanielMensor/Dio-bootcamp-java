public class Operadores {
    public static void main(String[] args) {
        boolean b = (5<7);/* 5 é menor que 7 retornando true*/
        b = (5>7); /* 5 maior que 7 retornando false */
        b = (5>=7); /*5 maior ou igual a 7 retornando false */
        b = (5<=7); /*5 menor ou igual a 7 retornando true */
        b = (5==7); /*5 igual a 7 retornando false */
        b = (5!=7); /*5 diferente de 7 retornando true */


        b = (5==7 && 3>1); /*5 igual a 7 e 3 maior que 1 retornando false */
        b = (5==7 || 3>1); /*5 igual a 7 ou 3 maior que 1 retornando true */

        b = (5>7 ? true : false); /* se 5 for maior que 7 retorna true se não retorna false */
        
    }
}
