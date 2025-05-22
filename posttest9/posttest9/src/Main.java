import java.util.Scanner;

class Employee {
    public double calculateSalary() {
        return 5000000;
    }

    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 1000000;
        } else {
            return calculateSalary();
        }
    }
}

class SoftwareEngineer extends Employee {
    @Override
    public double calculateSalary() {
        return 8000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 2000000;
        } else {
            return calculateSalary();
        }
    }
}

class DataScientist extends Employee {
    @Override
    public double calculateSalary() {
        return 7500000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 1500000;
        } else {
            return calculateSalary();
        }
    }
}

class Intern extends Employee {
    @Override
    public double calculateSalary() {
        return 3000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 500000;
        } else {
            return calculateSalary();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Employee[] employees = new Employee[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Karyawan ke-" + (i + 1));
            System.out.print("Masukkan jenis (SoftwareEngineer / DataScientist / Intern): ");
            String jenis = input.nextLine();

            if (jenis.equalsIgnoreCase("SoftwareEngineer")) {
                employees[i] = new SoftwareEngineer();
            } else if (jenis.equalsIgnoreCase("DataScientist")) {
                employees[i] = new DataScientist();
            } else if (jenis.equalsIgnoreCase("Intern")) {
                employees[i] = new Intern();
            } else {
                employees[i] = new Employee();
            }
        }

        System.out.println("\nGaji dasar tiap karyawan:");
        for (Employee emp : employees) {
            System.out.println(emp.getClass().getSimpleName() + ": Rp" + emp.calculateSalary());
        }

        System.out.println("\nGaji dengan bonus:");
        for (Employee emp : employees) {
            System.out.println(emp.getClass().getSimpleName() + ": Rp" + emp.calculateSalary(true));
        }
    }
}
