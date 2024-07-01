public class ExercFixacao {
    public static void main(String[] args) {

        System.out.println("Imprima todos os números de 150 a 300.");
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------------");
        
        System.out.println("Imprima a soma de 1 até 1000.");
        
        for (int a = 1; a <= 1000; a++) {
            System.out.println(a);
        }

        System.out.println("----------------------------------------------------");

        
        System.out.println("Imprima todos os múltiplos de 3, entre 1 e 100.");
        
        for (int b = 1; b <= 100; b++) {
            if (b % 3 == 0) {
                System.out.println(b);
            }
        }
        
        System.out.println("----------------------------------------------------");

        
        System.out.println("Imprima os fatoriais de 1 a 10.");
        /*
        O fatorial de um número n é n * (n-1) * (n-2) * ... * 1. Lembre-se de utilizar os parênteses.
        O fatorial de 0 é 1
        O fatorial de 1 é (0!) * 1 = 1
        O fatorial de 2 é (1!) * 2 = 2
        O fatorial de 3 é (2!) * 3 = 6
        O fatorial de 4 é (3!) * 4 = 24
        Faça um for que inicie uma variável n (número) como 1, fatorial (resultado) como 1 e varia n de 1 até 10:
        int fatorial = 1;
        for (int n = 1; n <= 10; n++) {

        }
        */

        int fatorial = 1;
        for (int n = 1; n <= 10; n++) {
            fatorial = fatorial * n;
            System.out.println("Fatorial de " + n + " = " + fatorial);
        }

        System.out.println("----------------------------------------------------");
        
        System.out.println("");
        //o código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos até 20, 30 e 40. Em um determinado momento, além de esse cálculo demorar, começará a mostrar respostas completamente erradas. Por quê? Mude de int para long a fim de ver alguma mudança.

        // as variaveis erradas é por causa do overflow de variáveis inteiras em Java, que é quando o valor exceede o limite max que ele pode armazenar
        long fatorialMaior = 1;
        for (int n = 1; n <= 30; n++) {
            fatorialMaior = fatorialMaior * n;
            System.out.println("Fatorial de " + n + " = " + fatorialMaior);
        }

        System.out.println("----------------------------------------------------");

        
        System.out.println("(Opcional) Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, e daí por diante. O n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).");
        
        int num0 = 0;
        int num1 = 1;
        int Fibonacci;

        System.out.println(num0);
        System.out.println(num1);

        Fibonacci = num0 + num1;
        while (Fibonacci <= 200 ) {
            System.out.println(Fibonacci);

            num0 = num1;
            num1 = Fibonacci;
            Fibonacci = num0 + num1;
        }

        System.out.println("----------------------------------------------------");

         
        System.out.println("Valor inteiro de uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra: \r\n" + //
                        "Se x é par, x = x / 2; \r\n" + //
                        "Se x é impar, x = 3 * x + 1; \r\n" + //
                        "Imprime x;");
        /* 
        (Opcional) Escreva um programa em que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
        
        Se x é par, x = x / 2; 
        Se x é impar, x = 3 * x + 1; 
        Imprime x; 
        O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13, a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1"); 

            Imprimindo sem pular linha
            Um detalhe importante é que uma quebra de linha é impressa toda vez que chamamos println. Para não pular uma linha, usamos o código a seguir:

                System.out.print(variavel);");
        */

        int x = 13;

        while (x != 1) {
            System.out.print(x + " - ");
            if(x % 2 == 0){
                x = x/2;
            } else {
                x = 3 * x + 1;
            }
        }

        System.out.println(x);

        System.out.println("----------------------------------------------------");

        System.out.println("Imprima a seguinte tabela usando fors encadeados:\r\n" + //
                        "\r\n" + //
                        "        1\r\n" + //
                        "        2 4\r\n" + //
                        "        3 6 9\r\n" + //
                        "        4 8 12 16\r\n" + //
                        "        n n*2 n*3 .... n*n'");
                        
        int n = 8; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------");

        System.out.println("Desafios: Fibonacci\r\n" + //
                        "Faça o exercício da série de Fibonacci usando apenas duas variáveis.");
        

        
    }    
}
