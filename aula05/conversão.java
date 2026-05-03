public class conversão
{
	public static void main(String[] args) {

        //narrowing converter para menos

        double  myDouble = 9.78d;
        int myInt = (int) myDouble; //converte a variavel tipo double para int dentro da variavel myInt

        System.out.println( myDouble); //printa 9.78
        System.out.println( myInt); //printa 9

        //widening converter para mais

        int myInt2 = 9;
        double myDouble2 = myInt; //armazena a variavel myInt2 como uma variavel double dentro de myDouble2
        System.out.println(myInt2);    // printa 9
        System.out.println(myDouble2); // printa 9.0
    }
}
