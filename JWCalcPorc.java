//JWCalcPorcentagem.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JWCalcPorc extends JFrame implements ActionListener
{

JLabel L1, L2, L3;
JButton B1, B2, B3;
JTextField TF1, TF2, TF3;

	public static void main(String args[])
	{

	JFrame JExPorc = new JWCalcPorc();
	JExPorc.setVisible(true);
	}

	JWCalcPorc()
	{

	setTitle("Calculadora Porcentagem");
	setSize(350,90);
	setLocation(50,50);
	setResizable(true);

	L1 = new JLabel("Valor Total: ");
	L1.setForeground(Color.black);

	L2 = new JLabel("Quantos %: ");
	L2.setForeground(Color.red);

	L3 = new JLabel("Valor Final %: ");
	L3.setForeground(Color.blue);

	B1 = new JButton("%");
	B1.addActionListener(this);

	B2 = new JButton("Limpar");
	B2.addActionListener(this);

	B3 = new JButton("Sair");
	B3.addActionListener(this);

	TF1 = new JTextField();
	TF2 = new JTextField();
	TF3 = new JTextField();

	TF3.setEditable(false);

	getContentPane().setBackground(Color.cyan);
	getContentPane().setLayout(new GridLayout(3,4));

	getContentPane().add(L1);
	getContentPane().add(TF1);
	getContentPane().add(B1);

	getContentPane().add(L2);
	getContentPane().add(TF2);
	getContentPane().add(B2);

	getContentPane().add(L3);
	getContentPane().add(TF3);
	getContentPane().add(B3);

	}

	public void actionPerformed(ActionEvent e)
	{
		float N1=0, N2=0, Resultado=0;

	if(e.getSource()==B3)
			System.exit(0);

		N1 = Float.parseFloat(TF1.getText());
		N2 = Float.parseFloat(TF2.getText());


		if(e.getSource()==B1)
			Resultado = (N1/100) * N2;

	if(e.getSource()==B2)
	{
		TF1.setText("   ");
		TF2.setText("   ");
		TF3.setText("   ");

		return;
	}


	TF3.setText("  " + Resultado);

}}





