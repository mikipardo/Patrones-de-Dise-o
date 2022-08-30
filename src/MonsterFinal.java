
public class MonsterFinal {

	private static final MonsterFinal mostruo = new MonsterFinal();
	private int vida;
	private String nombre;

	private MonsterFinal() {
		// TODO Auto-generated constructor stub

	}

	// este es el kit de cuestión
	public static MonsterFinal instancia() {
		return mostruo;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
