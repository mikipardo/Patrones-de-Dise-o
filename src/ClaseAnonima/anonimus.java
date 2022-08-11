package ClaseAnonima;

public class anonimus {

	public anonimus() {
		// TODO Auto-generated constructor stub
	}

	private interface Interna {
		public String fraseInterna(String frase);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interna i = new Interna() {
			@Override
			public String fraseInterna(String frase) {
				// TODO Auto-generated method stub
				return frase + " clase interna Interfaz";
			}
		};
		
		//Primero creamos una interfaz, en este caso hemos hecho una interna
		//el método de la intefaz no declaramos nada lo hacemos en la declaracion de interfaz despues
		//ahora hemos creado una clase anonima, en este caso una interfaz, se establece el método que hay
		//que obligatoriamente implementar
		//me parece que las clases anonimas solo funcionan para las interfaces o clases abstractas

		System.out.println(i.fraseInterna("Hola caraculo"));
	}

}
