/*
Una fabrica de fabricas esto con el fin de dejar a la fabrica
abstracta poder tener subclases que se encarguen del trabajo 
en concreto.
Esta clase Fabrica abstracta se le deja la implementación de los
métodos a las clases hijas.
*/

public abstract class FabricaAbstracta{
	public FabricaAbstracta(){}

	protected abstract Conexion creaConexion(String tipo);
}