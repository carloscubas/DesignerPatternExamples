package example2;

public class CalculoImposto {

    TaxGroup taxGroup;

    public CalculoImposto(TaxGroup taxGroup) {
        this.taxGroup = taxGroup;
    }

    public double totalImposto(double value){
        return this.taxGroup.totalTax(value);
    }
}
