package boletin_9_3;

import javax.swing.JOptionPane;


public class Boletin_9_3 {

public static void main(String[] args) {
    float a,b;
    do{ 
      b=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
    }while(b<0);
    do{
      a=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
    }while(a<0||a==b);
         
             
    Rectangulo obx = new Rectangulo();
         
    obx.calcularRectangulo(a,b);
      
    }
}
