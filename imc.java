import java.util.Scanner;;
public class imc {
    public static void main(String[] args) {

        System.out.println("Calculadora de IMC:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua altura:");
        
        float altura= scanner.nextFloat();

        float  peso = scanner.nextFloat();

        float  formula = peso/(altura*altura);

        System.out.println(" O valor de seu IMC é " + formula);

        scanner.close();
    }
}
