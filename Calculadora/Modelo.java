package Calculadora;

public class Modelo {
	private double ultimoValor;
	
	public Modelo()
	{
		
	}
	public double suma(double x,double y)
	{
		this.ultimoValor= x + y;
		return ultimoValor;
	}
	public double resta(double x, double y)
	{
		ultimoValor = x-y;
		return ultimoValor;
	}
	public double division(double x, double y)
	{
		ultimoValor = x / y;
		return ultimoValor;
	}
	public double multiplicacion(double x, double y)
	{
		ultimoValor = x*y;
		return ultimoValor;
	}
	public void reiniciarUltimoValor()
	{
		ultimoValor = 0;
	}

}
