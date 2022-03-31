//ExJW5.java(CheckBox)

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ExJW5 extends JFrame implements ItemListener
{
	JLabel L1;
	JCheckBox C1, C2;
	static int negrito = 0, italico = 0;

	public static void main(String args[])
	{
		JFrame Janela = new ExJW5();
		Janela.setVisible(true);
	}

ExJW5()
{
getContentPane().setBackground(new Color(180, 180, 180));
setTitle("ComboBox - JCheckBox");
setSize(400,150);
setLocation(50,50);
getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

L1 = new JLabel ("FITO - 2° B sistemas - Andrey Ferreira Pichuti/N°03");
L1.setForeground(Color.white);
L1.setFont(new Font("Arial",Font.PLAIN,20));

C1 = new JCheckBox("Negrito");
C1.setBackground(new Color(180, 180, 180));
C1.addItemListener(this);

C2 = new JCheckBox("Itálico");
C2.setBackground(new Color(180, 180, 180));
C2.addItemListener(this);

getContentPane().add(L1);
getContentPane().add(C1);
getContentPane().add(C2);
}

public void itemStateChanged(ItemEvent e)
{
if(e.getSource()==C1)
{
L1.setForeground(Color.green);
if(e.getStateChange()==ItemEvent.SELECTED)
	negrito = Font.BOLD;
else
	negrito = Font.PLAIN;
}
if(e.getSource()==C2)
{
L1.setForeground(Color.yellow);
if(e.getStateChange()==ItemEvent.SELECTED)
	italico = Font.ITALIC;
else
	italico = Font.PLAIN;
}
L1.setFont(new Font("Arial", negrito + italico, 20));
}}

