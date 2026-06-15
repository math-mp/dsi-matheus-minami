public class break{
    public static void main(String[] args) {

        //break é utilizado para sair de uma função condicional ou de loop 
        for(int i = 0; i>10; i++){

            System.out.println(i);

            if (i == 6){
                break;
                //quando i for igual a 6 o loop quebra
            }
        }

        //continue é utilizado para "pular" uma parte do procedimento de um condicional ou loop
        for(int i = 0; i>10; i++){
            
            if (i == 4){
                continue;
                //quando i for igual a 4 o loop pula o print do numero 4
            }

            System.out.println(i);
        }


    }
}