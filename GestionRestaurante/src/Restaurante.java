import java.util.*;

public class Restaurante {
    //Atributos especiales
    Scanner sc = new Scanner(System.in);

    //Atributos Restaurante
    LinkedList<Mesa> mesas = new LinkedList<>();
    LinkedList<Plato> platos = new LinkedList<>();


    public void registrarMesa(){
        int numeroMesa;
        int capacidadMesa;
    
        //Pedir ingresar numero de mesa y validar que es positivo
        do { 
            System.out.println("Ingresar numero de mesa: ");
            numeroMesa = sc.nextInt();
                
        } while (numeroMesa < 0);
            
        //Pedir ingresar capacidad maxima (personas) de mesa y validar que es positivo
        do {
            System.out.println("Ingresar capacidad de la mesa:");
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
        sc.nextLine();
                
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
}
