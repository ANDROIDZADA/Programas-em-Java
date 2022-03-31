//ExJW10.java (Input Dialog)
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExJW10 extends JFrame implements ActionListener
{
	JLabel L1;
	JButton B1;

	public static void main(String args[])
	{
		JFrame Janela = new ExJW10();
		Janela.setVisible(true);
	}

ExJW10()
{
	setBackground(new Color(100, 100, 100));
	setTitle("Caixa de Entrada");
	setSize(400, 180);

	getContentPane().setLayout(new GridLayout(2, 1));
	L1 = new JLabel(" ", JLabel.CENTER);
	L1.setForeground(Color.blue);

	B1 = new JButton("Login");
	B1.addActionListener(this);
	B1.setToolTipText("Clique aqui para entrar no sistema");
	B1.setMnemonic(KeyEvent.VK_L);
	getContentPane().add(B1);
	getContentPane().add(L1);
}

public void actionPerformed(ActionEvent e)
{
	String resp = JOptionPane.showInputDialog(null, "Qual seu nome?", "Login no sistema", JOptionPane.QUESTION_MESSAGE);

	if(resp == null || resp.equals(""))
	L1.setText("Favor digitar campo");
	else
	L1.setText("Seja bem-vindo " + resp + "!");
}
}