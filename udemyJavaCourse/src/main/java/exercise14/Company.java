package exercise14;

public class Company extends TaxPayer{
    int numberOfEmployees;

    public Company(String name, double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    double tax() {
        return annualIncome * 0.14;
    }
}
