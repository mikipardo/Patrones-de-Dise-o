
public class Hechicero implements Heroe{
	String nombre;
	int fuerza;
	int magia;
	
	public Hechicero(String nombre, int fuerza, int magia) {
		super();
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.magia = magia;
	}

	public Hechicero() {
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
		System.out.println("El ataque fue de "+ (this.fuerza+this.magia));
		return (this.fuerza+this.magia)-fuerza;
	}
	
	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
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

