import java.util.Scanner;
public class area_cirulo {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    double pi= Math.PI;

    System.out.println("Insira o valor do raio do círculo :");

    double raio = scanner.nextDouble();

    double formula = pi * Math.pow(raio, 2);
    
    System.out.println("O valor da área do cícrulo com fórmula de:" + formula);

    scanner.close();
}

}
