/**
 * Enunciado del problema:
 * Realizar un programa para actualizar el inventario de una tienda de electrodomésticos 
 * por medio de los siguiente:
 *  1.- Crear una clase producto con las propiedades Código, Nombre del producto, 
 *  marca, precio, cantidad.
 *  2.- Crear el constructor por defecto de la clase.
 *  3.- Crear los respectivos métodos Get y Set para las propiedades de la clase.
 *  4.- Crear un métodos para actualizar la cantidad del producto dependiendo si 
 *  es compra o venta.
 *  5.- En la clase principal crear un ArrayList para almacenar los productos, 
 *  los datos del producto deben ser introducidos por teclado
 *  6.- Haga un llamado al método para actualizar el inventario de los productos.
 *  7.- Muestre los datos de los productos después de actualizar el inventario
 *  @author gpacheco
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
       int codigo;
       String nombre;
       String marca;
       int cantidad; 
       double precio;
       int opcion2;
              
        System.out.println("**** SISTEMA DE INVENTARIO ****");
       System.out.println("**** Ingreso de Productos   ****");
       do {
           //Leer las datos del  de cada producto por teclado
           System.out.println("Complete los datos del producto");
           System.out.print("Ingrese el Codigo: ");
           codigo = Integer.parseInt(leer.nextLine());
           System.out.print("Ingrese el Nombre: ");
           nombre = leer.nextLine();
           System.out.print("Ingrese la Marca: ");
           marca = leer.nextLine();
           System.out.print("Ingrese el Precio: ");
           precio = Double.parseDouble(leer.nextLine());
           System.out.print("Ingrese el Cantidad: ");
           cantidad = Integer.parseInt(leer.nextLine());
           inventario.add(new Producto (codigo, nombre, marca, precio, cantidad));                           
           System.out.print("Desa ingresar otro producto (s/n): ");
           opcion = leer.nextLine();
           System.out.println("\n");
           
       }while(opcion.equals("s")  || opcion.equals("S"));//Repetir mientras el usuario lo requiera
       
       //Lista de Productos por codio
       System.out.println("***** ACTUALIZACIÓN ******");
       System.out.println("**************************");
       System.out.println("*   Lista de Productos   *");
       System.out.println("**************************");
       System.out.println("* codigo *       *Nombre *");
       
       for (Producto elemento : inventario ){//Recorrer todos los producos     
           System.out.println( "*  " +elemento.getCodigo() + "            " 
                               + elemento.getNombre());//Imprimir codigo y Nombre
       }
       System.out.println("**************************");
       // Seleccionar el producto que se va a actualizar 
       
       System.out.print("Escoja el producto a Actualizar (Codigo): ");
       opcion2 = Integer.parseInt(leer.nextLine());
   
       //Buscar el codigo en el arreglo
       for (int i = 0; i < inventario.size(); i++ ){
           if (inventario.get(i).getCodigo() == opcion2){//Si Encuentra el codigo
               codigo = i;//ALmaceno el indice
               break;
           }
       }
       //llamar al metodo actualizar del producto encontrado
      inventario.get(codigo).actualizar();
       
       //Imprimir la lista de productos 
       System.out.println("\n");
       System.out.println("*******************************************");
       System.out.println("**         Inventario                    **");
       System.out.println("*******************************************");
       System.out.println("*Codigo  Nombre  Marca  Precio   Cantidad *");
       
       //Listar los elementos 
       for(Producto producto: inventario){// recorrer los elementos
           //Llamr al metodo que debuelve los atribustos en forma de texto
          System.out.println(producto.toLista());
       }
       System.out.println("*******************************************");
       System.out.println("\n");
       System.out.println("\n");
    }
    
}
