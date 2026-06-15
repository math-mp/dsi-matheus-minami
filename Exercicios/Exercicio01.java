import java.util.Scanner;
public class Exercicio01{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

            //inputs do usuario
            System.out.println("digite seu nome");
            String nome =  Scanner.nextLine();

            System.out.println("digite sua idade");
            int idade =  Scanner.nextInt();

            System.out.println("digite quantas horas de trabalho foram feitas");
            double horas =  Scanner.nextDouble();

            System.out.println("digite o valor recebido por hora");
            double valorHora =  Scanner.nextDouble();

            System.out.println("se tiver digite a quantidade de filhos abaixo de 14 anos");
            int filhos =  Scanner.nextInt();

            System.out.println("tempo de trabalho em anos");
            int tempoTrabalho =  Scanner.nextInt();

        //calculos necessarios para retorno
        double salarioFamilia = filhos * 50.00;
        double salarioBruto = horas * valorHora;
        double descontoInps = salarioBruto * 0.085;
        
        //calculo do IR
        double impostoRenda;
        if (salarioBruto > 1500.00){
            impostoRenda = salarioBruto * 0.15;
        }
        else if (salarioBruto > 500.00 && salarioBruto < 1500.00){
            impostoRenda = salarioBruto * 0.08;
        }
        else{
            impostoRenda = 0;
        }

        //calculo de bonus
        double adic = 0;
        if (idade > 40){
            adic = salarioBruto * 0.02;
            if(tempoTrabalho > 15 ){
                adic += salarioBruto * 0.035;
            }
            else if(tempoTrabalho < 15 && tempoTrabalho > 5 && idade > 30){
                adic += salarioBruto * 0.015;
            }
        }
        
        //calculo de salario liquido
        double salarioLiquido = (salarioBruto - impostoRenda - descontoInps)+ adic + salarioFamilia;
        double salarioBrutoFinal = salarioBruto + adic + salarioFamilia;
        double valorBonus = adic + salarioFamilia;

        //mostrando resultados
        System.out.println(nome +" seu salario liquido é de: "+salarioLiquido+"R$\n"
        +"seu salario bruto é de: "+salarioBrutoFinal+"R$\n"+
        "o valor adicional de bonus é de: "+valorBonus+"R$\n");
    }
}