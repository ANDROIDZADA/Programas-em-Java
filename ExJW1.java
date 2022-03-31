//ExJW1.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ExJW1 extends JFrame
{
    ExJW1()              //metodo construtor
    {
    setTitle("Minha primeira janela em Java");   //titulo da janela
    setSize(400,200);             //largura e comprimento da janela
    setLocation(400,200);      //posicao do canto esquerdo superior
    setResizable(false);       //em execucao a janela nao  pode ser redimensionada
    getContentPane().setBackground(Color.green); //cor de fundo da janela

   }
   public static void main(String args[])
   {
        JFrame MinhaJanela = new ExJW1();   //declaracao e instanciando objeto MinhaJanela
        MinhaJanela.setVisible(true);       //mostra na tela
        }
        }