package com.anahuac.calidad.tareasErik;

public class Prueba {
	private double ultimoResultado;
	
	public double suma(double primerSumando, double segundoSumando) {
		return ultimoResultado = primerSumando + segundoSumando;
	}
	
	public double resta(double minuendo, double sustraendo) {
		return ultimoResultado = minuendo - sustraendo;
	}
	
	public double multiplicacion(double primerFactor, double segundoFactor) {
		return ultimoResultado = primerFactor*segundoFactor;
	}
	
	public double division(double dividendo, double divisor) throws ArithmeticException{
		if(divisor ==0)
			throw new ArithmeticException("La division entre cero no esta permitida");
		else
			
		return ultimoResultado = dividendo/divisor;
	}
	
	public double getUltimaResultado() {
		return ultimoResultado;
	}
} 
