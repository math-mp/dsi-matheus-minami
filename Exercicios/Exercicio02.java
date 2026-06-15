import java.util.Scanner;
public class Exercicio02{
    public static void main(String[] args){
        Scanner meuScanner = new Scanner(System.in);

            //inputs do usuario
            System.out.println("digite seu nome");
            String nome =  meuScanner.nextLine();

            System.out.println("digite seu sexo - masc - fem");
            String sexo =  meuScanner.nextLine();

            System.out.println("digite quantas horas de trabalho foram feitas");
            double horas =  meuScanner.nextDouble();

            System.out.println("digite o valor recebido por hora");
            double valorHora =  meuScanner.nextDouble();

            System.out.println("tempo de trabalho em anos");
            int tempoTrabalho =  meuScanner.nextInt();

            //salario bruto
            double salarioBruto = horas * valorHora;

            //somatoria bonus
            double bonus;
            if (sexo == "fem" && tempoTrabalho > 10){
                bonus = salarioBruto * 0.25;
            }
            else if (sexo == "masc" && tempoTrabalho > 15){
                bonus = salarioBruto * 0.2;
            }
            else{
                bonus = 100.00;
            }

            System.out.println(nome +" o seu salario final mais o bonus de natal é de: "+(salarioBruto+bonus));

            meuScanner.close();
    }
}