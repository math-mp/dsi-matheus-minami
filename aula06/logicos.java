public class logicos {
    public static void main(String[] args){

        //operadores logicos concatenam comparações e utilizam filtros para retornar 1 resultado
        int x = 20;

        // no && (and) ambas as condiçoes precisam ser verdadeiras para o retorno ser true
        System.out.println(x < 5 && x > 10); //retorno: false
        
        // no || (or) somente uma condição precisa ser verdadeira para o retorno ser true
        System.out.println(x < 5 || x > 10); // retorno: true

        // o operador ! faz uma negação a declaração booleana anterior
        System.out.println(!(x < 100 && x > 10));// retorno: false
    }   
}