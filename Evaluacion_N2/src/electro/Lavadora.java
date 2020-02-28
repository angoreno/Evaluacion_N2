package electro;

public class Lavadora extends Electrodomestico {
	
	 private int carga;
	 private final int cargaDef=5;

	public Lavadora() {
		// TODO Apéndice de constructor generado automáticamente
	}

	public Lavadora(int precioB, float peso) {
		super(precioB, peso);
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
