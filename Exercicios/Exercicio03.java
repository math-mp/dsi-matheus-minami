import java.util.Scanner;
public class Exercicio03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //inputs do usuario
        System.out.println("digite o primeiro lado");
        double a = scanner.nextDouble();

        System.out.println("digite o segundo lado");
        double b = scanner.nextDouble();

        System.out.println("digite o terceiro lado");
        double c = scanner.nextDouble();

        //checa qual o maior dos lados
        //checa se a é o maior lado se sim classifica os outros
        if (a>b && a>c){
            System.out.println("1st: "+ a);
            if (b>c) {
            System.out.println("2nd: "+ b + "\n" + "3rd: "+ c);
            }
            else {
            System.out.println("2nd: "+ b + "\n" + "3rd: "+ c);
            }
        }
        //checa se b é o maior lado se sim classifica os outros
        else if (b>c && b>a){
            System.out.println("1st: "+ b);
            if (a>c) {
            System.out.println("2nd: "+ a + "\n" + "3rd: "+ c);
            }
            else {
            System.out.println("2nd: "+ c + "\n" + "3rd: "+ a);
            }
        }
        // se nem a nem b forem os maiores c é o maior
        else {
            //classifica c como primeiro
            System.out.println("1st: "+ c);
            //checa e posiciona os demais numeros
            if (b>c) {
            System.out.println("2nd: "+ b + "\n" + "3rd: "+ c);
            }
            else {
            System.out.println("2nd: "+ c + "\n" + "3rd: "+ b);
            }
        }
        //potenciação de a, b, c 
        double potA = Math.pow(a, 2);
        double potB = Math.pow(b, 2);
        double potC = Math.pow(c, 2);
        double soma = potB + potC;

        //classificação dos triangulos
        if (a>c+b){
            System.out.println("não forma um triângulo");
        }
        else if(potA == soma){
            System.err.println("triangulo retângulo");
        }
        else if(potA > soma){
            System.err.println("triangulo obtusângulo");
        }
        else if(potA < soma){
            System.err.println("triangulo acutângulo ");
        }

        if (a==b && a==c) {
            System.err.println("triangulo equilatero");
        }
        else if (a==b || b==c || a==c){
            System.out.println("triangulo isoceles");
        }

        scanner.close();
    }
}