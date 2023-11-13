package example2;

import java.util.ArrayList;
import java.util.List;

public  class PessoaFisica implements TaxGroup {

    List<Tax> totalTaxes = new ArrayList<>();

    public PessoaFisica(){
        totalTaxes.add(new Inss());
        totalTaxes.add(new Iptu());
        totalTaxes.add(new Ipva());
    }

    @Override
    public double totalTax(double value){
        double total = 0;
        for (Tax tax: totalTaxes) {
            total = +tax.calculate(value);
        }
        return total;
    }


}
