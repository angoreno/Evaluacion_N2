package electro;

/**
 * 
 * @author Isaac Pizarro C.
 *
 */

public class Lavadora extends Electrodomestico {
	
	 
	 private final static int CARGA_D=5;
	 private int carga;

	 /**
	  * Constructor por defecto
	  */
	public Lavadora() {
		this(PRECIO_BASE_D, COLOR_D, CONSUMO_D, PESO_D,CARGA_D);
		
	}
	
	public Lavadora(int precioB, float peso) {
		
		// TODO Apéndice de constructor generado automáticamente
	}

	public Lavadora(int precioB, String color, char consumo, float peso, int carga) {
		super(precioB, color, consumo, peso);
		// TODO Apéndice de constructor generado automáticamente
	}

	public int getCarga() {
		return carga;
	}

	public int precioFinal() {
		int precioF=0;
		
		return precioF;
	}
	
	

}
