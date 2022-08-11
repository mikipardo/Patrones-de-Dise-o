package FactoryMejorado;

public class Gun extends AbstractaWeapon {
	private int balas, velocidad;
	
	public Gun(int balas, int velocidad) {
		super(balas, velocidad);
		// TODO Auto-generated constructor stub
		this.balas=balas;
		this.velocidad=velocidad;
	}

	@Override
	public int rafaga() {
		// TODO Auto-generated method stub
		return this.getVelocidad()-this.getBalas();
	}

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
