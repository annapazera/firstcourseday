package it.morfoza;
import java.util.Scanner;
public class CalculatorConsole {

    public static void runOnSpark2(String[] args){

//        int result= 2+2;
        System.out.println("Hello, Jakie działanie chcesz wykonać: +,-, *,/?");

        Scanner input=new Scanner (System.in);
       String dzialanie=input.nextLine();

        System.out.println("Podaj pierwszą liczbę");
        int liczba1;
        int liczba2;

        liczba1=input.nextInt();
        System.out.println("Podaj drugą liczbę");
        liczba2=input.nextInt();

        int wynik = liczba1 + liczba2;
        int wynik1=liczba1-liczba2;
        int wynik2=liczba1*liczba2;
        int wynik3=liczba1/liczba2;

        switch (dzialanie){
            case "+":
                System.out.println("Wynik dodawania  Twoich liczb to " + wynik + " !!!!!!!!!!!");
                break;
            case "-":
                System.out.println("Wynik odjmowania Twoich liczb to " + wynik1 + " !!!!!!!!!!!");
                break;
            case "*":
                System.out.println("Wynik mnożenia Twoich liczb to " + wynik2 + " !!!!!!!!!!!");
                break;
            case "/":
                System.out.println("Wynik dzielenia Twoich liczb to " + wynik3 + " !!!!!!!!!!!");
                break;
            default:

                System.out.println("Nie mogę nic dla Ciebie zrobić  !!!!!!!!!!!");


//        if (dzialanie.equals("dodawanie")) {
//
//            System.out.println("Wynik dodawania  Twoich liczb to " + wynik + " !!!!!!!!!!!");
//        }
//        if (dzialanie.equals("odjmowanie")){
//            int wynik2=liczba1-liczba2;
//            System.out.println("Wynik odjmowania Twoich liczb to " + wynik1 + " !!!!!!!!!!!");
        }

//        System.out.println(name + ", your result is " + result );
//        System.out.println("Goodbye");


        }

    public static void runOnConsole(String[] args) {
    }
}
