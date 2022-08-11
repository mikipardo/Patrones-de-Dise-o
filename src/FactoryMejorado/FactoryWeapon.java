package FactoryMejorado;

public class FactoryWeapon {

public static AbstractaWeapon fabricArmas(String tipo, int balas, int velocidad) {
	
	if(tipo.equalsIgnoreCase("gun")) {
		return new Gun(balas, velocidad);
	}else if(tipo.equalsIgnoreCase("metralleta")) {
		return new MachineGun(balas, velocidad);
	}else {
		return new MachineGun(0, 0);
	}
}

}
