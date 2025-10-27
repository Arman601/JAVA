interface Employee {
    void calculateSalary();
    void showDetails();
}

class BasicInfo {
    String name;
    int id;
    String department;

    BasicInfo(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
}

class FullTimeEmployee extends BasicInfo implements Employee {
    double monthlySalary;
    double bonus;

    FullTimeEmployee(String name, int id, String department, double monthlySalary, double bonus) {
        super(name, id, department);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        double total = monthlySalary + bonus;
        System.out.println("Full-time Salary: ₹" + total);
    }

    @Override
    public void showDetails() {
        System.out.println("Full-time Employee → " + name + " (ID: " + id + ", Dept: " + department + ")");
    }
}

class PartTimeEmployee extends BasicInfo implements Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, String department, int hoursWorked, double hourlyRate) {
        super(name, id, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {
        double total = hoursWorked * hourlyRate;
        System.out.println("Part-time Salary: ₹" + total);
    }

    @Override
    public void showDetails() {
        System.out.println("Part-time Employee → " + name + " (ID: " + id + ", Dept: " + department + ")");
    }
}

class ContractEmployee extends BasicInfo implements Employee {
    double fixedPayment;

    ContractEmployee(String name, int id, String department, double fixedPayment) {
        super(name, id, department);
        this.fixedPayment = fixedPayment;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Contract Salary: ₹" + fixedPayment);
    }

    @Override
    public void showDetails() {
        System.out.println("Contract Employee → " + name + " (ID: " + id + ", Dept: " + department + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Riya Sharma", 101, "IT", 50000, 5000);
        Employee emp2 = new PartTimeEmployee("Aman Verma", 102, "HR", 80, 200);
        Employee emp3 = new ContractEmployee("Kiran Singh", 103, "Finance", 40000);

        System.out.println("---- Employee Details ----");
        emp1.showDetails();
        emp1.calculateSalary();

        emp2.showDetails();
        emp2.calculateSalary();

        emp3.showDetails();
        emp3.calculateSalary();

        System.out.println("---------------------------");
        System.out.println("All salary calculations completed successfully ✅");
    }
}
