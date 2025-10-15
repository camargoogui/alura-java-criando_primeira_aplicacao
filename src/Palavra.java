/*
Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
 */

public class Palavra {
    public static void main(String[] args) {
        char letra = 'G';
        String palavra = "Guilherme";

        String mensagem = "A inicial do meu nome é: " + letra + ", e o meu nome é: " + palavra;
        System.out.println(mensagem);

    }
}
