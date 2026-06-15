public class switch{
    public static void main(String[] args) {
        //switch é um condicional que seleciona uma ou mais condições que são verdadeiras dentro de uma lista
        //utilizando um parametro que é comparado com todos os casos

        String x = "saudações";

        switch (x){

        case "maluco":
            System.err.println("voce é maluco");
            break;
        
        case "saudações":
            System.err.println("olá mundo");
            break;

        case "eu amo":
            System.err.println("pipoca");
            break;

        default:
            System.err.println("sem match");
        }
    }
}
