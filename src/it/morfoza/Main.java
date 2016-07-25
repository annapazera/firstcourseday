package it.morfoza;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

//        int result= 2+2;
        System.out.println("Hello what's your name?");

        Scanner input=new Scanner (System.in);
       String name=input.nextLine();

        System.out.println("Podaj pierwszą liczbę");
        int liczba1;
        int liczba2;
        liczba1=input.nextInt();
        System.out.println("Podaj drugą liczbę");
        liczba2=input.nextInt();
        int wynik= liczba1+liczba2;


        System.out.println(name +", suma Twoich liczb to " + wynik + " !!!!!!!!!!!");
//        System.out.println(name + ", your result is " + result );
//        System.out.println("Goodbye");


        }
}
