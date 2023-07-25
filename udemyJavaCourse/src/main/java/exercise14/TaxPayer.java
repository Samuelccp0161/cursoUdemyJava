package exercise14;

abstract public class TaxPayer {
    String name;
    double annualIncome;

    public TaxPayer(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }
    abstract double tax();
}
