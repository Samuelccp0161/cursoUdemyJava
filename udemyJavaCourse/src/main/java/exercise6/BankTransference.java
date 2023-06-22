package exercise6;

public class BankTransference {
    private String name;
    private final int numberAccount;
    public double value;

    public BankTransference(int numberAccount) {
        this.name = "name";
        this.numberAccount = numberAccount;
        this.value = 0.00;
    }
    public int getNumberAccount(){
        return numberAccount;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getValue(){
        return value;
    }
    public void deposit(double value){
        this.value += value;
    }
    public void withdraw(double value){
        this.value -= value + 5;
    }

}
