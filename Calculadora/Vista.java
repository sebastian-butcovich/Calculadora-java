package Calculadora;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import	javax.swing.*;
public class Vista extends JFrame {
	private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21,bt22,bt23,bt24,bt25,bt26,bt27,bt28;
	private JTextField texto;
	private GridBagConstraints g;
	private JPanel panel;
	private JMenuBar menu;
	private JMenu menu1,menu2,menu3;
	
	public Vista()
	{
		this.setTitle("Calculadora");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		componentes();
		posicionarComponentes();
		modificacionText();
		this.setJMenuBar(menu);
		this.setVisible(true);
	}
	public void componentes()
	{
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		menu = new JMenuBar();
		this.add(panel);
		armadoMenu();
	}
	public void armadoMenu()
	{
		menu1 = new JMenu("Edicion");
		menu2 = new JMenu("Ver");
		menu3 = new JMenu("Ayuda");
		menu.add(menu1);
		menu.add(menu2);
		menu.add(menu3);
	}
	public void posicionarComponentes()
	{
		panel.add(menu);
		g = new GridBagConstraints();
		texto = new JTextField("0");
		g.gridx = 0;
		g.gridy = 0;
		g.gridwidth = 20;
		g.gridheight =2;
		g.fill = GridBagConstraints.BOTH;
		g.weightx = 0.5;
		g.weighty = 0.5;
		
		panel.add(texto,g);
		
		
		// Boton M
		bt1 = new JButton("M");
		g.gridx = 0;
		g.gridy = 2;
		g.gridwidth = 1;
		g.gridheight = 1;
		g.insets = new Insets(5,5,15,15);
		panel.add(bt1,g);
		
		bt2 = new JButton("Retroceso");
		g.gridx = 1;
		g.gridy = 2;
		g.gridwidth = 2;
		g.gridheight = 1;
		g.insets = new Insets(5,5,15,5);
		panel.add(bt2,g);
		
		bt3 = new JButton("CE");
		g.gridx = 3;
		g.gridy = 2;
		g.gridwidth = 2;
		g.gridheight = 1;
		panel.add(bt3,g);
		
		bt4 = new JButton("C");
		g.gridx = 5;
		g.gridy = 2;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt4,g);
		
		bt5 = new JButton("MC");
		g.gridx = 0;
		g.gridy = 3;
		g.gridwidth = 1;
		g.gridheight = 1;
		g.insets = new Insets(5,5,5,15);
		panel.add(bt5,g);
		
		bt6 = new JButton("MS");
		g.gridx = 0;
		g.gridy = 4;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt6,g);
		
		bt7 = new JButton("MR");
		g.gridx = 0;
		g.gridy = 5;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt7,g);

		bt8 = new JButton("M+");
		g.gridx = 0;
		g.gridy = 6;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt8,g);
		
		bt9 = new JButton("7");
		g.gridx = 1;
		g.gridy = 3;
		g.gridwidth = 1;
		g.gridheight = 1;
		g.insets = new Insets(5,5,5,5);
		panel.add(bt9,g);
		
		bt10 = new JButton("8");
		g.gridx = 2;
		g.gridy = 3;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt10,g);
		
		bt11 = new JButton("9");
		g.gridx = 3;
		g.gridy = 3;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt11,g);
		
		bt12 = new JButton("/");
		g.gridx = 4;
		g.gridy = 3;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt12,g);
		
		bt13 = new JButton("sqrt");
		g.gridx = 5;
		g.gridy = 3;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt13,g);
		
		bt14 = new JButton("4");
		g.gridx = 1;
		g.gridy = 4;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt14,g);
		
		bt15 = new JButton("5");
		g.gridx = 2;
		g.gridy = 4;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt15,g);
		
		bt16 = new JButton("6");
		g.gridx = 3;
		g.gridy = 4 ;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt16,g);
		
		bt17 = new JButton("*");
		g.gridx = 4;
		g.gridy = 4;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt17,g);
		
		bt18 = new JButton("%");
		g.gridx = 5;
		g.gridy = 4;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt18,g);
		
		bt19 = new JButton("1");
		g.gridx = 1;
		g.gridy = 5;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt19,g);
		
		bt20 = new JButton("2");
		g.gridx = 2;
		g.gridy = 5;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt20,g);
		
		bt21 = new JButton("3");
		g.gridx = 3;
		g.gridy = 5;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt21,g);
		
		bt22 = new JButton("-");
		g.gridx = 4;
		g.gridy = 5;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt22,g);
		
		bt23 = new JButton("1/x");
		g.gridx = 5;
		g.gridy = 5;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt23,g);
		
		bt24 = new JButton("0");
		g.gridx = 1;
		g.gridy = 6;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt24,g);
		
		bt25 = new JButton("+/-");
		g.gridx = 2;
		g.gridy = 6;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt25,g);
		
		bt26 = new JButton(",");
		g.gridx = 3;
		g.gridy = 6;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt26,g);
		
		bt27 = new JButton("+");
		g.gridx = 4;
		g.gridy = 6;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt27,g);
		
		bt28 = new JButton("=");
		g.gridx = 5;
		g.gridy = 6;
		g.gridwidth = 1;
		g.gridheight = 1;
		panel.add(bt28,g);
	}
	public JButton getBt1() {
		return bt1;
	}
	public void setBt1(JButton bt1) {
		this.bt1 = bt1;
	}
	public JButton getBt2() {
		return bt2;
	}
	public void setBt2(JButton bt2) {
		this.bt2 = bt2;
	}
	public JButton getBt3() {
		return bt3;
	}
	public void setBt3(JButton bt3) {
		this.bt3 = bt3;
	}
	public JButton getBt4() {
		return bt4;
	}
	public void setBt4(JButton bt4) {
		this.bt4 = bt4;
	}
	public JButton getBt5() {
		return bt5;
	}
	public void setBt5(JButton bt5) {
		this.bt5 = bt5;
	}
	public JButton getBt6() {
		return bt6;
	}
	public void setBt6(JButton bt6) {
		this.bt6 = bt6;
	}
	public JButton getBt7() {
		return bt7;
	}
	public void setBt7(JButton bt7) {
		this.bt7 = bt7;
	}
	public JButton getBt8() {
		return bt8;
	}
	public void setBt8(JButton bt8) {
		this.bt8 = bt8;
	}
	public JButton getBt9() {
		return bt9;
	}
	public void setBt9(JButton bt9) {
		this.bt9 = bt9;
	}
	public JButton getBt10() {
		return bt10;
	}
	public void setBt10(JButton bt10) {
		this.bt10 = bt10;
	}
	public JButton getBt11() {
		return bt11;
	}
	public void setBt11(JButton bt11) {
		this.bt11 = bt11;
	}
	public JButton getBt12() {
		return bt12;
	}
	public void setBt12(JButton bt12) {
		this.bt12 = bt12;
	}
	public JButton getBt13() {
		return bt13;
	}
	public void setBt13(JButton bt13) {
		this.bt13 = bt13;
	}
	public JButton getBt14() {
		return bt14;
	}
	public void setBt14(JButton bt14) {
		this.bt14 = bt14;
	}
	public JButton getBt15() {
		return bt15;
	}
	public void setBt15(JButton bt15) {
		this.bt15 = bt15;
	}
	public JButton getBt16() {
		return bt16;
	}
	public void setBt16(JButton bt16) {
		this.bt16 = bt16;
	}
	public JButton getBt17() {
		return bt17;
	}
	public void setBt17(JButton bt17) {
		this.bt17 = bt17;
	}
	public JButton getBt18() {
		return bt18;
	}
	public void setBt18(JButton bt18) {
		this.bt18 = bt18;
	}
	public JButton getBt19() {
		return bt19;
	}
	public void setBt19(JButton bt19) {
		this.bt19 = bt19;
	}
	public JButton getBt20() {
		return bt20;
	}
	public void setBt20(JButton bt20) {
		this.bt20 = bt20;
	}
	public JButton getBt21() {
		return bt21;
	}
	public void setBt21(JButton bt21) {
		this.bt21 = bt21;
	}
	public JButton getBt22() {
		return bt22;
	}
	public void setBt22(JButton bt22) {
		this.bt22 = bt22;
	}
	public JButton getBt23() {
		return bt23;
	}
	public void setBt23(JButton bt23) {
		this.bt23 = bt23;
	}
	public JButton getBt24() {
		return bt24;
	}
	public void setBt24(JButton bt24) {
		this.bt24 = bt24;
	}
	public JButton getBt25() {
		return bt25;
	}
	public void setBt25(JButton bt25) {
		this.bt25 = bt25;
	}
	public JButton getBt26() {
		return bt26;
	}
	public void setBt26(JButton bt26) {
		this.bt26 = bt26;
	}
	public JButton getBt27() {
		return bt27;
	}
	public void setBt27(JButton bt27) {
		this.bt27 = bt27;
	}
	public JButton getBt28() {
		return bt28;
	}
	public void setBt28(JButton bt28) {
		this.bt28 = bt28;
	}
	public JTextField getTexto() {
		return texto;
	}
	public void setTexto(JTextField texto) {
		this.texto = texto;
	}
	public GridBagConstraints getG() {
		return g;
	}
	public void setG(GridBagConstraints g) {
		this.g = g;
	}
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	public JMenuBar getMenu() {
		return menu;
	}
	public void setMenu(JMenuBar menu) {
		this.menu = menu;
	}
	public JMenu getMenu1() {
		return menu1;
	}
	public void setMenu1(JMenu menu1) {
		this.menu1 = menu1;
	}
	public JMenu getMenu2() {
		return menu2;
	}
	public void setMenu2(JMenu menu2) {
		this.menu2 = menu2;
	}
	public JMenu getMenu3() {
		return menu3;
	}
	public void setMenu3(JMenu menu3) {
		this.menu3 = menu3;
	}
	public void modificacionText()
	{
		texto.setFont(new Font("TimesRoman",Font.BOLD,30));
		texto.setHorizontalAlignment(SwingConstants.RIGHT);
	}
	
}
