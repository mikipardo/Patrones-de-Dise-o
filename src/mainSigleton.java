import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainSigleton {

	/*
	 * Nueva version de los patrones de diseño por Alexys Lozada Youtube
	 * 
	 * El patrón singleton se aseguro que solo se puede instanciar el objeto una vez
	 * así cuando lo usamos en el resto del código conseguimos que solo sea ese
	 * mismo objeto
	 * 
	 * En este caso tenemos un malo final llamado MonsterFinal que debemos de
	 * quitarle vidas con kla clase hechicero, guerrero y elfo.
	 * 
	 * para ello necesitamos que el malo malisimo solo sea uno y sea el mismo. Este
	 * patrón se suele usar para las conexiones para base de datos
	 * 
	 * Para ello el sigleton sea crea con constructor privado y un método que
	 * devuelva en estático la instancia de la clase.
	 * 
	 * Uno de los atributos tiene que ser un objeto de la propia clase que se
	 * instancie en el constructor de tipo privado. El atributo tiene que ser de
	 * tipo static para que podamos meterlo en el constructor y luego en el método.
	 * 
	 * Como toque final hemos metido en un array genérico de heroes a los personajes
	 * (Hechicero y Guerrero) que son los que nos ayuudarán en la batallas
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vidaMonster;
		int opc = 3;
		MonsterFinal monster = MonsterFinal.instancia();
		monster.setVida(100);
		monster.setNombre("Paconeitor");
		vidaMonster = monster.getVida();

		Hechicero hechicero = new Hechicero("Druida", 5, 10);
		Guerrero guerrero = new Guerrero("Warrior", 10);

		List<Heroe> arrayHeroes = new ArrayList<Heroe>();
		arrayHeroes.add(guerrero);
		arrayHeroes.add(hechicero);

		while (monster.getVida() > 0) {
			System.out.println("Pulsa 1 para atacar con " + arrayHeroes.get(0).dameNombre()
					+ "\nPulsa 2 para atacar con " + arrayHeroes.get(1).dameNombre());
			opc = new Scanner(System.in).nextInt();

			if (opc - 1 <= arrayHeroes.size() - 1) {
				vidaMonster = arrayHeroes.get(opc - 1).ataque(monster.getVida());
				monster.setVida(monster.getVida() - vidaMonster);
				System.out.println("Monstruo final vida:" + monster.getVida());
			} else {
				System.out.println("Opción incorrecta");
			}

		}

		// Instanciamos otro objeto monster a ver si es el mismo

		MonsterFinal monstruoAuxiliar = MonsterFinal.instancia();

		System.out.println("LA vida del monstruo auxiliar es: " + monstruoAuxiliar.getVida() + " y su nombre es: "
				+ monstruoAuxiliar.getNombre());

		// Como vemos el mosntruo sigue llamandose igual y sigue con la misma vida al
		// final de 0

	}

}
