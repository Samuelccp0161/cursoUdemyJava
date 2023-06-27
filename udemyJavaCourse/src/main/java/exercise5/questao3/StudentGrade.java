package exercise5.questao3;

public class StudentGrade {
    double grade1;
    double grade2;
    double grade3;
    String name;
    double resultGrade;
    public StudentGrade(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double grade(){
        resultGrade = grade1 + grade2 + grade3;
        return resultGrade;
    }
    public boolean isApproved(){
        return resultGrade > 60;
    }
}
