import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = LocalDate.now().getYear();
        printLeapYear(year);
        printWhatAppToInstall(1, year);
        printHowManyDays(60);

    }

    //Задание 1
    public static void printLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    //Задание 2
    public static void printWhatAppToInstall(int clientOS, int clientDeviceYear){
        if (clientDeviceYear >= 2015) {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        }

    }

    //Задание 3
    public static void printHowManyDays(int distance){
        if (distance > 0 && distance < 20){
            System.out.println("Потребуется дней: 1");
            return;
        }

        int days = 1;
        while (distance > 19){
            distance = distance - 40;
            days++;
        }
        System.out.println("Потребуется дней: " + days);
    }



}