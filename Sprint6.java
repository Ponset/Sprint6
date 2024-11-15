import java.util.Scanner;

public class Sprint6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ID
        int id_cliente;
        do {
            System.out.print("Introduce tu ID: ");
            id_cliente = input.nextInt();
            if (id_cliente < 111 || id_cliente > 999) {
                System.out.println("ID no válido.");
            }
        } while (id_cliente < 111 || id_cliente > 999);

        // Edad
        int edad;
        do {
            System.out.print("Introduce tu edad: ");
            edad = input.nextInt();
            if (edad < 14 || edad > 120) {
                System.out.println("Edad no válida.");
            }
        } while (edad < 14 || edad > 120);

        // Tipo de venta
        int tipo_venta;
        do {
            System.out.print("Tipo de venta: Venta Lliure (0), Pensionista (1), Carnet Jove (2), Soci (3): ");
            tipo_venta = input.nextInt();
            if (tipo_venta < 0 || tipo_venta > 3) {
                System.out.println("Este tipo de venta no existe.");
            }
        } while (tipo_venta < 0 || tipo_venta > 3);

        // Importe
        int importe;
        do {
            System.out.print("Introduce el importe: ");
            importe = input.nextInt();
            if (importe < 0 || importe > 1000) {
                System.out.println("Importe no válido.");
            }
        } while (importe < 0 || importe > 1000);

        // Número de teléfono
        int tel;
        do {
            System.out.print("Introduce tu número de teléfono: ");
            tel = input.nextInt();
            if (tel < 100000000 || tel > 999999999) {
                System.out.println("Teléfono no válido.");
            }
        } while (tel < 100000000 || tel > 999999999);

        // Tipo de venta(2)
        String tipoVentaTexto = "";
        switch (tipo_venta) {
            case 0:
                tipoVentaTexto = "Lliure";
                break;
            case 1:
                tipoVentaTexto = "Pensionista";
                break;
            case 2:
                tipoVentaTexto = "Carnet jove";
                break;
            case 3:
                tipoVentaTexto = "Soci";
                break;
        }

        System.out.println("Id: " + id_cliente);
        System.out.println("Edat: " + edad);
        System.out.println("Tipus de venda: " + tipoVentaTexto);
        System.out.println("Import: " + importe);
        System.out.println("Telèfon: " + tel);

        input.close();
    }
}
