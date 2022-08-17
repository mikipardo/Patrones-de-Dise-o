package Prototype;

public interface InterfazClonador extends Cloneable {

	//este metodo que se tiene que declarar siempre devuelve un objeto de la misma interfaz
	InterfazClonador clonar();

}
