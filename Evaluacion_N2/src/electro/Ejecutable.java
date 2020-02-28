package electro;

import java.util.*;

/**
 * Clase main ejecutable
 * @author Isaac Pizarro C
 *
 */
public class Ejecutable {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Electrodomestico arrelectro[] = new Electrodomestico[10];

		/**
		 * llenado del arreglo
		 */
		arrelectro[0] = new Electrodomestico(300000, "gris", 'A', 30);
		arrelectro[1] = new Electrodomestico(300000, 15);
		arrelectro[2] = new Electrodomestico();
		arrelectro[3] = new Lavadora();
		arrelectro[4] = new Lavadora(350000, 25);
		arrelectro[5] = new Lavadora(550000, "negro", 'D', 50, 90);
		arrelectro[6] = new Television();
		arrelectro[7] = new Television(450000, 10);
		arrelectro[8] = new Television(650000, "azul", 'A', 25, 50, true);
		arrelectro[9] = new Television(350000, "rojo", 'E', 50, 10, false);

		/**
		 * Variables para el recorrido del for
		 */
		double sumaElectro = 0;
		double sumaTv = 0;
		double sumaLav = 0;
		double sumatemp=0;
		
		
		/**
		 * For recorre el arreglo buscando y sumando segun el objeto, se acumula
		 * en las variables ya declaradas
		 */
		for (int i = 0; i < arrelectro.length; i++) {
			

			if (arrelectro[i] instanceof Electrodomestico) {
				sumaElectro += arrelectro[i].precioFinal();
			}

			if (arrelectro[i] instanceof Television) {
				sumaTv += arrelectro[i].precioFinal();
			}

			if (arrelectro[i] instanceof Lavadora) {
				sumaLav += arrelectro[i].precioFinal();
			}
		}

		/**
		 * Saida por pantalla de los acumuladores
		 */
		System.out.println("La suma del precio de los electrodomesticos es de: " + sumaElectro);
		System.out.println("La suma del precio de las televisiones es de: " + sumaTv);
		System.out.println("La suma del precio de las lavadoras es de: " + sumaLav);

	}

}
