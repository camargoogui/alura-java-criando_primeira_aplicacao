public class Conversor {
    public static void main(String[] args) {
        double valorEmDolares = 50;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;
        System.out.println("O valor em reais é: " + valorEmReais);
    }
}
