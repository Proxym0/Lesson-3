package group1;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        String season; // время года

        if (month == 1 || month == 2 || month == 12) {
            season = "Зима";
            System.out.println(season);
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Весна";
            System.out.println(season);
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Лето";
            System.out.println(season);
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Осень";
            System.out.println(season);
        } else {
            season = "Вы с какой планеты?";
            System.out.println(season);}

        }
    }
