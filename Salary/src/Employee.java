import java.util.Calendar;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    // Employee sınıfının kurucu metodu
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus hesaplama metodu
    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışını hesaplayan metot
    public void raiseSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            salary *= 1.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            salary *= 1.10;
        } else {
            salary *= 1.15;
        }
    }

    // Çalışanın bilgilerini string olarak döndüren metot
    @Override
    public String toString() {
        double totalSalary = salary - tax() + bonus();
        return "Adı: " + name + "\nMaaşı: " + salary + "\nÇalışma Saati: " + workHours + "\nBaşlangıç Yılı: " + hireYear
                + "\nVergi: " + tax() + "\nBonus: " + bonus() + "\nMaaş Artışı: " + (salary - totalSalary)
                + "\nVergi ve Bonuslar ile birlikte maaş: " + totalSalary + "\nToplam Maaş: " + (totalSalary + (salary - totalSalary));
    }
}