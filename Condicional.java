public class Condicional {

    public static void main(String[] args) {

        int AnoDeLancamento = 2019;
        boolean IncluidoNoPlano = true;
        double NotaDoFilme = 6.5;
        String tipoPlano = "plus";

        if (AnoDeLancamento >= 2018) {
            System.out.println("lancamento que os clientes gostam");

        } else {
            System.out.println("filme retro que vale a pena assistir");

        }

        if (IncluidoNoPlano == true || tipoPlano.equals("plus")) {
            ;
            System.out.println("filme liberado");

        } else {
            System.out.println("Deve pagar o aluguel!");

        }

    }

}
