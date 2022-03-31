//ExJW4.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class ExJW4 extends JFrame implements ListSelectionListener, ActionListener
	{
	    JLabel L1;
	    JTextField T1;
	    JList lista;
	    JButton Bquant, Bindice, Blimpar;
	    DefaultListModel listModel;

      public static void main(String args[])
      {
      	JFrame Janela = new ExJW4();
      	Janela.setVisible(true);
      	 }

     ExJW4()
     {
     setTitle("JListbox - Cursos FITO");
     setSize(200,250);
     setLocation(300,100);

     T1 = new JTextField();
     T1.addActionListener(this);

     L1 = new JLabel("Sem seleção: ");
     L1.setForeground(Color.black);

     Bquant = new JButton("Quantidade de itens: ");
     Bquant.addActionListener(this);

     Bindice = new JButton("Índice selecionado: ");
     Bindice.addActionListener(this);

     Blimpar = new JButton("Remover item: ");
     Blimpar.addActionListener(this);

     listModel = new DefaultListModel();

     listModel.addElement("Ensino Médio Básico");
     listModel.addElement("Técnico em Adiministração");
     listModel.addElement("Técnico em Construção Civil");
     listModel.addElement("Técnico em Desenvolvimento de Sistemas");
     listModel.addElement("Técnico em Internet");

     lista = new JList(listModel);
     lista.addListSelectionListener(this); // registra a lista

     JScrollPane painel = new JScrollPane(lista);

     getContentPane().setLayout(new GridLayout(6,1));
     getContentPane().add(L1);
     getContentPane().add(T1);
     getContentPane().add(painel);
     getContentPane().add(Bquant);
     getContentPane().add(Bindice);
     getContentPane().add(Blimpar);
     }

    	     public void actionPerformed(ActionEvent e)
    	     {
    	        if(e.getSource()==T1)
    	        {
    	        listModel.addElement(T1.getText()); // Adiciona itens a lista
    	            T1.setText(" ");
    	            }
    	        if(e.getSource()==Bquant)
    	            T1.setText("Quantidade: " + listModel.getSize()); // Mostra a quantidade de itens da lista
    	        if(e.getSource()==Bindice)
    	            T1.setText("Índice Selecionado: " + lista.getSelectedIndex()); // Mostra a posição do item selecionado
    	        if(e.getSource()==Blimpar)
    	        {
    	            T1.setText("Removido: " + lista.getSelectedValue()); // Remove o item selecionado da lista
    	             listModel.remove(lista.getSelectedIndex());
    	             }
    	        }

    public void valueChanged (ListSelectionEvent e)
    {
    L1.setText("Selecionado: " + lista.getSelectedValue());
    }
   }