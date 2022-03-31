
//JWAloFito.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JWAloFito extends JFrame implements ActionListener
{

JButton B1, B2, B3;
JTextField TF;

	public static void main(String args[])
	{

	JFrame JExAlo = new JWAloFito();
	JExAlo.setVisible(true);

	}

	JWAloFito()
	{

	setTitle("Java - 2° Sistemas / Internet");
	setSize(300,250);
	setLocation(500,300);
	setResizable(true);
	getContentPane().setBackground(Color.cyan);

	TF = new JTextField (20);
	TF.setBackground(Color.cyan);
	TF.setForeground(Color.red);

	   B3 = new JButton("Sair");
	   B2 = new JButton("Limpar");
	   B1 = new JButton("Alo");
	   B1.addActionListener(this);
	   B2.addActionListener(this);
	   B3.addActionListener(this);
	   getContentPane().setLayout(new GridLayout(4,2));
	   getContentPane().add(TF);
	   getContentPane().add(B1);
	   getContentPane().add(B2);
	   getContentPane().add(B3);
}
	public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==B3)
	System.exit(0);

	if(e.getSource()==B2)
	TF.setText("    ");

	if(e.getSource()==B1)
	TF.setText("Alo Fito 2° Sistemas / Internet - 2021");

}
}