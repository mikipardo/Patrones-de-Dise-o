
public class clasesAnonimas_Internas {

	private int dni;
	private String nombre;
	private demo d;

	public clasesAnonimas_Internas() {
		// TODO Auto-generated constructor stub
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	protected clasesAnonimas_Internas(int dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.d = new demo(String.valueOf(dni) + nombre);
		// el dato lo declaramos arriba y lo instanciamos dentro de la clase externa
	}
	
	protected clasesAnonimas_Internas(int dni, String nombre,demo demo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.d = demo;
		// el dato lo declaramos arriba y lo instanciamos dentro de la clase externa
	}

	public demo getD() {
		return d;
	}

	public void setD(demo d) {
		this.d = d;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// es ejemplo de una clase interna
	// debe de ser instanciada cuando ya lo ha hecho la clase exerna constructor o
	// método
	// lo primero se crea el nombre de clase
	// luego constructor y campos
	private class demo {

		private String dato;

		private demo(String dato) {

			this.dato = dato;
		}

		public String getDato() {
			return dato;
		}

		public void setDato(String dato) {
			this.dato = dato;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//resultado de clase interna
		clasesAnonimas_Internas classExterna = new clasesAnonimas_Internas(5897563, "Manolo");
		System.out.println(classExterna.getD().getDato());
		
		
		//ejemplo de clase anonima
		//se instancia directamente en los parametros
		/*
		clasesAnonimas_Internas classAnonima = new clasesAnonimas_Internas(5897563, "Manolo", new demo("mis datos aqui").getDato().);
		*/
	}

}
