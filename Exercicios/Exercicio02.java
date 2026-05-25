import java.util.Scanner;
public class Exercicio02{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

            //inputs do usuario
            System.out.println("digite seu nome");
            String nome =  Scanner.nextLine();

            System.out.println("digite seu sexo - masc - fem");
            String sexo =  Scanner.nextLine();

            System.out.println("digite quantas horas de trabalho foram feitas");
            double horas =  Scanner.nextDouble();

            System.out.println("digite o valor recebido por hora");
            double valorHora =  Scanner.nextDouble();

            System.out.println("tempo de trabalho em anos");
            int tempoTrabalho =  Scanner.nextInt();

            //salario bruto
            double salarioBruto = horas * valorHora;

            //somatoria bonus
            double bonus = 0;
            if (sexo == "fem" && tempoTrabalho > 10){
                bonus = salarioBruto * 0.25;
            }
            else if (sexo == "masc" && tempoTrabalho > 15){
                bonus = salarioBruto * 0.2;
            }
            else{
                bonus = 100.00;
            }

            System.out.println("o seu salario final mais o bonus de natal é de: "+(salarioBruto+bonus));
    }
}