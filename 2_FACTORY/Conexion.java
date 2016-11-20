/*
Supongamos que tengamos un programa de contabilidad
y este lo tenemos con una base de datos de Oracle, pero 
hay un nuevo cliente que no desea utilizar la base de 
oracle por algún motivo...Este cliente desea conectarse a 
una base de datos de SqlServer, se cambia de conexión se crea 
uno tipo de objeto SqlServerConexion, pero ¿Qué pasa si hay 
nuevos clientes que usen otras bases de datos como MySql o Postgresql?
Tendríamos que tener un versión del programa por cada base de dato que haya
en el mercado, asi que es mejor escoger la base de datos que se va utilizar
*/

/*
	Creamos una clase abstracta llamada conexión la cual será la encargada de 
	realizar las conexiones a las bases de datos de esta clase se heredará el 
	método descripción el cual será sobreescrito en las clases de conexión es-
	pecificas para cada base de datos
*/
public abstract class Conexion{
	//constructor vacio
	public Conexion(){}

	//Se sobreescribe el método descripción
	public String descripcion(){
		return "Conexion Generica";
	}
}