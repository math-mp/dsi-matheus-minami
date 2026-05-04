public class homework{
    public static void main(String[] args){
        //operadores de atribuição

        //operador = atribui valor a uma variavel
        int x = 5;
        System.out.println(x);

        //operador += soma valor definido a uma variavel ja existente
        x += 3;
        System.out.println(x);

        //operador -= subtrai um valor definido a uma variavel ja existente
        x -= 3
        System.out.println(x);

        //operador *= multiplica um valor definido a uma variavel ja existente
        x *= 3
        System.out.println(x);

        //operador /= divide um valor definido a uma variavel ja existente
        x /= 3
        System.out.println(x);

        //operador %= retorna o resto da divisão entre um valor definido a uma variavel ja existente
        x %= 3 
        System.out.println(x);

        //operador *= multiplica um valor definido a uma variavel ja existente
        x *= 3
        System.out.println(x);

        //operador &= realiza uma comparação and binaria entre os dois numeros resultando em um codigo binario onde somente se mantem 1 onde ambos são 1
        x = 5;   // 0101
        x &= 3;  // 0011
        System.out.println(x);// 0001 = 1

        //operador &= realiza uma comparação or binaria entre os dois numeros resultando em um codigo binario onde se qualquer elemento for 1 ele se mantem 1
        x = 5;   // 0101
        x |= 3;  // 0011
        System.out.println(x);// 0111 = 7
        
        //operador ^= realiza uma comparação xor(exclusive or) binaria entre os dois numeros resultando em um codigo binario onde 0 sobre 0 = 0, 1 sobre 1 = 0 e 1 sobre 0 ou vice versa = 1.
        x = 5;   // 0101
        x ^= 3;  // 0011
        System.out.println(x);// 0110 = 6

        //operador >>= realiza uma comparação binaria entre os dois numeros onde os bits são deslocados do numero original para direita (shift) uma quantia de vezes definida
        //pode se observar: a cada shift o numero é dividido por 2
        x = 8; // 1000
        x >>= 2 ; //2 shifts
        System.out.println(x);// 0010 = 2

        //operador <<= realiza uma comparação binaria entre os dois numeros onde os bits são deslocados do numero original para esquerda (shift) uma quantia de vezes definida
        //pode se observar: a cada shift o numero é multiplicado por 2
        x = 3; // 0011
        x >>= 2 ; //2 shifts
        System.out.println(x);// 1100 = 12
    }
}