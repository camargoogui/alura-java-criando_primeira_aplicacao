/*
Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.
 */

package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Scanner chute = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 10){
            System.out.println("Chute um numero de 0 a 100");
            numeroDigitado = chute.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabens vc acertou, o numero e" + numeroGerado);
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero e maior");
            } else {
                System.out.println("O numero e menor");
            }

            if (tentativas == 10 && numeroDigitado != numeroGerado){
                System.out.println("Vc errou e acabou as tentativas!");
                System.out.println("O numero era: " + numeroGerado);
            }
        }
    }
}
