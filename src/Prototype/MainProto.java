package Prototype;
/*
 * Se usa cuando se quiere clonar un objeto cosotoso de inastanciar por
 * ejemplo, el objeo clonado tienen las mismas caracteristicas y atributos
 * pero a si se compara con el objeto original es diferente.
 * 
 * Receta:
 * Para ello creamos una interfaz o clase abstracta que herede de la clase nativa Cloneable
 * esta clase abstracta o interfaz devuelve un metodo con un objeto de la misma clase
 * 
 * 
 * 
 * */

public class MainProto {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon pikachu = new Pokemon("Tiki", "Eléctrico",27, 63, 56, 84, 71, 7.3);
		
		System.out.println(pikachu.toString());
		
		Pokemon pikachuClonado =   (Pokemon) pikachu.clonar();
		
		System.out.println(pikachuClonado.toString() + "\n  este es el clonado todo igual pero diferentes objetos");
		
		
		//usamos un comparador para ver si so realmente los mismos objetos
		
		if(pikachu==pikachuClonado) {
			System.out.println("Son iguales");
			
		}else if(pikachu!=pikachuClonado) {
			System.out.println("NO son iguales");
			System.out.println(pikachu.hashCode());
			System.out.println(pikachuClonado.hashCode());
		}

	}

}
