/*Esta vez  creamos una clase llamada pagos la cual */
import java.util.Scanner;

public class Pagos{
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		FabricaHeredada miFabrica;
		Conexion miConexion;

		System.out.println("Digite la BD: ");
		String tipo = sc.nextLine();

		miFabrica = new FabricaHeredada();
		miConexion = miFabrica.creaConexion(tipo);

		String salida = "Esta conectado con "+ miConexion.descripcion();
		System.out.println(salida);
	}
}