package boletin_9_1;

import javax.swing.JOptionPane;

public class Boletin_9_1 {

    public static void main(String[] args) {
        float num;
        int i = 0;
        while(i<10){
        num=Float.parseFloat(JOptionPane.showInputDialog("Inserte los 10 números"));
        i++;}
        
        
        N10 obx = new N10();
        
        obx.calcularCant(num);
        
    }
    
}
