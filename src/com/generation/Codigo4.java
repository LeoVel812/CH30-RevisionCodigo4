package com.generation;

import java.util.Scanner;

/*
 * Programa sobre el juego de piedra, papel o tijeras 
 */
public class Codigo4 {
	// agregar metodo main
	public static void main(String[] args) {
		// agregar importacion
		Scanner s = new Scanner(System.in);// colocar entrada en el constructor

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");// corregir el jugador
//	    Scanner s2 = new Scanner();//quitar nuevo objeto scanner y usar el definido antes
		String j2 = s.nextLine();

		if (j1.equals(j2)) {// quitar ) del if, y cambiar == al metodo equals
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2.equals("tijeras")) {// cambiar == por el metodo equals para comparar el contenido
					g = 1;
				}
			case "papel":
				if (j2.equals("piedra")) {// cambiar == por el metodo equals
					g = 1;
				} // agregar llave de cierre del if
			case "tijeras"://agregar s a tijera
				if (j2.equals("papel")) {
					g = 1;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + g);
		}
		s.close();
	}

}
