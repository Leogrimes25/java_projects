import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        System.out.println("Insira o quantitativo de elementos da lista:");
        
        int numero_elementos = scanner.nextInt();

        System.out.println("Insira os elementos:");
        for(int i=0; i< numero_elementos; i++){
            System.out.print("Elemento " + (i + 1) + ": ");
            int elementos = scanner.nextInt();
            lista.add(elementos);
        }

        System.out.println("A lista adicionada é:"+ lista);

        for( int i=0; i< lista.size(); i++){
            int potencia = lista.get(i);
            lista.set(i,potencia * potencia);

        }

        System.out.println("A lista adicionada ao quadrado é: " + lista);


    scanner.close();




    }
}


    

