//MediaFinal.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MediaFinal extends JFrame implements ActionListener
{
	JLabel L1, L2, L3, L4, L5, L6, L7, L8;
	JButton B1, B2, B3;
	JTextField TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9;

	public static void main(String args[])
	{
	JFrame Janela = new MediaFinal();
	Janela.setVisible(true);
	}

MediaFinal()
{
	getContentPane().setBackground(Color.cyan);
	setTitle("Media Final Anual");
	setSize(400, 180);
	setLocation(500, 200);

	getContentPane().setLayout(new GridLayout(5, 4));

	L1 = new JLabel("Turma: ", JLabel.CENTER);
	L2 = new JLabel("N°: ", JLabel.CENTER);
	L3 = new JLabel("NT1: ", JLabel.CENTER);
	L4 = new JLabel("NT3: ", JLabel.CENTER);
	L5 = new JLabel("Disciplina: ", JLabel.CENTER);
	L6 = new JLabel("Nome: ", JLabel.CENTER);
	L7 = new JLabel("NT2: ", JLabel.CENTER);
	L8 = new JLabel("MF: ", JLabel.CENTER);

	TF1 = new JTextField(15);
	TF2 = new JTextField(15);
	TF3 = new JTextField(15);
	TF4 = new JTextField(15);
	TF5 = new JTextField(15);
	TF6 = new JTextField(15);
	TF7 = new JTextField(15);
	TF8 = new JTextField(15);
	TF9 = new JTextField(15);

	B1 = new JButton("Calcular");
	B1.addActionListener(this);

	B2 = new JButton("Limpar");
	B2.addActionListener(this);

	B3 = new JButton("Sair");
	B3.addActionListener(this);

	getContentPane().add(L1); getContentPane().add(TF1); getContentPane().add(L5); getContentPane().add(TF5);
	getContentPane().add(L2); getContentPane().add(TF2); getContentPane().add(L6); getContentPane().add(TF6);
	getContentPane().add(L3); getContentPane().add(TF3); getContentPane().add(L7); getContentPane().add(TF7);
	getContentPane().add(L4); getContentPane().add(TF4); getContentPane().add(L8); getContentPane().add(TF8);
	getContentPane().add(TF9); getContentPane().add(B1); getContentPane().add(B2); getContentPane().add(B3);
}

public void actionPerformed(ActionEvent e)
{
	float MediaFinal = 0, Nota1 = 0, Nota2 = 0, Nota3 = 0;

	if(e.getSource()==B1)
	{
		Nota1 = Float.parseFloat(TF3.getText());
		Nota2 = Float.parseFloat(TF7.getText());
		Nota3 = Float.parseFloat(TF4.getText());

		MediaFinal = ((Nota1 * 3) + (Nota2 * 3) + (Nota3 * 4))/10;

		if (MediaFinal >= 6.0)
		{
			TF9.setText("Promovido");
		}
		else
		{
			TF9.setText("Retido");
		}
	}

	if(e.getSource()==B2)
	{
		TF1.setText(" ");
		TF2.setText(" ");
		TF3.setText(" ");
		TF4.setText(" ");
		TF5.setText(" ");
		TF6.setText(" ");
		TF7.setText(" ");
		TF8.setText(" ");
		TF9.setText(" ");
		return;
	}

	if(e.getSource()==B3)
	{
		System.exit(0);
	}

	TF8.setText(" " + MediaFinal);

}}





