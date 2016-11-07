package boletin_5_7;

import javax.swing.JOptionPane;

public class Boletin_5_7 {

    public static void main(String[] args) {
        
        int select;
        
        Figuras objeto = new Figuras ();
        
     
        select = Integer.parseInt(JOptionPane.showInputDialog("\n teclea 1 para circulo \n teclea 2 para cuadrado \n teclea 3 para triangulo"));
        
        switch (select){
            
            case 1 : objeto.circulo(0);
            break;
            case 2: objeto.cuadrado(0);
            break;
            case 3: objeto.triangulo(0, 0);
            break;
            
            default:
                
            JOptionPane.showMessageDialog(null, "Escoge otra opción que la que has cogida no es valida");
                    
        }
        
        }
        }
