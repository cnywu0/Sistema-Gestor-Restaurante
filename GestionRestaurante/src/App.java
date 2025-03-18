import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int opcion;

        Restaurante restaurante = new Restaurante();

        do {
            System.out.println("\nBienvenido al Sistema de Restaurante");
            System.out.println("1. Registrar mesa");
            System.out.println("2. Registrar Plato");
            System.out.println("3. Reservar Pedido");
            System.out.println("4. Modificar Pedido");
            System.out.println("5. Borrar Pedido");
            System.out.println("6. Modificar o Borrar Plato");
            System.out.println("7. Guardar Datos");
            System.out.println("8. Cargar Datos");
            System.out.println("9. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            
            
            
            switch (opcion) {
                case 1 -> restaurante.registrarMesa();
                case 2 ->  restaurante.registrarPlato();
                case 9 -> System.out.println("Has salido de GestionRestaurante");
                
            }
            
        } while (opcion != 9);
    }
}
