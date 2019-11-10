package ej5;
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n,cifras;
       System.out.println("Escriba un número entre el 0 y 9999");
       n=sc.nextInt();
       if(n<0 || n>9999){
           System.out.println("Se excedió del rango");
       } else{
           cifras=Integer.toString(n).length();
           System.out.println("El número "+n+" tiene "+cifras+" cifras");
       }
    }
}
