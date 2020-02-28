package electro;

/**
 * 
 * @author Isaac Pizarro C.
 *
 */

public class Lavadora extends Electrodomestico {

	protected final static int CARGA_D = 5;
	private int carga;

	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		this(PRECIO_BASE_D, COLOR_D, CONSUMO_D, PESO_D, CARGA_D);

	}

	/**
	 * Constructor con 2 parametros, restante por defecto
	 * 
	 * @param precioB precio base de
	 * @param peso    peso de
	 */
	public Lavadora(double precioB, float peso) {
		this(precioB, COLOR_D, CONSUMO_D, peso, CARGA_D);

	}

	/**
	 * Contructor con 5 parametros
	 * 
	 * @param precioB
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param carga
	 */
	public Lavadora(double precioB, String color, char consumo, float peso, int carga) {
		super(precioB, color, consumo, peso);
		this.carga = carga;
	}

	/**
	 * Retorna carga de lavadora
	 * 
	 * @return
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * retorna precio final de lavadora sumando 
	 * carga en caso de ser mayor
	 * @return
	 */
	public double precioFinal() {
		double precioF = super.precioFinal();
		double valor = 0;

		if (carga > 30) {
			valor = 30;
		}

		return precioF + valor;
	}

}
