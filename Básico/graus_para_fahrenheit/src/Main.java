import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float temperatura_celsius;
        float fahrenheit;

        System.out.printf("Digite a temperatura em graus celsius: ");
        temperatura_celsius = entrada.nextFloat();

        System.out.printf("\nA temperatura é: %.2f\n\n", temperatura_celsius);

        fahrenheit = (temperatura_celsius * 9/5)+32;

        System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
    }
}