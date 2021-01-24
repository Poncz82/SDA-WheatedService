package WeatherServiceApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aplikacja jest uruchomiona!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Witaj w elektronicznym pamiętniku, co chcesz zrobić?");
            System.out.println("1. Dodać nową lokalizacją");
            System.out.println("2. Odczytać istniejące wpisy");
            System.out.println("3. Zamknąć aplikację");

            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    System.out.println("nr 1");
                    break;
                case 2:
                    System.out.println("nr 2");
                    break;
                case 3:
                    System.out.println("Bye :P");
                    return;
            }
        }
    }
}