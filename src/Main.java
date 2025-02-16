import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age1 = 27;
        int age2 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 +
                    " то, он совершеннолетний");
        }
        else if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 +
                    " то, он не совершеннолетний");
        }
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 +
                    " то, он совершеннолетний");
        }
        else if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 +
                    " то, он не совершеннолетний");
        }
        System.out.println("Задание 2");
        int temperatura1 = -3;
        int temperatura2 = 7;
        if (temperatura1 <= 5) {
            System.out.println("На улице " + temperatura1 + " градусов, нужно надеть шапку");
        }
        if (temperatura1 > 5) {
            System.out.println("На улице " + temperatura1 + " можно идти без шапки");
        }
        if (temperatura2 <= 5) {
            System.out.println("На улице " + temperatura2 + " градусов, нужно надеть шапку");
        }
        if (temperatura2 > 5) {
            System.out.println("На улице " + temperatura2 + " можно идти без шапки");
        }
        System.out.println("Задание 3");
        int speed1 = 55;
        int speed2 = 70;
        if (speed1 <= 60) {
            System.out.println("Если скорость " + speed1 + " то, можно ездить спокойно");
        }
        else if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + " то, придется заплатить штраф");
        }
        if (speed2 <= 5) {
            System.out.println("Если скорость " + speed2 + " то, можно ездить спокойно");
        }
        else if (speed2 > 5) {
            System.out.println("Если скорость " + speed2 + " то, придется заплатить штраф");
        }
        System.out.println("Задание 4");
        int human = 27;
        boolean age4 = human >= 2 && human <= 6;
        boolean age5 = human >= 7 && human <= 17;
        boolean age6 = human >= 18 && human <= 24;
        boolean age7 = human > 24;
        if (age4) {
            System.out.println("Если возраст человека равен " + human +
                    " то ему нужно ходить в детский сад");
        }
        if (age5) {
            System.out.println("Если возраст человека равен " + human +
                    " то ему нужно ходить в школу");
        }
        if (age6) {
            System.out.println("Если возраст человека равен " + human +
                    " то ему нужно ходить в университет");
        }
        if (age7) {
            System.out.println("Если возраст человека равен " + human +
                    " то ему пора на работу");
        }
        System.out.println("Задание 5");
        int childAge = 7;
        if (childAge <= 5) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    " ,то ему нельзя кататься на аттракционе");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    " ,то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    " ,то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задание 6");
        int passengers = 42;
        if (passengers < 60) {
            System.out.println("Есть сидячее места");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("Есть стоячие места");
        } else if (passengers > 102) {
            System.out.println("Вагон полностью забит");
        }
        System.out.println("Задание 7");
        int one = 1;
        int two = 15;
        int three = 2;
        if (one > two) {
            System.out.println(one);
        } else if (one > three) {
            System.out.println(one);
        } else {
            System.out.println(Math.max(two, three));
        }
    }
}