/*
Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
 */

package Exercicios;

import java.util.Scanner;

public class NumeroIgualOuDiferente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 2 numeros inteiros, vou comparar e dizer se sao iguais, diferentes ou qual e maior");
        System.out.println("Digite o primeiro numero");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o seegundo numero");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println(numero1 + " e " + numero2 + " sao iguais!");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro numero e maior");
        } else {
            System.out.println("O segundo numero e maior");
        }
    }
}
