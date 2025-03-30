public class Main {
    public static void main(String[] args) {

        // Создаем несколько сотрудников
        Employee employee1 = new Employee(1, "Дмитрий Ершов",
                "Менеджер", 50000);
        Employee employee2 = new Employee(2, "Мария Петрова",
                "Разработчик", 70000);
        Employee employee3 = new Employee(3, "Сергей Николаевич",
                "Team Lead", 270000);
        Employee employee4 = new Employee(4, "Анна Кузнецова",
                "Бухгалтер", 77000);
        Employee employee5 = new Employee(5, "Михаил Шопин",
                "Главный специалист", 37000);
        Employee employee6 = new Employee(6, "Яна Горбунова",
                "Заместитель начальника", 57000);
        Employee employee7 = new Employee(7, "Антон Переродов",
                "Заместитель бухгалтера", 77000);
        Employee employee8 = new Employee(8, "Андрей Завьялов",
                "Ведущий специалист бухгалтерии", 43000);
        Employee employee9 = new Employee(9, "Александр Тоичкин",
                "Ген. директор", 77000);
        Employee employee10 = new Employee(10, "Анжела Смирнова",
                "Зам. ген. директора", 77000);


        // Создаем книгу сотрудников с вместимостью 5
        EmployeeBook employeeBook = new EmployeeBook(9);

        // Добавляем сотрудников в книгу
        employeeBook.addEmployee(employee1);
        employeeBook.addEmployee(employee2);
        employeeBook.addEmployee(employee3);
        employeeBook.addEmployee(employee4);
        employeeBook.addEmployee(employee5);
        employeeBook.addEmployee(employee6);
        employeeBook.addEmployee(employee7);
        employeeBook.addEmployee(employee8);
        employeeBook.addEmployee(employee9);
        employeeBook.addEmployee(employee10);

        // Выводим всех сотрудников
        employeeBook.printAllEmployees();

        // Выводим сумму затрат на ФОТ
        employeeBook.calculateTotalSalary();

        // Ищем и выводим сотрудника с ID = 2
        employeeBook.printEmployeeById(2);

        // Удаляем сотрудника с ID = 2 (Мария)
        employeeBook.removeEmployee(2);

        // Выводим всех сотрудников после удаления
        employeeBook.printAllEmployees();

        // Пробуем удалить несуществующего сотрудника с ID = 10
        employeeBook.removeEmployee(10);

        // Выводим сумму затрат на ФОТ
        employeeBook.calculateTotalSalary();

        // Вызов метода для вывода сотрудника с минимальной зарплатой
        employeeBook.printEmployeeWithMinSalary();

        // Вызов метода для вывода сотрудника с минимальной зарплатой
        employeeBook.printEmployeeWithMaxSalary();

        // Вызов метода для вывода средней зарплаты
        employeeBook.printAverageSalary();
    }
}
