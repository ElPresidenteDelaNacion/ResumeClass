package com.anahuac.calidad.tareasErik;

public class Temperaturas {
	private double resultado;
	
	//farenheit a centigrados
	public double fAC(double farenheit) {
		return resultado = ((farenheit-32)*(5/9));
	}
	
	//centigrados a farenheit
		public double cAF(double centigrados) {
			return resultado = (centigrados * (9/5)) + 32;
		}
	
}
