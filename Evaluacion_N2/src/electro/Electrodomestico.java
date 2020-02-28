package electro;

public class Electrodomestico {

	/**
	 * @author Isaac Pizarro C Superclase
	 */

	private int precioBase = 100000;

	private String color = "blanco";// no tomar en cuanta si la salida es may o min.
	private char consumo = 'F';

	private float peso = 5;

	public Electrodomestico() {

	}

	public Electrodomestico(int precioB, float peso) {
		
		precioBase=precioB;
		this.peso=peso;
	}

	public Electrodomestico(int precioB, String color, char consumo, float peso) {
		
		precioBase=precioB;
		this.color=color;
		this.consumo=consumo;
		this.peso=peso;

	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public float getPeso() {
		return peso;
	}

	/**
	 * comprueba que la letra es correcta,sino es correcta
	 *  usara la letra por defecto. Se invocará al crear el objeto
	 * @param letra
	 */
	private void comprobarConsumoEnergetico(char letra) {
		
		switch (letra) {
		case 'A':
			consumo='A';
			break;
		case 'B':
			consumo='B';
			break;
		case 'C':
			consumo='C';
			break;
		case 'D':
			consumo='D';
			break;
		case 'E':
			consumo='E';
			break;
		case 'F':
			consumo='F';
			break;
		default: 
			consumo='F';			
		}
			
		
		
	}
	
	private void comprobarColor(String color) {
		
	}
	
	public int precioFinal() {
		int precioF=0;
		
		return precioF;
		
	}
	

}
