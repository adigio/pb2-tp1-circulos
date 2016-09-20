package ar.edu.unlam.tp1.circulotest;

import junit.framework.Assert;
import org.junit.Test;
import ar.edu.unlam.tp1.circulo.circulo;

@SuppressWarnings("deprecation")

public class circulotest {

	@Test
	//Crea un circulo con radio 2
	public void crearCirculoConRadio2(){
		circulo cirConRadio = new circulo(2.00);
		Double valorEsperado = 12.56;
		Double valorActual = cirConRadio.crearCirculo();
		Assert.assertEquals(valorEsperado.doubleValue(), valorActual.doubleValue(), 0.01);
		System.out.println("El radio del circulo es "+valorActual.doubleValue());
	}
	
	@Test
	//Crea un circulo con radio 3.7
	public void crearCirculoConRadio3punto7(){
		circulo cirConRadio = new circulo(3.70);
		Double valorEsperado = 23.23;
		Double valorActual = cirConRadio.crearCirculo();
		Assert.assertEquals(valorEsperado.doubleValue(), valorActual.doubleValue(), 0.01);
		System.out.println("El radio del circulo es "+valorActual.doubleValue());
	}
	
	@Test
	public void crearCirculoConRadio5(){
		circulo cirConRadio = new circulo(5.00);
		Double valorEsperado = 31.40;
		Double valorActual = cirConRadio.crearCirculo();
		Assert.assertEquals(valorEsperado.doubleValue(), valorActual.doubleValue(), 0.01);
		System.out.println("El radio del circulo es "+valorActual.doubleValue());
	}
	
	@Test
	public void crearCirculoConRadio10punto9(){
		circulo cirConRadio = new circulo(10.90);
		Double valorEsperado = 68.45;
		Double valorActual = cirConRadio.crearCirculo();
		Assert.assertEquals(valorEsperado.doubleValue(), valorActual.doubleValue(), 0.01);
		System.out.println("El radio del circulo es "+valorActual.doubleValue());
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73(){
		circulo areaDeUnCirculo = new circulo(9.80);
		Double valorEsperado = 615.73;
		Double valorActual = areaDeUnCirculo.calcularArea();
		Assert.assertEquals(valorEsperado, valorActual, 0.01);;
	}
	
}
