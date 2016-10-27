
package boletin_5_5;

import javax.swing.JOptionPane;

public class Boletin_5_5 {

    public static void main(String[] args) {
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el primer número"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo número"));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el tercer número"));
        
    Números N =new Números ();
        N.CompNums(n1, n2, n3);
    }
    
}
