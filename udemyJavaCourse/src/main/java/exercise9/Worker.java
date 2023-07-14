package exercise9;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class  Worker {
    String name;
    LevelEnum level;
    double baseSalary;

    public Worker(String name, LevelEnum level, double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }
    List<Contract> contracts = new ArrayList<>();
    public void addContract(Contract contract){
        contracts.add(contract);
    }
    public void removeContract(Contract contract){
        contracts.remove(contract);
    }
    public double income(int month, int year){
        double result = baseSalary;
        for (int i = 0; i < contracts.size(); i++){
            int contractMonth = contracts.get(i).date.getMonth() + 1;
            int contractYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(contracts.get(i).date));
            if (contractMonth == month && contractYear == year){
                result += contracts.get(i).totalValue();
            }
        }
        return result;
    }
}
