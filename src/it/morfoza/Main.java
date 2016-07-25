package it.morfoza;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        int result= 2+2;
        System.out.println("Hello what's your name?");
        String name;
        Scanner input=new Scanner (System.in);
        name=input.nextLine();
        System.out.println("Your name is " + name + " !!!!!!!!!!!");
        System.out.println("Your result is " + result );
        System.out.println("Goodbye");


        }
}
