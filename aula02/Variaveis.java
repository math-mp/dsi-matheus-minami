package aula02;

public class Variaveis {
    public static void main(String[] args) {
        String msgPt1 = "olá mundo";
        String msgPt2 = "olá planeta";
        System.out.println (msgPt1 + msgPt2); //(msgPt1.concat(msgPt2)); //faz concatenação de variaveis

        int n1 = 1;
        String n2 = "2";
        System.out.print(n1+n2); // (n1 + integer.parseInt(n2)); converte a string em tipo primitivo para permitir a soma
    }
}
