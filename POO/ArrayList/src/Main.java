import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        // Array —> tamanho fixo de 5 posições
        nomes[0] = "Maria";
        nomes[1] = "Cosmo";
        nomes[2] = "Thor";
        nomes[3] = "Diana";
        nomes[4] = "Fox";

        for(int i = 0; i < nomes.length; i++){
            System.out.format("%s\n",nomes[i]);
        }

        System.out.format("\n\n");

        //ArrayList<Tipo> nome = new ArrayList<Tipo>();

        ArrayList<String> outrosNomes = new ArrayList<String>();

        outrosNomes.add("Marlene");
        outrosNomes.add("Eliane");
        outrosNomes.add("Kato");
        outrosNomes.add("Marcos");

        for(int j = 0; j < outrosNomes.size();j++){
            System.out.format("%s\n", outrosNomes.get(j));
        }
    }
}