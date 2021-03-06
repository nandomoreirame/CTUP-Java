package br.com.ctup.dsj;

/**
 * @author nandomoreirame
 *
 */
public class Helpers
{
	private double pi = 3.14;
	
	public double potencia(double x, double y) {
		return Math.pow(x, y);
	}
	
	public double raiz(double x) {
		return Math.sqrt(x);
	}
	
	public int celsiusToFahrenheit(int celsius) {
		return (9 * celsius + 160) / 5;
	}
	
	public double volume(int raio, int altura) {
		return this.pi * this.potencia(raio, 2) * altura;
	}
	
	public double distacia(double tempo, double velocidade) {
		return tempo * velocidade;
	}
	
	public double percentage(double valor, double percent) {
		return valor + (valor * percent) / 100;
	}
}
