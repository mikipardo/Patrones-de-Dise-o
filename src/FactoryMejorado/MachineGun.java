package FactoryMejorado;

public class MachineGun extends AbstractaWeapon {
	
	private int balas, velocidad;

	public MachineGun(int balas, int velocidad) {
		super(balas, velocidad);
		// TODO Auto-generated constructor stub
		this.balas=balas;
		this.velocidad=velocidad;
		
	}
	
	@Override
	public int rafaga() {
		// TODO Auto-generated method stub
		return this.balas*this.velocidad;
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
