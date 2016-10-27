package boletin_5_5;

public class Números {
    private float n1,n2,n3;
public Números (){
}
public Números (float n1,float n2,float n3){
    this.n1=n1;
    this.n2=n2;
    this.n3=n3;
}
public void CompNums (float n1,float n2,float n3){
    if(n1>n2&&n1>n3){
        System.out.println("El primer número es el mayor");}
    else if(n2>n1&&n2>n3){
        System.out.println("El segundo número es el mayor");}
    else if(n3>n1&&n3>n2){
        System.out.println("El tercer número es el mayor");}
    else if(n1==n2&&n1==n3){
        System.out.println("Todos los números tienen el mismo valor");}
}
}

