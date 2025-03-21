import java.util.*;

public class Restaurante {
    //Atributos especiales
    Scanner sc = new Scanner(System.in);

    //Atributos Restaurante
    LinkedList<Mesa> mesas = new LinkedList<>();
    LinkedList<Plato> platos = new LinkedList<>();
    LinkedList<Pedido> pedidos = new LinkedList<>();

    


    public void registrarMesa(){
        int numeroMesa;
        int capacidadMesa;
    
        //Pedir ingresar numero de mesa y validar que es positivo
        do { 
            System.out.print("\nIngresar numero de mesa: ");
            numeroMesa = sc.nextInt();
                
        } while (numeroMesa < 0);
            
        //Pedir ingresar capacidad maxima (personas) de mesa y validar que es positivo
        do {
            System.out.print("\nIngresar capacidad de la mesa:");
            capacidadMesa = sc.nextInt();
        } while (capacidadMesa < 0);

        Mesa mesa = new Mesa(numeroMesa, capacidadMesa);
        mesas.add(mesa);

        System.out.println("Mesa creada correctamente");
        


           

    }

    public void registrarPlato() {

        String codigoPlato; //P-01
        String nombrePlato;
        double precioPlato;
    
        //Pedir ingresar codigo de plato

        System.out.println("Ingresar codigo de plato: ");
        codigoPlato = sc.nextLine();
        sc.next();
                
        //Pedir ingresar capacidad maxima (personas) de mesa y validar que es positivo
        System.out.println("Ingresar nombre del plato: ");
        nombrePlato = sc.nextLine();

        do {
            System.out.println("Inrgesar precio del plato: ");
            precioPlato = sc.nextDouble();
        } while(precioPlato <= 0);

        Plato plato = new Plato(codigoPlato, nombrePlato, precioPlato);
        platos.add(plato);

        System.out.println("Mesa creada correctamente");

    }

    public void registrarPedido() {



        Mesa mesaEncontrada = null;
        int numeroMesa;
        
        do { 
            System.out.print("\nIntroduce el numero de una mesa existetne: ");
            numeroMesa = sc.nextInt();


            for (Mesa mesa : this.mesas) {
                if (numeroMesa == mesa.getNumero()) {
                    mesaEncontrada = mesa;
                    break;
                }
            }

            if (mesaEncontrada == null) {
            System.out.println("No se ha encontrado esa mesa");
            }

        } while (mesaEncontrada == null);

        LinkedList<Plato> listaPlatosPedido = new LinkedList<Plato>();

        boolean terminar = false;
        while (!terminar) {

            System.out.print("\nSi se introduce un 0, parara de preguntar\nIntroduce el codigo de los platos: ");
            String codigo = sc.next();
            if(codigo.equals('0')) {
                terminar = true;
            } else {
                for (Plato plato : this.platos) {
                    if (codigo.equals(plato.getCodigo())) {
                        listaPlatosPedido.add(plato);
                        break;
                    }
                }
            }

            



        }

        Pedido pedido = new Pedido(mesaEncontrada, listaPlatosPedido);
        pedidos.add(pedido);
        System.out.println("Pedido añadido correctamente");
    }


    private Pedido getPedidoNumeroMesa() {
        if (!pedidos.isEmpty()) {
            
            do {

                System.out.println("Introduce un numero de mesa asociado al pedido: ");
                int numero = sc.nextInt();
        
                for (Pedido pedido : this.pedidos) {
                    if (numero == pedido.getNumeroMesa()) {
                        control = false;
                        return pedido;
                    }
                }
                System.out.println("Introduce un numero valido");

            }while(true);
        }
        return null;
    }

    public void menuModificarPedido() {
        Pedido pedido = this.getPedidoNumeroMesa();
        int opcion;

        do { 
            
            System.out.println("Que quieres hacer?:");
            System.out.println("1. Cambiar estado (Completado/No Completado)");
            System.out.println("2. Añadir Plato.");
            System.out.println("3. Borrar Plato.");
            System.out.println("4. Cambiar Mesa.");
            System.out.println("5. Aplicar Descuento");
            System.out.println("6. Borrar Pedido");
            System.out.println("7. Salir");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();

        } while (opcion != 7);

        switch (opcion) {
            case 1 -> pedido.cambiarCompletado();
            case 2 -> pedido.addPlato();
            case 3 -> pedido.removePlato();
        }
    }

    public void modificarPedido() {

    }


}
