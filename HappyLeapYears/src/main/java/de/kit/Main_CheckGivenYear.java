package de.kit;

import java.util.Scanner;

public class Main_CheckGivenYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen! Geben Sie eine Jahreszahl ein, um zu prüfen, ob es ein 'Happy Schaltjahr' ist.");
        System.out.println("Zum Beenden drücken Sie CTRL+C oder stoppen das Programm in Eclipse.");

        HappyLeapYearDetector detector = new HappyLeapYearDetector();

        while (true) {
            System.out.print("Bitte geben Sie eine Jahreszahl ein: ");
            String inputYear = scanner.nextLine();

            if (detector.isHappyLeapYear(inputYear)) {
                System.out.println(inputYear + " ist ein 'Happy Schaltjahr'!");
            } else {
                System.out.println(inputYear + " ist KEIN 'Happy Schaltjahr'.");
            }
        }
    }
}