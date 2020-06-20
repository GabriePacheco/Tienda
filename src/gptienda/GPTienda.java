/*
    Enunciado del problema:
    Realizar un programa para actualizar el inventario de una tienda de electrodomésticos 
    por medio de los siguiente:
     1.- Crear una clase producto con las propiedades Código, Nombre del producto, 
    marca, precio, cantidad.
    2.- Crear el constructor por defecto de la clase.
    3.- Crear los respectivos métodos Get y Set para las propiedades de la clase.
    4.- Crear un métodos para actualizar la cantidad del producto dependiendo si 
    es compra o venta.
    5.- En la clase principal crear un ArrayList para almacenar los productos, 
    los datos del producto deben ser introducidos por teclado
    6.- Haga un llamado al método para actualizar el inventario de los productos.
    7.- Muestre los datos de los productos después de actualizar el inventario
 */
package gptienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gpacheco
 */
public class GPTienda {

   
    public static void main(String[] args) {
        
        //Variables
       ArrayList <Producto> inventario = new ArrayList();
       Scanner leer = new Scanner(System.in);
       String opcion;
       int accion;
       int codigo;
       String nombre;
       String marca;
       int cantidad; 
       double precio;
       int opcion2;
       
       
       System.out.println("Ingreso de los datos");
       do {
           //leer las datos del  de cada producto 
           System.out.println("Ingrese el Codigo");
           codigo = Integer.parseInt(leer.nextLine());
           System.out.println("Ingrese el Nombre");
           nombre = leer.nextLine();
           System.out.println("Ingrese el Marca");
           marca = leer.nextLine();
           System.out.println("Ingrese el Precio");
           precio = Double.parseDouble(leer.nextLine());
           System.out.println("Ingrese el Cantidad");
           cantidad = Integer.parseInt(leer.nextLine());
           inventario.add(new Producto (codigo, nombre, marca, precio, cantidad));                           
           System.out.println("Desa ingresar otro producto s/n");
           opcion = leer.nextLine();
       }while(opcion.equals("s")  || opcion.equals("S"));
       
       System.out.println("Atualisacion");
       System.out.println("Lista de productos");
       
       for (int i = 0; i < inventario.size(); i++ ){
           System.out.println( (i + 1) + " " + inventario.get(i).getNombre());
       }
       // escoger el producto que se va a actualizar 
       System.out.println("Escoja el producto que desea actualizar");
       opcion2 = leer.nextInt();
       System.out.println("Escoja la opcion 1 para Comprar \n  2 Para Vender ");
       accion = leer.nextInt();
       System.out.println("Ingresa la cantidad a actualizar ");
       cantidad = leer.nextInt(); //Leer el numero de producto deseado 
       inventario.get(opcion2 - 1 ).actualizar(accion, cantidad);
        //Imprimir la lista de productos 
       System.out.println("Lista de productos Final ");
       for (Producto producto: inventario){
           System.out.println(producto.toString());
       }
    }
    
}
