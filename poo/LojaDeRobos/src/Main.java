import java.util.ArrayList;
import java.util.Scanner;

class Loja{
    private String Nome;
    private ArrayList<Robo> RobosParaVendas = new ArrayList<Robo>();

    Loja(){
        this.Nome = "Milenium Falcom";
    }

    void adicionarRobos(double valor){
        Robo rb = new Robo();
        rb.setPreco(valor);
        RobosParaVendas.add(rb);
    }

    public ArrayList<Robo> ObterRobos(){
        return RobosParaVendas;
    }
}


class CarrinhoDeCompras{
    private static int ContadorCarrinho = 0;
    private double TotalDeVedas;
    private int id;

    int getId(){
        return   ContadorCarrinho;
    }

    void AdicionarRoboAoCarrinho(){

    }

    double getTotalDeVedas(){
        for(){
            this.TotalDeVedas += r.getPreco();
        }
    }
}


class Robo{
    private double Preco;
    private String NomeRobo;
    private static int contadorRobo = 0;

    Robo(){
        this.NomeRobo = "C" +contadorRobo++ + "P0";
    }

    public String getNomeRobo() {
        return NomeRobo;
    }

    void setPreco(double preco){
        this.Preco = preco;
    }

    double getPreco(){
        return this.Preco;
    }
}


public class Main {
    public static void main(String[] args) {
        Loja lj01 = new Loja();
        System.out.println();
    }
}