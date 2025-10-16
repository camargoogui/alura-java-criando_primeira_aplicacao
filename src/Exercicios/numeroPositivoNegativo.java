/*
Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
 */

package Exercicios;

import java.util.Scanner;

public class numeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero e direi se e positivo ou negativo");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println(numero + " e positivo");
        } else {
            System.out.println(numero + " e negativo");
        }
    }
}
