class Triagulo{
    double ladoA, ladoB, ladoC;

    double calcArea(){
        double p = (ladoA + ladoB + ladoC)/2.0;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) + (p - ladoC));
    }
}
public class Main {
    public static void main(String[] args) {
        Triagulo  novoTri;
        novoTri = new Triagulo();

        novoTri.ladoA = 3;
        novoTri.ladoB = 4;
        novoTri.ladoC = 5;

        System.out.println(novoTri.calcArea());
    }
}