
package gptienda;

/**
 *
 * @author gpacheco
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private String marca;
    private double precio;
    private int cantidad;

    public Producto(int codigo, String nombre, String marca, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   public void actualizar (int accion, int cantidad){
       if (accion == 1){
           this.cantidad = this.cantidad + cantidad;
            System.out.println("Compra realizada con exito!");
       }else{
           if (this.cantidad > cantidad){
            this.cantidad = this.cantidad - cantidad;   
            System.out.println("Compra realizada con exito!");
           }else{
               System.out.println("La cantidad ingresada es mayor a la del inventario");
           }
       }
   }  
               
    @Override
    public String toString (){
        return "Codigo: " + this.getCodigo() + " Nombre: "  + this.getNombre() + " Marca:" 
                + this.getMarca()  +" Cantidad: " + this.getCantidad();    
    }    
}
