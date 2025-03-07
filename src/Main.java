import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] payout = {11700, 23455, 65400, 19820, 25000};
        int i = 0;
        for (int monthlyPayout : payout) {
            i += monthlyPayout;
        }
        System.out.println("Сумма трат за месяц составила " + i + " рублей.");
        System.out.println("Задание 2");
        int minPayout = payout[0];
        int maxPayout = payout[0];
        for (int payout1 : payout) {
            if (payout1 <= maxPayout) {
                continue;
            }
            maxPayout = payout1;
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayout +
                " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayout +
                " рублей.");
        System.out.println("Задание 3");
        double average = (double) i / payout.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int n = reverseFullName.length;
        for (int a = 0; a < n / 2; a++) {
            char temp = reverseFullName[a];
            reverseFullName[a] = reverseFullName[n - a - 1];
            reverseFullName[n - a - 1] = temp;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
}

