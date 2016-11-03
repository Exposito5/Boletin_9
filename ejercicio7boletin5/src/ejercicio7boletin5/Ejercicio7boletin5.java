package ejercicio7boletin5;

import javax.swing.JOptionPane;

public class Ejercicio7boletin5 {

    public static void main(String[] args) {
        
        int select;
        
        Opciones objeto = new Opciones ();
        
     
        select = Integer.parseInt(JOptionPane.showInputDialog("\n teclea 1 para circulo \n teclea 2 para cuadrado \n teclea 3 para triangulo"));
        
        switch (select){
            
            case 1 : objeto.circulo(0);
            break;
            case 2: objeto.cuadrado(0);
            break;
            case 3: objeto.triangulo(0, 0);
            break;
            
            default:
                
                System.out.println("Opción escogida no válida, seleccione una opción de las 3 posibles, gracias.");
                    
        }
        
        }
        }