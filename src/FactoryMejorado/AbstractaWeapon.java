package FactoryMejorado;

public abstract class AbstractaWeapon {
	
	private int balas;
	private int velocidad;

	public AbstractaWeapon(int balas, int velocidad) {
		super();
		this.balas = balas;
		this.velocidad = velocidad;
	}
	
	public abstract int rafaga();

	public int getBalas() {
		return balas;
	}

	public void setBalas(int balas) {
		this.balas = balas;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	

}
