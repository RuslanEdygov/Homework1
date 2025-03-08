import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("Задание 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " +
                fullName.toUpperCase(Locale.forLanguageTag(fullName)));
        System.out.println("Задание 3");
        String fullName1 = "Иванов Семён Семёнович";
        String s = fullName1.replace('ё', 'е');
        System.out.println(s);
    }
}

