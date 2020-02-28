package electro;

/**
 * 
 * @author Isaac Pizarro C.
 *
 */

public class Electrodomestico {

	protected final static int PRECIO_BASE_D = 100000;
	protected final static String COLOR_D = "blanco";// no tomar en cuanta si la salida es may o min.
	protected final static char CONSUMO_D = 'F';
	protected final static float PESO_D = 5;

	private static int precioBase;
	private String color;
	private char consumo;
	static float pesoElectro;

	/**
	 * Constructor por defecto de la clase Electrodomestico
	 */
	public Electrodomestico() {
		this(PRECIO_BASE_D, COLOR_D, CONSUMO_D, PESO_D);
		
	}

	/**
	 * Constructor con 2 parametros
	 * 
	 * @param precio corresponde al precio base del electrodomestico
	 * @param peso   corresponde al peso del electrodomestico
	 */
	public Electrodomestico(int precio, float peso) {
		this(precioBase, COLOR_D, CONSUMO_D, pesoElectro);
		
	}

	/**
	 * Constructor con 4 parametros
	 * 
	 * @param precio  precio base del elecctrodomestico
	 * @param color   color de electrodomestico
	 * @param consumo letra de consumo electrodomestico
	 * @param peso    peso del electrodomestico
	 */
	public Electrodomestico(int precio, String color, char consumo, float peso) {
		this.precioBase = precio;
		this.pesoElectro = peso;
		comprobarConsumoEnergetico(consumo);
		comprobarColor(color);
	}

	/**
	 * Retorna el precio del electrodomestico
	 * 
	 * @return
	 */
	public int getPrecioBase() {
		return precioBase;
	}

	/**
	 * Retorna el color del electrodomestico
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Retorna el consumo del electrodomestico
	 * 
	 * @return
	 */
	public char getConsumo() {
		return consumo;
	}

	/**
	 * Retorna el peso del electrodomestico
	 * 
	 * @return
	 */
	public float getPeso() {
		return pesoElectro;
	}

	/**
	 * Evalua si la letra ingresada corresponde a las de tipo de consumo, en caso de
	 * no ser valida asigna defecto
	 * @param letraConsumo
	 */
	private void comprobarConsumoEnergetico(char letraConsumo) {

		String letra = letraConsumo + "";
		letra = letra.toUpperCase();

		switch (letra) {
		case "A":
			consumo = 'A';
			break;

		case "B":
			consumo = 'B';
			break;
		case "C":
			consumo = 'C';
			break;
		case "D":
			consumo = 'D';
			break;
		case "E":
			consumo = 'E';
			break;
		case "F":
			consumo = 'F';
			break;
		default:
			consumo = CONSUMO_D;

		}// fin switch
	}

	/**
	 * evalua si el ccolor corresponde a los establecidos, sino asigna por defecto
	 * 
	 * @param color
	 */
	private void comprobarColor(String color) {

		color = color.toLowerCase();

		switch (color) {
		case "blanco":
			this.color = color;
			break;
		case "negro":
			this.color = color;
			break;
		case "rojo":
			this.color = color;
			break;
		case "azul":
			this.color = color;
			break;
		case "gris":
			this.color = color;
			break;
		default:
			this.color = COLOR_D;

		}// fin switch

	}

	/**
	 * Evalua segun el peso y consumo agregar valor al precio final
	 */
	public int precioFinal() {

		int valorConsumo=0;
		int valorPeso=0;
		int valorTotal=0;

		switch (consumo) {
		case 'A':
			valorConsumo = 100;// euros o pesos
			break;
		case 'B':
			valorConsumo = 80;
			break;
		case 'C':
			valorConsumo = 60;
			break;
		case 'D':
			valorConsumo = 50;
			break;
		case 'E':
			valorConsumo = 300;
			break;
		case 'F':
			valorConsumo = 10;
			break;

		}// fin switch

		if (pesoElectro > 0 && pesoElectro < 20) {
			valorPeso = 10;// euros o pesos???
		}
		if (pesoElectro > 19 && pesoElectro < 50) {
			valorPeso = 50;
		}
		if (pesoElectro > 49 && pesoElectro < 80) {
			valorPeso = 80;
		}
		if (pesoElectro > 79) {
			valorPeso = 100;
		}
		
		valorTotal=valorConsumo+valorPeso;
		
		return precioBase+valorTotal;
	}

}
