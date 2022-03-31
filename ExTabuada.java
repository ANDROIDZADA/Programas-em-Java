//ExTabuada.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ExTabuada extends JFrame implements ActionListener
{
	JLabel L1;
	JTextField TF1;
	JTextArea TA1;
	JButton B1, B2, B3;

ExTabuada()
{
	setTitle("Tabuada: ");
	setSize(350,280);
	setLocation(400,150);
	setResizable(true);

	getContentPane().setBackground(Color.cyan);

	L1 = new JLabel("Digite um número inteiro: ");

	TF1 = new JTextField(10);

	B1 = new JButton("Tabuada");
	B1.addActionListener(this);

	B2 = new JButton("Limpar");
	B2.addActionListener(this);

	B3 = new JButton("Sair");
	B3.addActionListener(this);

	TA1 = new JTextArea(10,15);

	JScrollPane painel = new JScrollPane(TA1);

	getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

	getContentPane().add(L1); getContentPane().add(TF1);
	getContentPane().add(B1); getContentPane().add(B2); getContentPane().add(B3);
	getContentPane().add(painel);
	}

	public static void main(String args[])
		{
			JFrame Janela = new ExTabuada();
			Janela.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==B1)
		{
			float N, i;
			N = Float.parseFloat(TF1.getText());

			for(i = 1; i < 11; i++)
			{
				TA1.append(N + " * " + i + " = " + N * i + "\n");
			}
		}

		if (e.getSource()==B2)
		{
			TF1.setText("");
			TA1.setText("");
		}

		if (e.getSource()==B3)
		{
			System.exit(0);
		}

	}}
