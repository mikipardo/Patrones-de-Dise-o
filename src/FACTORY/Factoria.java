package FACTORY;

public class Factoria {
	
	private static String tipo;
	private static String nombre;
	private static int vida, fuerza;


	public Factoria(String tipo, String nombre) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.vida=(int) (Math.random()*100);
		this.fuerza=(int) (Math.random()*100);
	}
	
	public static Pokemon factoria (String tipo, String nombre) {
		
		
		if(tipo.equalsIgnoreCase("Fuego")) {
			
			return new Fuego(vida, fuerza, nombre );
			
		}else if(tipo.equalsIgnoreCase("Agua")) {
			
			return new Agua(vida, fuerza, nombre );
		}else {
			return null;
		}
	}

	public static int getVida() { 
		return vida;
	}

	public static void setVida(int vida) {
		Factoria.vida = vida;
	}

	public static int getFuerza() {
		return fuerza;
	}

	public static void setFuerza(int fuerza) {
		Factoria.fuerza = fuerza;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		Factoria.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		Factoria.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Factoria [tipo=" + tipo + ", nombre=" + nombre + "]";
	}
	
	

}
