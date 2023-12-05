import java.util.Scanner;

public class areaCalculator {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose a geometric shape:");
    System.out.println("1. Circulo");
    System.out.println("2. Quadrado");
    System.out.println("3. Retangulo");
    System.out.println("4. Triangulo"); 

    int escolha = scanner.nextInt();

    switch (escolha) {
        case 1:
        areaCirulo();
        break;
    
        case 2:
        areaQuadrado();
        break;

        case 3:
        areaRetangulo();
        break;

        case 4:
        areaTriangulo();
        break;
    }
}
            
private static void areaTriangulo(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Cálculo de Área do Triangulo selecionada !");

    System.out.println("Insira o valor da base do triangulo : !");

    double base = scanner.nextDouble();

    System.out.println("Insira o valor da altura do triangulo : !");

    double altura = scanner.nextDouble();

    double formula =  (altura * base) / 2 ; 

    System.out.println("O valor da área do triangulo é :"+ formula);

}

private static void areaQuadrado(){
    Scanner scanner = new Scanner(System.in);
}
private static void areaRetangulo(){
    Scanner scanner = new Scanner(System.in);
}

 private static void areaCirulo(){

    Scanner scanner = new Scanner(System.in);
}

}












