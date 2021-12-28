package homeworks.classes.employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int years;
    double tax;
    int bonus;
    double raise;
    double totalSalary;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.years = 2021 - this.hireYear;
        this.tax = tax();
        this.bonus = bonus();
        this.raise = raiseSalary();
        this.totalSalary = this.salary - this.tax + this.bonus + this.raise;
    }

    public double tax() {
        if (this.salary < 1000) {
            return this.salary;
        }

        return this.salary * 0.03;
    }

    public int bonus() {
        if (this.workHours >= 40) {
            int bonus = (this.workHours - 40) * 30;
            return bonus;
        }

        return 0;
    }

    public double raiseSalary() {

        if (this.years > 19) {
            this.raise = this.salary * 0.15;
        } else if (years >= 9 && years <= 19) {
            this.raise = this.salary * 0.10;
        } else {
            this.raise = this.salary * 0.05;
        }

        return this.raise;
    }

    @Override
    public String toString() {
        return "name='" + this.name + '\'' +
               ",\n salary=" + this.salary +
               ",\n workHours=" + this.workHours +
               ",\n hireYear=" + this.hireYear +
               ",\n tax=" + this.tax +
               ",\n bonus=" + this.bonus +
               ",\n raise=" + this.raise +
               ",\n salary with tax and bonuses=" + (this.salary - this.tax + this.bonus) +
               ",\n totalSalary=" + this.totalSalary
               ;
    }
}
