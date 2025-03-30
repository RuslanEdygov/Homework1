public class EmployeeBook {
    private Employee[] employees;


    public EmployeeBook(int capacity) {
        this.employees = new Employee[capacity];
    }


    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }


    public void printAllEmployees() {
        System.out.println("\033[33mСписок сотрудников:\033[0m");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        System.out.println();
    }


    public void calculateTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        System.out.println("\03 3[34mОбщая сумма затрат на зарплаты: " + totalSalary + " руб.\033[0m");
        System.out.println();  // Пустая строка после вывода суммы (один пробел)
    }


    public void printEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                System.out.println("\033[34mНайден сотрудник с ID = " + id + ":\033[0m");
                System.out.println(employee);
                System.out.println();
                return;
            }
        }
        System.out.println("\033[31mСотрудник с ID = " + id + " не найден.\033[0m");
        System.out.println();
    }


    public boolean removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                System.out.println("\033[32mСотрудник " + employees[i].getName() + " удален.\033[0m");
                employees[i] = null;
                System.out.println();
                return true;
            }
        }
        System.out.println("\033[31mСотрудник с ID " + id + " не найден.\033[0m");
        System.out.println();
        return false;
    }


    public void printEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }

        if (minSalaryEmployee != null) {
            System.out.println("\033[34mСотрудник с минимальной зарплатой:\033[0m");
            System.out.println(minSalaryEmployee);  // Вызов метода toString()
        } else {
            System.out.println("\033[31mНет сотрудников в системе.\033[0m");
        }
        System.out.println();
    }


    public void printEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }

        if (maxSalaryEmployee != null) {
            System.out.println("\033[34mСотрудник с максимальной зарплатой:\033[0m");
            System.out.println(maxSalaryEmployee);  // Вызов метода toString()
        } else {
            System.out.println("\033[31mНет сотрудников в системе.\033[0m");
        }
        System.out.println();
    }


    public void printAverageSalary() {
        double totalSalary = 0;
        int employeeCount = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
                employeeCount++;
            }
        }

        if (employeeCount > 0) {
            double averageSalary = totalSalary / employeeCount;
            System.out.println("\033[34mСредняя зарплата: " + averageSalary + " руб.\033[0m");
        } else {
            System.out.println("\033[31mНет сотрудников в системе.\033[0m");
        }
    }
}

