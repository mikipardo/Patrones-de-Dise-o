
public class Guerrero implements Heroe{
	String nombre;
	int fuerza;
	
	public Guerrero(String nombre, int fuerza) {
		super();
		this.nombre = nombre;
		this.fuerza = fuerza;
	}

	public Guerrero() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String dameNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public int ataque(int vida) {
		// TODO Auto-generated method stub
		System.out.println("El ataque fue de "+this.fuerza);
		return fuerza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}





}
