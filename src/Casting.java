/*
Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
 */

public class Casting {
    public static void main(String[] args) {
        double variavelDouble = 15.555;
        int variavelInt = (int) variavelDouble;
        System.out.println("Casting do double para int: " + variavelInt);
    }
}
