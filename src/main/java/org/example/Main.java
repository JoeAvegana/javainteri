package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Employee> worker = new TreeSet<>();

        worker.add(new Employee("Женя", 55, 30000, "Hall"));
        worker.add(new Employee("Катя", 44, 40000, "Hall1"));
        worker.add(new Employee("Петр", 33, 500000, "Hall2"));
        worker.add(new Employee("Степан", 37, 60000, "Office1"));
        worker.add(new Employee("Федор", 24, 70500, "Office2"));
        worker.add(new Employee("Алексей", 43, 80000, "Office3"));
        worker.add(new Employee("Василий", 22, 90000, "MainOffice"));
        worker.add(new Employee("Иннокентий", 56, 10000, "MainOffice2"));
        worker.add(new Employee("Григорий", 28, 32000, "Office4"));
        worker.add(new Employee("Геннадий", 31, 390000, "MainOffice3"));
        worker.add(new Employee("Василиса", 54, 34000, "Office5"));
        worker.add(new Employee("Зинаида", 23, 39000, "Office6"));
        worker.add(new Employee("Олег", 43, 300400, "Office7"));
        worker.add(new Employee("Альберт", 21, 3040000, "MainOffice4"));
        worker.add(new Employee("Линар", 34, 3002500, "MainOffice33"));
        worker.add(new Employee("Марат", 70, 3006070, "MainOffice22"));
        worker.add(new Employee("Галина", 45, 30200200, "MainOffice44"));
        worker.add(new Employee("Полина", 20, 3000500, "MainOffice52"));
        worker.add(new Employee("Гоша", 40, 39990, "Office23"));
        worker.add(new Employee("Вася", 36, 30450, "Hall68"));
        Set<Employee> workerSortedByDepName = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getDepName().compareTo(o2.getDepName());
            }
        });
        Set<Employee> workerSortedByAge = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        workerSortedByDepName.addAll(worker);
        workerSortedByAge.addAll(worker);
        for (Employee iter : worker) {
            System.out.println(iter.myToString() + "\n" + "\n");
        }
        /**    Отсортированный по наименованию отдела вывод
         for (Employee iter2 : workerSortedByDepName) {
         System.out.println(iter2.myToString() + "\n" + "\n");
         }
         */
        /**     Отсортированный по возрасту вывод
         * for (Employee iter1 : workerSortedByAge) {
         *             System.out.println(iter1.myToString() + "\n" + "\n");
         *         }
         */
    }
}


