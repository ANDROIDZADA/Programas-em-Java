//atividade

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class StringKao extends JFrame implements ActionListener
{
JLabel l1, l2, l3;
JButton b1, b2, b3;
JTextField t1, t2, t3;

StringKao()
{

    setTitle("Concatenaçao de Strings");
    setSize(300,200);
    setLocation(400,150);
    setResizable(true);

    getContentPane().setBackground(Color.cyan);
    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

    l1 = new JLabel("Digite seu primeiro nome: ");

    l2 = new JLabel("Digite seu sobrenome: ");

    l1 = new JLabel("Seu nome completo: ");

    t1 = new JTextField(40);
    t2 = new JTextField(40);
    t3 = new JTextField(40);


    b1 = new JButton("Concatenar");
    b1.addActionListener(this);
    b2 = new JButton("Limpar");
    b2.addActionListener(this);
    b3 = new JButton("Sair");
    b3.addActionListener(this);



    getContentPane().add(l1); getContentPane().add(t1);
    getContentPane().add(l2); getContentPane().add(t2);
    getContentPane().add(l3); getContentPane().add(t3);
    getContentPane().add(b1);
    getContentPane().add(b2);
    getContentPane().add(b3);
}

public static void main(String args[])
{
	JFrame Janela = new StringKao();
	Janela.setVisible(true);
}

 public void actionPerformed(ActionEvent e)
     {

 if(e.getSource()==b3)
     System.exit(0);

 if(e.getSource()==b2)
 {
     t1.setText("  ");
     t2.setText("  ");
     t3.setText("  ");
     return;
 }
 if(e.getSource()==b1)
     {
     String P1, P2, PC;
     P1 = t1.getText();
     P2 = t2.getText();
     PC = P1 + " " + P2;
     t3.setText("" + PC);
     }
 }
}







































































































































































































































































































































































