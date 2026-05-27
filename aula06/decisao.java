public class decisao {
    public static void main(String[] args){
        //a condição filtra um bloco de codigo para somente ser executado caso uma condição seja verdadeira ou falsa
        int x = 3;
        
        //checa uma condição e executa o codigo dentro da chave
        if(x >= 3){
        System.out.println("hello world");
        }
        //else if é a condição observada caso a primeira ou a anterior nao tenha sido cumprida
        else if (x <= 2){
            System.out.println("olá mundo");
        }
        //else é a condição caso nenhuma a cima foi cumprida
        else{

        }
    }
}