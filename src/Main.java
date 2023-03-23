import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precio;

        System.out.println("Ingrese el precio del artículo");
        precio = scanner.nextDouble();

        double iva = precio*1.21;

        System.out.println("El precio + IVA es: "+iva);
    }
}