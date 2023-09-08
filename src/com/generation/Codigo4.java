package com.generation;

import java.util.Scanner;

/*
 * Programa sobre el juego de piedra, papel o tijeras 
 * Los Dos jugadores insertan entradas de texto
 * para ver quien es ganador primero se revisa si son iguales, sino 
 * se asume que el jugador 2 es el ganador y con un switch se entra a la opcion 
 * elegida por el jugador 1 y se compara si tal comparacion la gana el jugador 1,
 * si es asi se redefine el jugador uno.
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
			int ganador = 2; // renombrar g a ganador
			switch (j1) {
			case "piedra":
				if (j2.equals("tijeras")) {// cambiar == por el metodo equals para comparar el contenido
					ganador = 1;
				}
			case "papel":
				if (j2.equals("piedra")) {// cambiar == por el metodo equals
					ganador = 1;
				} // agregar llave de cierre del if
			case "tijeras":// agregar s a tijera
				if (j2.equals("papel")) {
					ganador = 1;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + ganador);
		}
		s.close();// agregar cierre de objeto Scanner
	}

}
