/*Prototipo - Creación

*Objetivo: Permitir al cliente realizar acciones temporales con
"copias" de los objetos sin afectar el objeto original.

*Para esto se debe clonar el objeto en tiempo de ejecución.

En Java tenemos que tener en cuenta un aspecto muy importante y es
la referencias de los objetos. Cuando nosotros referenciamos unos objetos
igualando el valor de un nuevo objeto lo que se hace es apuntar hacia ese 
objeto y todos los cambios que se realicen en el nuevo objeto afectan al 
objeto original.
 */

 /*
 Supongamos que tenemos un programa de Dibujo el usuario puede extender la 
 interface Prototype para crear circulos, cuadrados, etc. En este ejemplo el 
 usuario ya creo un circulo y un cuadrado pero quiere ver que pasa si mueve
 una de las dos figuras para ver si ve mejor el dibujo, asi que el programa 
 debe ser capaz de poder copiar el objeto que eliga en tiempo de ejecución 
 el cliente y realizar los cambios sin afectar el objeto original que haya 
 elegido.
 */
import java.util.Scanner;

public class Prototype{
	public static void main(String... args){

		Scanner sc = new Scanner(System.in);
		int opcion, posX, posY;
		
		Circulo circulo = new Circulo();
		Cuadrado cuadrado = new Cuadrado();
		Figura figura;

		circulo.setNombre("Mi circulo");
		circulo.mover(12, 34);

		cuadrado.setNombre("Mi cuadrado");
		cuadrado.mover(200, 200);

		System.out.println("Estas son las figuras originales:");
		System.out.println("Circulo: "+circulo.getNombre());
		System.out.println("Cuadrado: "+cuadrado.getNombre());
		System.out.println("Estas son las posiciones originales:");
		circulo.getPosicion();
		cuadrado.getPosicion();

		System.out.println("Digite la opcion que desea clonar:");
		System.out.println("1 = Circulo, 2 = Cuadrado");
		opcion = sc.nextInt();

		if(opcion==1){
			figura = circulo.clonar();
		} else {
			figura = cuadrado.clonar();
		}

		figura.setNombre(figura.getNombre()+" clonado");
		System.out.print("Digite la nueva posicion en X: ");
		posX = sc.nextInt();
		System.out.print("Digite la nueva posicion en Y: ");
		posY = sc.nextInt();
		figura.mover(posX, posY);

		System.out.println("Esta es figura clonada:");
		System.out.println(figura.getNombre());
		System.out.println("Esta es la posicion del clon:");
		figura.getPosicion();

		System.out.println("Estas son las figuras originales:");
		System.out.println("Circulo: "+circulo.getNombre());
		System.out.println("Cuadrado: "+cuadrado.getNombre());
		System.out.println("Estas son las posiciones originales:");
		circulo.getPosicion();
		cuadrado.getPosicion();

	}
}

/*RESUMEN - Creación
	Singleton: Un solo objeto para todas las clases que lo llamen.
	Factory: Una fábrica de objetos en tiempo de ejecución.
	Abstract Factory: Una fábrica de fábricas.
	Builder: Permite que el cliente controle el proceso de construcción del objeto.
	Prototype: Permite clonar objets en tiempo de ejecución.
*/