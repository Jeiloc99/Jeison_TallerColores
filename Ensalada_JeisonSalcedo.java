/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensalada;

public class Ensalada {
    // Atributos
    private String nombre;
    private String tipoVerdura;
    private boolean contieneFrutas;
    private boolean esVegana;
    private double precio;

    // Constructor
    public Ensalada(String nombre, String tipoVerdura, boolean contieneFrutas, boolean esVegana, double precio) {
        this.nombre = nombre;
        this.tipoVerdura = tipoVerdura;
        this.contieneFrutas = contieneFrutas;
        this.esVegana = esVegana;
        this.precio = precio;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoVerdura() {
        return tipoVerdura;
    }

    public void setTipoVerdura(String tipoVerdura) {
        this.tipoVerdura = tipoVerdura;
    }

    public boolean isContieneFrutas() {
        return contieneFrutas;
    }

    public void setContieneFrutas(boolean contieneFrutas) {
        this.contieneFrutas = contieneFrutas;
    }

    public boolean isEsVegana() {
        return esVegana;
    }

    public void setEsVegana(boolean esVegana) {
        this.esVegana = esVegana;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Métodos adicionales
    public void mezclar() {
        System.out.println("La ensalada está siendo mezclada.");
    }

    public void agregarAderezo(String aderezo) {
        System.out.println("Se ha agregado el aderezo " + aderezo + " a la ensalada.");
    }

    public void enfriar() {
        System.out.println("La ensalada se está enfriando.");
    }

    public void mostrarInfo() {
        System.out.println("Ensalada " + nombre + " con verdura " + tipoVerdura + " y precio $" + precio);
    }

    public double calcularPrecioConImpuesto() {
        return precio * 1.10; 
    }
    
    public static void main(String[] args) {
        // Crear tres objetos de la clase Ensalada
        Ensalada ensalada1 = new Ensalada("César", "Zanahoria", false, true, 7.00);
        Ensalada ensalada2 = new Ensalada("Mediterránea", "Zanahoria", true, true, 8.50);
        Ensalada ensalada3 = new Ensalada("Griega", "Tomate,Zanahoria", true, false, 6.50);

        
        System.out.println("Atributo de Ensalada 1: Nombre - " + ensalada1.getNombre());
        System.out.println("Atributo de Ensalada 2: Tipo de Verdura - " + ensalada2.getTipoVerdura());
        System.out.println("Atributo de Ensalada 3: Precio - " + ensalada3.getPrecio());

      
        ensalada1.mostrarInfo();
        ensalada2.mostrarInfo();
        ensalada3.mostrarInfo();
    }
}



