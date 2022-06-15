package com.anahuac.calidad.tareasErik;

public class Prueba {
	private float ultimoResultado;
	
	public float suma(float primerSumando, float segundoSumando) {
		return ultimoResultado = primerSumando + segundoSumando;
	}
	
	public float resta(float minuendo, float sustraendo) {
		return ultimoResultado = minuendo - sustraendo;
	}
	
	public float multiplicacion(float primerFactor, float segundoFactor) {
		return ultimoResultado = primerFactor*segundoFactor;
	}
	
	public float division(float dividendo, float divisor) throws ArithmeticException{
		if(divisor ==0)
			throw new ArithmeticException("La division entre cero no esta permitida");
		else
			
		return ultimoResultado = dividendo/divisor;
	}
	
	public float getUltimaResultado() {
		return ultimoResultado;
	}
}
