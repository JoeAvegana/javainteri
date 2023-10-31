package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Реализовать класс Сотрудник (Employee) c полями:
 * 1. Имя
 * 2. Возраст
 * 3. Зарплата
 * 4. Наименование департамента
 * <p>
 * Необходимо:
 * 1. Создать список из разных сотрудников (штук 20)
 * 2. Отсортировать список по возрастанию возраста, по убыванию зарплаты, и по наименованию отдела (в лексикографическом порядке) (вывести на консоль).
 * Подумать о том, какую сортирвку сделать по умолчанию (заложить в класс, интерфейс Comparable), а какие две сделать внешними (интерфейс Comparator).
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;
    private String depName;

    public Employee(String name, int age, int salary, String depName) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.depName = depName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepName() {
        return depName;
    }

    @Override
    public int compareTo(Employee employee) {
        if (employee.getSalary() > salary) {
            return 1;
        } else if (employee.getSalary() < salary) {
            return -1;
        }
        return 0;
    }

    public String myToString() {
        return ("Имя - " + name + "\n" + " Возраст - " + age + "    Зарплата - " + salary + "\n" + " Отдел - " + depName);
    }


}


