package boletin_5_7;

import javax.swing.JOptionPane;

public class Figuras {
    private int lado,base,altura,radio,triangulo,cuadrado,circulo,select;
    private final double pi=3.14;
       
    public Figuras(){           
    }   
    public Figuras(int lado,int base,int altura,int radio){
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
       
    }
    public void cuadrado(int lado){
        lado = Integer.parseInt(JOptionPane.showInputDialog(" Teclea el lado"));
        JOptionPane.showMessageDialog(null,"El área del cuadrado es " +Math.pow(lado,2));
    }
    
    public void circulo (int radio){
        radio = Integer.parseInt(JOptionPane.showInputDialog(" Teclea el radio "));
        JOptionPane.showMessageDialog(null," el area de la circunferencia es "+ pi*Math.pow(radio,2));
    }
    
    
    public void triangulo(int base,int altura){
        base = Integer.parseInt(JOptionPane.showInputDialog(" Teclea la base "));
        altura = Integer.parseInt(JOptionPane.showInputDialog(" Teclea la altura " ));
        JOptionPane.showMessageDialog(null," El área del triangulo es "+ (base*altura)/2);
        
    }
       }
