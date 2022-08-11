package FactoryMejorado;

public class MainWepon {

	public MainWepon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractaWeapon factory1 = FactoryWeapon.fabricArmas("Gun", 10, 5);
		AbstractaWeapon factory2 = FactoryWeapon.fabricArmas("Metralleta", 10, 5);
		
		
		System.out.println(factory1.rafaga());
		System.out.println(factory2.rafaga());
		
		System.out.println(factory1.getClass());
		System.out.println(factory2.getClass());

	}

}
