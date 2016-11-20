//CREACIÓN - FABRICA (FACTORY)
/*
Objetivo: Crear diferentes objetos de la misma naturaleza en tiempo
de ejecución. Nos sirve bastante para cuando no sabemos que elecciones
va a realizar el usuario.
*/

/*
Antes debemos entender los pilares de: Herencia - Polimorfismo para poder crear
la fabrica. 
*/

/*
Diferencias entre una interface y una clase abstracta

//Interface
Las interfaces son clases que implementan unos metodos y todas aquellas clases
que implementen esa interface deben obligatoriamente sobreescribir cada unos
de sus métodos
	*Los atributos en las interfaces solo pueden ser final, deben ser constantes
*/

//EJEMPLO:
interface Interface{
	public final String miNombre= "Soy una interface";
	public void saludar();
	public String getNombre();
}

public class Fundamentos implements Interface{
	public Fundamentos(){
		saludar();
	}

	public String getNombre(){
		return miNombre;
	}

	public void saludar(){
		System.out.println("Hola "+getNombre());
	}

	public static void main(String...args ){
		Fundamentos fundamentos =new Fundamentos();
	}
}
//Clase Abstracta
/*¿Qué pasa si queremos crear clases las cuales no todos los métodos tengamos
que sobreescribirlos, es decir, necesitamos una clase la cual ya tenga una 
implementación la cual no debe cambiar y algunos otros métodos que cambien
dependiendo del comportamiento del objeto
1) Atributo que cambia en sus hijos.
2) Metodo que no cambia en sus hijos.
3)Metodo que debe cambiar en sus hijos.
*/

//EJEMPLO:
 abstract class ClaseAbstracta{
	public String nombre;

	public void saludar(){
		System.out.println("hola");
	}

	public abstract void despedirse();
}

class HeredaAbstracta extends ClaseAbstracta{
	public void despedirse(){
		System.out.println("Ciao"+ super.nombre);
	}

	public HeredaAbstracta(){
		darNombre("Mauricio");
		saludar();
		despedirse();
	}
	public void darNombre(String nombre){
		super.nombre = nombre;
	}
}

