//MediaFinal

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MF extends JFrame implements ActionListener
{
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JButton b1, b2, b3;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;


        public static void main(String args[])
        {
            JFrame Janela = new MF();
           	Janela.setVisible(true);
        }

        MF()
        {
            setTitle("Media Final Anual");
            setSize(400, 180);
            setLocation(500, 200);
            setResizable(true);
            getContentPane().setLayout(new GridLayout(5, 4));
            getContentPane().setBackground(Color.cyan);

            l1 = new JLabel("Turma");
            l2 = new JLabel("N°: ");
            l3 = new JLabel("NT1");
            l4 = new JLabel("NT2");
            l5 = new JLabel("NT3");
            l6 = new JLabel("MF");
            l7 = new JLabel("Nome");
            l8 = new JLabel("Disciplina");

            b1 = new JButton("Sair");
            b1.addActionListener(this);

            b2 = new JButton("Limpar");
            b2.addActionListener(this);

            b3 = new JButton("Calcular");
			b3.addActionListener(this);

            t1 = new JTextField(30);
            t2 = new JTextField(30);
            t3 = new JTextField(30);
            t4 = new JTextField(30);
            t5 = new JTextField(30);
            t6 = new JTextField(30);
            t7 = new JTextField(30);
            t8 = new JTextField(30);
            t9 = new JTextField(30);

            getContentPane().add(l1);getContentPane().add(t1);getContentPane().add(l8);getContentPane().add(t2);
            getContentPane().add(l2);getContentPane().add(t3);getContentPane().add(l7);getContentPane().add(t4);
            getContentPane().add(l3);getContentPane().add(t5);getContentPane().add(l4);getContentPane().add(t6);
            getContentPane().add(l5);getContentPane().add(t7);getContentPane().add(l6);getContentPane().add(t8);
            getContentPane().add(t9);getContentPane().add(b1);getContentPane().add(b2);getContentPane().add(b3);

        }

        public void actionPerformed(ActionEvent e)
        {
            float Mf = 0, Nota1 = 0, Nota2 = 0, Nota3 = 0;

		if(e.getSource()==b2)
        {
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
            t4.setText(" ");
            t5.setText(" ");
            t6.setText(" ");
            t7.setText(" ");
            t8.setText(" ");
            t9.setText(" ");
            return;
        }

        if(e.getSource()==b1)
        {
        System.exit(0);
    	}

            if(e.getSource()==b3)
            {
                Nota1 = Float.parseFloat(t5.getText());
                Nota2 = Float.parseFloat(t6.getText());
                Nota3 = Float.parseFloat(t7.getText());

                Mf = ((Nota1 * 3) + (Nota2 * 3) + (Nota3 * 4))/10;

                if (Mf >= 6.0)
                {
                    t9.setText("Promovido");
                }
                else
                {
                    t9.setText("Retido");
                }
    }
    t8.setText(" " + Mf);
}}