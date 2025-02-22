public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задание 2");
        for (int a = 10; a >= 1; a = a - 1) {
            System.out.println(a);
        }
        System.out.println("Задание 3");
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }
        System.out.println("Задание 4");
        for (int c = 10; c >= -10; c = c - 1) {
            System.out.println(c);
        }
        System.out.println("Задание 5");
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным");
        }
        System.out.println("Задание 6");
        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }
        System.out.println("Задание 7");
        for (int g = 1; g <= 512; g = g * 2) {
            System.out.println(g);
        }
        System.out.println("Задание 8");
        int savings = 29000;
        int total = 0;
        for (int h = 1; h <= 12; h++) {
            total = total + savings;
            System.out.println("Месяц " + h + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание 9");
        int savings1 = 29000;
        int total1 = 0;
        for (int h = 1; h < 12; h++) {
            total1 = total1 + total1/100;
            total1 = total1 + savings1;
            System.out.println("Месяц " + h + " сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println("Задание 10");
        int number = 2;
        for (int j = 1; j <= 10; j++) {
            System.out.println(number + "*" + j + "=" + number*j);
        }
    }
}