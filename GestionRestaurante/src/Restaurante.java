import java.util.*;

public class Restaurante {
    //Atributos especiales
    Scanner sc = new Scanner(System.in);

    //Atributos Restaurante
    LinkedList<Mesa> mesas = new LinkedList<>();

    private int numeroMesa;
    private int capacidadMesa;

    public void registrarMesa(){
    
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

}
