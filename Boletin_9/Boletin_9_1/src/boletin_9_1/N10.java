package boletin_9_1;

import javax.swing.JOptionPane;

public class N10 {
int neg=0;
int pos=0;
int neu=0;
float num;

public N10(){
}

public N10(int ne, int p, int o, float n){
    neg = ne;
    pos = p;
    neu = o;
    num = n;
}

public void calcularCant(float num){
    
    for (int i=0;i<10;i++){
           if(num<0){
               neg++;}
           
           else if(num>0){
                pos++;}
           else{
               neu++;}
        }
    System.out.println("Hay "+neg+" números negativos");
    System.out.println("Hay "+pos+" números positivos");
    System.out.println("Hay "+neu+" ceros");
    }
}