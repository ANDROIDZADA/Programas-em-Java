//Fibonacci.java

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Fibonacci extends JFrame implements ActionListener
{
	JButton B1;
	JTextArea TA1;

	public static void main(String args[])
	{
		JFrame Janela = new Fibonacci();
		Janela.setVisible(true);
	}

Fibonacci()
{
	setTitle("Fibonacci - Janela");
	setSize(400,200);
	setLocation(500,500);

	B1 = new JButton("Mostrar números da sequência Fibonacci menores que 255");
	B1.addActionListener(this);

	TA1 = new JTextArea();

	getContentPane().setLayout(new GridLayout(1,1));

	getContentPane().add(B1);
	getContentPane().add(TA1);

}

	public void actionPerformed(ActionEvent e)
	{

	if(e.getSource()==B1)
	{
		float X = 1, Y = 1, Z;
		Z = X + Y;
		X = Y;
		Y = Z;

		while(X < 255)
		{
		TA1.setText(X + "\n");
		}
	}
	}
}
