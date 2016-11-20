//Builder - Creación
/*
*Objetivo: Permitir que el código cliente controle el 
proceso de contrucción de los objetos.

*Seperar la construcción de un objeto complejo de su representación
de manera que el mismo proceso de construcción pueda crear diferentes
representaciones.
*/

/*
Utilice el patrón de diseño Builder cuando se desea que el código del 
cliente tenga un control sobre el proceso de contrucción, pero que sea 
capaz de terminar con diferentes tipos de objetos.
*/

/*
Por ejemplo piense en que un código cliente recibe un texto, y dicho código 
convierte ese texto en diferentes formatos: Word, RTF, txt, etc. El proceso 
de construcción es el mismo para cada uno, pero se utiliza un Builder diferente 
para cada formato.
*/

import java.util.*;

public class Builder{
	
	// Robot a construir
	Robot robot;

	// Acciones a Realizar
	List<Integer> acciones;

	// Constructor que 
	// inicializa las acciones (vacias)
	public Builder(){
		acciones = new ArrayList<Integer>();
	}

	// Método que crea el robot
	// dependiendo de lo solicitado por el cliente
	public void setRobot(int i){
		if(i==1){
			robot = new RobotHamburguesa();
		} else {
			robot = new RobotHotDog();
		}
	}

	/* Métodos que pueden solicitar los clientes
	   en tiempo de ejecución y que organizarán
	   los procesos a realizar por el robot.
	*/
	public void addGetIngredientes(){
		acciones.add(1);
	}

	public void addArmar(){
		acciones.add(2);
	}

	public void addRevisar(){
		acciones.add(3);
	}

	public void addImposible(){
		acciones.add(100);
	}

	// Método que devuelve el robot construido
	public Robot getRobot(){
		robot.cargaAcciones(acciones);
		return robot;
	}
}