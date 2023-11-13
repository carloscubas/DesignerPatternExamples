package example2;

import java.util.ArrayList;
import java.util.List;

public class PessoaJuridica implements TaxGroup {

    List<Tax> totalTaxes = new ArrayList<>();

    public PessoaJuridica(){
        totalTaxes.add(new Iptu());
        totalTaxes.add(new Ipva());
    }

    @Override
    public double totalTax(double value){
        double total = 0;
        for (Tax tax: totalTaxes) {
            total += tax.calculate(value);
        }
        return total;
    }
}
