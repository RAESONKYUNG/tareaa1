import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número (numA): ");
        int numA = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número (numB): ");
        int numB = scanner.nextInt();
        
        boolean mismoSigno = (numA >= 0 && numB >= 0) || (numA < 0 && numB < 0);
        
        System.out.println("¿Ambos números tienen el mismo signo? " + mismoSigno);
    }
}
