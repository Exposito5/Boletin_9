package boletin_5_7;

import javax.swing.JOptionPane;

public class Boletin_5_7 {

    public static void main(String[] args) {
        int select;
//p
        Cuadrado o = new Cuadrado();
        Circulo c = new Circulo();
        Triangulo t = new Triangulo();

      
           select = Integer.parseInt(JOptionPane.showInputDialog("\n Teclear 1 para el circulo \n Teclear 2 para el cuadrado \n Teclear 3 para el triangulo"));
           
      switch(select){
          case 1 : c.circulo(0);
          break;
          case 2 : o.cuadrado(0);
          break;
          case 3 : t.triangulo(0, 0);
          break;
          default:
              System.out.println("Exit");
      }
    } 

    }
