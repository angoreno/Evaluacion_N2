package electro;

/**
 * @author Isaac Pizarro C.
 */

public class Television extends Electrodomestico {
	
	protected static int RESOLUCION=20;
	protected static boolean SINTONIZADOR_TDT=false;
	
	private static int resolucion;//pulgadas
	private static boolean sintonizadorTDT=false;

	/**
	 * Contructor por defecto
	 */
	public Television() {
		
	}

	/**
	 * Contructor con 2 parametros
	 * @param precioB
	 * @param peso
	 */
	public Television(double precioB, float peso) {
		this(precioB, COLOR_D, CONSUMO_D, peso, RESOLUCION,SINTONIZADOR_TDT);
		
	}

	/**
	 * contructor con 6 parametros
	 * @param precioB
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param resolucion
	 * @param sintoniza
	 */
	public Television(double precioB, String color, char consumo, float peso,int resolucion, boolean sintoniza) {
		super(precioB, color, consumo, peso);
		Television.resolucion=resolucion;
		Television.sintonizadorTDT=sintoniza;
	}

	/**
	 * retorna la resolucion del televisor
	 * @return
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * retorna si tiene sintonizador el televisor
	 * @return
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
	 * retorna precio final de televisor evaluando
	 * sintonizador y resolucion
	 * @return
	 */
	public double precioFinal(){
		double precioF=super.precioFinal();
		double valor=0;
		
		if (resolucion>40) {
			precioF=precioF*1.03;
			if (sintonizadorTDT=true) {
				valor=50;
			}else {
				valor=0;
			}
			
		}else if (sintonizadorTDT=true){
			valor=50;
		}
		
		return precioF+valor;	
		
	}

}
