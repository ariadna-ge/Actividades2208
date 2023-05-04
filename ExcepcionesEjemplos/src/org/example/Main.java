package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int a = 10;
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("División:  " + + (a/b));
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("No se puede dividir entre cero");
        } catch (NumberFormatException nfe){
            System.out.println("No capturaste el dato correctamente");
        } finally {
            System.out.println("Siempre se va a ejecutar....");
        }
        System.out.println("------FIN DEL PROGRMA ----------");

    }
}