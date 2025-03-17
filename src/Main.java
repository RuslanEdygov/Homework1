import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2021;
        verificationYear(year);
        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2016;
        downloadApp(clientOS, clientDeviceYear);
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        homeDeliveryCards(deliveryDistance, deliveryDays);
    }

    public static void verificationYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " указанный год високосный");
        } else {
            System.out.println(year + " указанный год не високосный");
        }
    }

    public static void downloadApp(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void homeDeliveryCards(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}


