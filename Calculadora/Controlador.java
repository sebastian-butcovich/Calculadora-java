package Calculadora;

import	java.awt.event.ActionListener;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import	java.lang.*;

public class Controlador {
	private final Vista v;
	private final Modelo m;
	private double v1,ultimoV;
	
	public Controlador()	{
		v = new Vista();
		m = new Modelo();
		v.getBt9().addActionListener(new actionBotones());    //numeros
		v.getBt10().addActionListener(new actionBotones());
		v.getBt11().addActionListener(new actionBotones());
		v.getBt14().addActionListener(new actionBotones());
		v.getBt15().addActionListener(new actionBotones());
		v.getBt16().addActionListener(new actionBotones());
		v.getBt19().addActionListener(new actionBotones());
		v.getBt20().addActionListener(new actionBotones());
		v.getBt21().addActionListener(new actionBotones());
		
		v.getBt22().addActionListener(new actionResta()); //operadores
		v.getBt27().addActionListener(new actionSuma());
		v.getBt12().addActionListener(new actionDivision()); //operadores
		v.getBt17().addActionListener(new actionMultiplicacion());
		
		v1 = 0;
		v.getBt28().addActionListener(new actionIgual());

	
	}
	private class actionBotones implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			limpiarOperacion();
			if(v.getTexto().getText().equals("0"))
			{
				v.getTexto().setText("");
			}
			v.getTexto().setText(v.getTexto().getText()+((JButton)e.getSource()).getText());
		}
	}
	
	private class actionSuma implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			v1 = Integer.parseInt(v.getTexto().getText());
			limpiarPantalla();
			ultimoV = m.suma(ultimoV,v1);
		}

	}
	public void limpiarPantalla()
	{
		v.getTexto().setText("");
	}
	public void limpiarOperacion()
	{
		if(v.getTexto().getText().equals(ultimoV+""))
		{
			v.getTexto().setText("");
		}
	}
	private class actionResta implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			v.getTexto().setText(v.getTexto().getText()+((JButton)e.getSource()).getText());

		}

	}
	
	private class actionDivision implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			v.getTexto().setText(v.getTexto().getText()+((JButton)e.getSource()).getText());

		}

	}
	
	private class actionMultiplicacion implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			v.getTexto().setText(v.getTexto().getText()+((JButton)e.getSource()).getText());
		}

	}

	private  class actionIgual implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			v.getTexto().setText(ultimoV+"");
		}
	}
	
	
	public static void main(String[]args)
	{
		new Controlador();
	}
	
}
