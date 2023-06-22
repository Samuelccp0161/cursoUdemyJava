package exercise5.questao3;

public class NotaAluno {
    double nota1;
    double nota2;
    double nota3;
    double resultadoNotas;
    public NotaAluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        resultadoNotas = nota1 + nota2 + nota3;
    }

    public double nota(){
        return resultadoNotas;
    }
    public boolean isApproved(){
        return resultadoNotas > 60;
    }
}
