public final class Marcianos{
	private static final Marcianos marcianos= new Marcianos();
	private static int cantidad;

	public static Marcianos getMarcianos(){
		return marcianos;
	}

	public static void derribaMarcianos(){
		System.out.println("Soy el bueno, derribe un marcianos");
		if (cantidad>0) cantidad--;
	}

	public void creaMarcianos(){
		System.out.println("Soy  el malo, cree un marciano");
		if (cantidad>0) cantidad++;
	}

	public static void cuantosQuedan(){
		if(cantidad>0){
			System.out.println("Quedan en el juego"+cantidad+"marcianos");
		}else{
			System.out.println("Felicidades has ganado!!");
		}
	}
}