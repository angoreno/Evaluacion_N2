package electro;

public class Television extends Electrodomestico {
	
	int resolucion;
	boolean sintonizadorTDT=false;

	public Television() {
		// TODO Apéndice de constructor generado automáticamente
	}

	public Television(int precioB, float peso) {
		super(precioB, peso);
		// TODO Apéndice de constructor generado automáticamente
	}

	public Television(int precioB, String color, char consumo, float peso,int resolucion, boolean sintoniza) {
		super(precioB, color, consumo, peso);
		// TODO Apéndice de constructor generado automáticamente
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	public int precioFinal(){
		int precioF=0;
		
		return precioF;	
		
	}

}
