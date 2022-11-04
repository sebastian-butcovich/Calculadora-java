package Calculadora.Complementarios;

public class Complementario {
	private double operador1;
	private double operador2;
	private String operador;

	public static String[] convertirStringAVector(String operacion)
	{
		String[] vector = new String[operacion.length()];
		for(int i = 0; i<operacion.length(); i++)
		{
			vector[i]= String.valueOf(operacion.charAt(i));
		}

		return vector;
	}

	public static void ordenValor(String[] operacion)
	{
		int orden=0;
		for(int i = 0; i<operacion.length; i++)
		{
			if(operacion[i].equals("+"))
			{
				break;
			}
			if(operacion[i].equals("-"))
			{
				break;
			}
			if(operacion[i].equals("*"))
			{
				break;
			}
			if(operacion[i].equals("/"))
			{
				break;
			}
			orden=i;
		}
		generadorValor(operacion,orden);
	}
	public static double generadorValor(String[]operacion,int orden)
	{
		double numero = 0;
		int indice = 0;
		while(orden>=0 && indice<operacion.length)
		{
			numero += exponencial(Integer.parseInt(operacion[indice]),orden);
		}
		return numero;
	}
	private static  int exponencial(int numero,int o)
	{
		if(o<=0) {
			return numero;
		}else {
			numero = exponencial(numero,o-1);
		}
		return numero;
	}
}
