//ConcaString.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ConcaString extends JFrame implements ActionListener
{
	JLabel L1, L2, L3;
	JTextField TF1, TF2, TF3;
	JButton B1, B2, B3;

ConcaString()											// Método Construtor
{
	setTitle("Concatenação de String");					// Título da janela
	setSize(300, 200);									// Tamanho da janela
	setLocation(400, 150);								// Localização da janela
	setResizable(true);									// Redimensão da janela, neste caso, ativada(true)

	getContentPane().setBackground(Color.cyan);		// Definido a cor do fundo como amarelo

	L1 = new JLabel("Digite uma palavra: ");
	L2 = new JLabel("Digite outra palavra: ");
	L3 = new JLabel("As 2 palavras concatenadas: ");

	TF1 = new JTextField(35);

	TF2 = new JTextField(35);

	TF3 = new JTextField(35);

	B1 = new JButton("Concatenar");
	B1.addActionListener(this);

	B2 = new JButton("Limpar");
	B2.addActionListener(this);

	B3 = new JButton("Sair");
	B3.addActionListener(this);

	getContentPane().setLayout(new GridLayout(3,3));

	getContentPane().add(L1); getContentPane().add(TF1); getContentPane().add(B1);
	getContentPane().add(L2); getContentPane().add(TF2); getContentPane().add(B2);
	getContentPane().add(L3); getContentPane().add(TF3); getContentPane().add(B3);
}

public static void main(String args[]) 					// Método Principal - Tornando o App executável
{
	JFrame JanelaApp = new ConcaString();
	JanelaApp.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{

if(e.getSource()==B3)
	System.exit(0);

if(e.getSource()==B2)
{
	TF1.setText("  ");
	TF2.setText("  ");
	TF3.setText("  ");
	return;
}
if(e.getSource()==B1)
	{
	String P1, P2, PC;
	P1 = TF1.getText();
	P2 = TF2.getText();
	PC = P1 + " " + P2;
	TF3.setText("" + PC);
	}
}
}
