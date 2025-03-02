import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        double[] weight1 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(weight1));
        int[] pages = {1, 3, 4, 7, 12, 15, 17, 24, 36, 41};
        System.out.println(Arrays.toString(pages));
        System.out.println("Задание 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < weight1.length; i++) {
            System.out.print(weight1[i]);
            if (i < weight1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < pages.length; i++) {
            System.out.print(pages[i]);
            if (i < pages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = weight.length - 1; i >= 0; i = i - 1) {
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weight1.length - 1; i >= 0; i = i - 1) {
            System.out.print(weight1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = pages.length-1; i >= 0; i = i - 1) {
            System.out.print(pages[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] += 1;
            }
        }
        System.out.println(Arrays.toString(weight));
    }
}

