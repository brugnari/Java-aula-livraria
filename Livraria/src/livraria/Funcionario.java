package livraria;
public class Funcionario {
    private double salario;
    private double INSS;
    
    Funcionario(String nome, int idade, String login, String senha,
    double salario, double inss){
        super(nome,idade,login,senha);
        this.INSS = inss;
        this.salario = salario;
    }
    
}
