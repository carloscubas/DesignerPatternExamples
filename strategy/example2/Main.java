package example2;

public class Main {

    public static void main(String[] args) {

        CalculoImposto calculoImposto = new CalculoImposto(new PessoaFisica());

        System.out.println(calculoImposto.totalImposto(100));
    }
}
