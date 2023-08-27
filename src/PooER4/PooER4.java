/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PooER4;
//ejercicio resuelto numero 4
//autor: jimena tous
import java.util.Scanner;
public class PooER4 {
     public static void main(String[] args) {
        int edmam, edana, edalber, edjuan;//edad juan
        System.out.println("ingrese la edad de juan");
        Scanner entrada = new Scanner(System.in);
        edjuan = entrada.nextInt();
        edalber = 2*(edjuan/3);//edad alberto
        edana = 4*(edjuan/3);//edad ana
        edmam = edjuan + edalber + edana;//edad mama
        System.out.println("Juan =" + edjuan);//notar que se concatena con el simbolo de + 
        System.out.println("Alberto =" + edalber);
        System.out.println("Ana =" + edana);
        System.out.println("Mama =" + edmam);
    }    
}
    


