class Funcionario{
    String nome;
    String cpf;
    double salario;

    Funcionario(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void calcularSalario(int horasTrabalhadas){
        if(horasTrabalhadas > 0){
            this.salario = horasTrabalhadas *40;
        }else {
            System.out.println("O número de horas trabalhadas deve ser maior que zero!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Emerson");
        System.out.println(f1.getNome());
    }
}