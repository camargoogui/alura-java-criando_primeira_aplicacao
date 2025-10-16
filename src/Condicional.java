public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022){
            System.out.println("Lancamento que os cliente estao gostando");
        } else{
            System.out.println("Filme retro que vale a pena assistir");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado para assistir!");
        } else {
            System.out.println("Deve pagar o filme!");
        }
    }
}
