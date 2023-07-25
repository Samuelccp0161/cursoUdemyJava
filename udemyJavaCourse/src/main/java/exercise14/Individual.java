package exercise14;

public class Individual  extends TaxPayer{
    double healthExpenditures;

    public Individual(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    double tax() {
        return (annualIncome * 0.25) - (healthExpenditures * 0.50);
    }
}
