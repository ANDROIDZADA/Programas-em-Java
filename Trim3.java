//atividade

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Trim3 extends JFrame implements ActionListener
{
JLabel l1, l2, l3;
JButton b1, b2, b3;
JTextField t1, t2, t3;

public static void main(String args[])
{
    JFrame Janela = new Trim3();
    Janela.setVisible(true);
}

Trim3()
{

    setTitle("Concatenaçao de Strings");
    setSize(400,100);
    setResizable(true);
    getContentPane().setBackground(Color.cyan);

    l1 = new JLabel("Digite seu primeiro nome: ");
    l1.setForeground(Color.red);
    l1.setFont(new Font("Arial", Font.BOLD, 15));
    l2 = new JLabel("Digite seu sobrenome: ");
    l2.setForeground(Color.blue);
    l2.setFont(new Font("Arial", Font.BOLD, 15));
    l1 = new JLabel("Seu nome completo: ");
    l1.setForeground(Color.black);
    l1.setFont(new Font("Arial", Font.BOLD, 15));

    t1 = new JTextField(20);
    t2 = new JTextField(20);
    t3 = new JTextField(20);
    t3.setEditable(false);

    b1 = new JButton("Concatenar");
    b1.addActionListener(this);
    b2 = new JButton("Limpar");
    b2.addActionListener(this);
    b3 = new JButton("Sair");
    b3.addActionListener(this);

    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

    getContentPane().add(l1); getContentPane().add(t1);
    getContentPane().add(l2); getContentPane().add(t2);
    getContentPane().add(l3); getContentPane().add(t3);
    getContentPane().add(b1); getContentPane().add(b2); getContentPane().add(b3);

 }

 public void actionPerformed(ActionEvent e)
     {

 if(e.getSource()==b3)
     System.exit(0);

 if(e.getSource()==b2)
 {
     t1.setText("  "); t2.setText("  "); t3.setText("  ");
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