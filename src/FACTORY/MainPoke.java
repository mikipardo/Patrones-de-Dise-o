package FACTORY;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainPoke {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String nombre ;
		
		String nombre2 ;
		
		String tipo;

		int contador=0;
		
		/*
		
		nombre= JOptionPane.showInputDialog("Inroduzca el nombre del 1º Pokemón");
		nombre2 =JOptionPane.showInputDialog("Inroduzca el nombre del 2º Pokemón");
		
		
		
		Pokemon pokeFactoria2 =   Factoria.factoria(MainPoke.dameTipo(), "asda");
			
		Pokemon pokeFactoria1 =  Factoria.factoria(MainPoke.dameTipo(), "asda");
		
		
	
		
		System.out.println(pokeFactoria1.ataque());
		
	

		*/
	
		for (int i = 0; i < 5; i++) {
			System.out.println(MainPoke.dameTipo());
			
		}
		
		Pokemon pokeFactoria2 =   Factoria.factoria(MainPoke.dameTipo(), "Charmander");
		
		Pokemon pokeFactoria1 =  Factoria.factoria(MainPoke.dameTipo(), "Bulbasur");
		
		
		
		System.out.println(pokeFactoria1.vida());

	}
	
	private static String dameTipo() {
		
		int aleatorio = (int) (Math.random()*10);
		
		if(aleatorio%2==1) {
			return "Agua";
		}else {
			return "Fuego";
		}
	}
}
