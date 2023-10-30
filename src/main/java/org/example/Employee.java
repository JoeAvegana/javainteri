package org.example;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Реализовать класс Сотрудник (Employee) c полями:
 * 1. Имя
 * 2. Возраст
 * 3. Зарплата
 * 4. Наименование департамента
 *
 * Необходимо:
 * 1. Создать список из разных сотрудников (штук 20)
 * 2. Отсортировать список по возрастанию возраста, по убыванию зарплаты, и по наименованию отдела (в лексикографическом порядке) (вывести на консоль).
 * Подумать о том, какую сортирвку сделать по умолчанию (заложить в класс, интерфейс Comparable), а какие две сделать внешними (интерфейс Comparator).
 */
public class Employee {
    private String name;
    private int age;
    private int salary;
    private String depName;
    public Employee(String name, int age, int salary, String depName){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.depName = depName;
    }
    public String getName(String name){
        return this.name;
    }
    public int getAge(String age){
        return this.age;
    }
    public int getSalary(int salary){
        return this.salary;
    }
    public String getDepName(String depName){
        return this.depName;
    }
    Set<Employee> worker = new TreeSet<>();
    worker.add(new Employee("Василий", 20, 30000, "Office"));
}
