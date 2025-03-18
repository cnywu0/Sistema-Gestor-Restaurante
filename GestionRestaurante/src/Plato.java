public class Plato {

    private String codigoPlato;
    private String nombrePlato;
    private double precioPlato;

    public Plato(String codigoPlato, String nombrePlato, double precioPlato) {
        this.codigoPlato = codigoPlato;
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
    }

    public String getCodigo() {return this.codigoPlato;}
    public double getPrecio() {return this.precioPlato;}

}
