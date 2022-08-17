package Prototype;

public class Pokemon implements InterfazClonador {
	
	String nombre,tipo;
	int ataque,defensa,vida,nivel,ranking;
	double valoracion;
	
	public Pokemon(String nombre, String tipo, int ataque, int defensa, int vida, int nivel, int ranking,
			double valoracion) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.ataque = ataque;
		this.defensa = defensa;
		this.vida = vida;
		this.nivel = nivel;
		this.ranking = ranking;
		this.valoracion = valoracion;
	}
	
	
	@Override
	public InterfazClonador clonar() {
	InterfazClonador clon = null;
	
	try {					//clone es el método heredado para clonar
		clon = (Pokemon) clone();
	} catch (CloneNotSupportedException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	return clon;
	}


	public Pokemon() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public double getValoracion() {
		return valoracion;
	}

	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", vida=" + vida + ", nivel=" + nivel + ", ranking=" + ranking + ", valoracion=" + valoracion + "]";
	}




}
