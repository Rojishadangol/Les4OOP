class Employee {
    double baseSalary = 30000;
    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus = 10000;
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

public class Payroll {
    public static void main(String[] args) {
        Employee emp = new Manager();
        System.out.println("Manager Salary: " + emp.calculateSalary());
    }
}
