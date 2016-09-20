package ar.edu.unlam.tp1.circulo;

public class circulo {

	private static final Double PI = 3.14;
	private Double radio;
	private Double circunferencia;
	private Double area;
	
	public circulo(Double radioingresado){
		this.radio = radioingresado;
	}
	
	public Double crearCirculo(){
		return circunferencia = 2 * radio * PI;
	}

	public Double calcularArea(){
		return area = radio * radio * PI;
		
	}
	
	public Double getCircunferencia(Double radioingresado){
		return this.circunferencia;		
	}
	
	public Double getSuperficie (Double radioingresado){
		return this.area;
	}
	
}	