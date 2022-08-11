package FACTORY;

public class Agua implements Pokemon {

	
	
	private int vida, fuerza;

	private String nombre;

	public Agua() {
		// TODO Auto-generated constructor stub
	}

	public Agua(int vida, int fuerza, String nombre) {
		super();
		this.vida = vida;
		this.fuerza = fuerza;
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int ataque() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int ataque(int vidaContrario) {
		// TODO Auto-generated method stub

		int resultado = (this.fuerza - vidaContrario);

		if (resultado < 0) {
			resultado = 0;
		}
		return resultado;
	}

	@Override
	public int vida() {
		// TODO Auto-generated method stub
		return vida;
	}

}
