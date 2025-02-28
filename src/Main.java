public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int h = 1;
        while (total < 2459000) {
            total = total + salary;
            System.out.println("Месяц " + h + " сумма накоплений равна " + total + " рублей");
            h = h + 1;
        }
        System.out.println("Задание 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a = a + 1;
        }
        System.out.println();
        for (int b = 10; b >= 1; b = b - 1) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int population = 12000000;
        int birthRate = 17;
        int mortalityRate = 8;
        for (int c = 1; c < 10; c++) {
            population = (((population / 1000) * birthRate) - (population / 1000) * mortalityRate) + (population);
            System.out.println("Месяц " + c + " численность населения составляет " + population);
        }
        System.out.println("Задание 4");
        int savings = 0;
        int contribution = 15000;
        int l = 1;
        while (contribution < 12000000) {
            contribution = contribution + savings;
            System.out.println("Месяц " + l + " сумма накоплений равна " + contribution +
                    " рублей");
            l++;
            contribution = contribution + contribution / 100 * 7;
        }
        System.out.println("Задание 5");
        int savings1 = 0;
        int contribution1 = 15000;
        int n = 1;
        while (contribution1 < 12000000) {
            n++;
            {
                contribution1 = (contribution1 + contribution1 / 100 * 7);
                contribution1 = contribution1 + savings1;
                if (n % 6 == 0) {
                    System.out.println("Месяц " + n + " сумма накоплений равна " + contribution1 +
                            " рублей");
                }
            }
        }
        System.out.println("Задание 6");
        int savings2 = 0;
        int contribution2 = 15000;
        int k = 1;
        while (k < 108) {
            k++;
            {
                contribution2 = (contribution2 + contribution2 / 100 * 7);
                contribution2 = contribution2 + savings2;
                if (k % 6 == 0) {
                    System.out.println("Месяц " + k + " сумма накоплений равна " + contribution2 +
                            " рублей");
                }
            }
        }
        System.out.println("Задание 7");
        int p = 1;
        while (p <= 31) {
            p++;
            {
                if (p % 7 == 0) {
                    System.out.println("Сегодня пятница " + p + " число. Необходимо подготовить отчет");
                }
            }
        }
        System.out.println("Задание 8");
        int yearFly = 2025 - 200;
        int yearNext = 2025 + 100;
        for (int year = yearFly; year < yearNext; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}

