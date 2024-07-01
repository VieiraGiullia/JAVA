/*
Declaração, atribuição de valores, casting e comparação de variáveis;
Controle de fluxo por meio de if e else;
Instruções de laço for e while, controle de fluxo com break e continue.
 */

public class Variavel {
    public static void main(String[] args) {
        // declara a idade.
        int idade = 15;
        // imprime a idade.
        System.out.println(idade);

        // calcula a idade no ano seguinte.
        int idadeProxAno;
        idadeProxAno = idade + 1;
        System.out.println(idadeProxAno);

        // operadores matemáticos
        int quatro = 2 + 2;
        int tres = 5 - 2;

        int oito = 4 * 2;
        int dezesseis = 64 / 4;

        int um = 5 % 2;  // 5 dividido por 2 dá 2, e tem resto 1; 
        // o operador % pega o resto da divisão inteira.
    
        // double - guarda valores reais, um número com ponto flutuante (e que também pode armazenar um número inteiro)
        double pi = 3.14;
        double x = 5 * 10;

        // boolean -  um valor verdadeiro ou falso
        boolean menorDeIdade = idade < 18;
        System.out.println(menorDeIdade);

        // char - um único caractere
        char letra = 'a';
        System.out.println(letra);

        // casting - converter um tipo de variável em outro
        double d = 3.14;
        int i = (int) d;
        System.out.println(i);

        // comparação de variáveis
        int a = 5;
        int b = 10;
        boolean igual = a == b;
        System.out.println(igual);

        // condição booleana e operadores lógicos
        boolean condicao = a < b && a > 0;
        System.out.println(condicao);
        // operadores <, >, <=, >=
        // operadores lógicos && (e), || (ou), ! (não)

        // if e else
        if (a < b) {
            System.out.println("a é menor que b");
        } else {
            System.out.println("a é maior ou igual a b");
        }

        // for
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        // while
        int k = 0;
        while (k < 5) {
            System.out.println(k);
            k++;
        }

        // break e continue
        for (int l = 0; l < 10; l++) {
            if (l == 5) {
                break;
            }
            if (l == 3) {
                continue;
            }
            System.out.println(l);
        }


    }
}