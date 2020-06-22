

package gptienda;

import java.util.Scanner;
/**
 *Clase para crear objetos productos
 * @author gpacheco
 */
public class Producto {
    // Intancias 
    private int codigo;
    private String nombre;
    private String marca;
    private double precio;
    private int cantidad;

    //constructor Por defecto
    public Producto(int codigo, String nombre, String marca, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    /*** Getter y Setters **/
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
    
   //**Metodo actualizar **// 
   public void actualizar (){//Metodo para realizar la actualización
       int accion;
       int cant;
       Scanner leer = new Scanner(System.in);
       //Mensaje de que producto se está actualizando
       System.out.println("\n*******************************");
       System.out.println("Actualizado producto " + this.getCodigo() + " "+ this.getNombre());
       System.out.println("*********************************");
       System.out.println("* 1.- Comprar                   *");
       System.out.println("* 2.- Vender                    *");
       System.out.println("*********************************");
       System.out.println("Escoja una opcion: " );
       accion = Integer.parseInt(leer.nextLine());//Leer que va a hacer el usuari
       switch (accion){
           case 1: // Si el usuario escoje Comprar 
                   System.out.print("Ingrese la cantidad: "); 
                   cant = Integer.parseInt(leer.nextLine()); //Solicitar la cantidad
                    this.cantidad  += cant;
                   System.out.println("La campra se realizó con exito!");
                   break; 
           case 2: //Si el usuario Escoje Vender        
                   System.out.print("Ingrese la cantidad: "); 
                   cant = Integer.parseInt(leer.nextLine());// SOliciatar la cantidad
                   if (this.getCantidad() >=  cant){// Comprovar si existe stoc
                       this.cantidad  -= cant;//Realizar la venta
                       System.out.println("La venta se realizó con exito!");
                   }else{
                       //Mensaje indicando que no hay suficiente stock
                       System.out.println("La cantidad ingresada supera al Stock!");
                   }
                   break;
           case 3: // si el usuario Ingresa algo quivocado
                   System.out.print("El opcion ingresada no es correcta! "); 
                   break;
       }
   }  
   
   public String toLista (){//Metodo que devuelve en string todos los atrobutos concatenados 
       return "* " + this.getCodigo() + "    "  +  this.getNombre()+ "  " + this.getMarca()+ "  "+
               this.getPrecio()+ "     " +  this.getCantidad();
   }
                
    @Override// Sobre Escribir metodo toStong
    public String toString (){
        return "Codigo: " + this.getCodigo() + " Nombre: "  + this.getNombre() + " Marca:" 
                + this.getMarca()  +" Cantidad: " + this.getCantidad() + " Precio: " + this.getPrecio();    
    }    
}
