/*
Реализовать класс Сотрудник (Employee) c полями:
1. Имя
2. Возраст
3. Зарплата
4. Наименование департамента

Необходимо:
1. Создать список из разных сотрудников (штук 20)
2. Отсортировать список по возрастанию возраста, по убыванию зарплаты, и по наименованию отдела (в лексикографическом порядке) (вывести на консоль).
 Подумать о том, какую сортировку сделать по умолчанию (заложить в класс, интерфейс Comparable), а какие две сделать внешними (интерфейс Comparator).
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Белоусов Степан Ильич", 40, 80000, "Администрация"));
        employees.add(new Employee("Егоров Кирилл Денисович", 39, 45000, "Администрация"));
        employees.add(new Employee("Соловьев Никита Маркович", 38, 45000, "Администрация"));
        employees.add(new Employee("Широкова Ксения Денисовна", 35, 35000, "Отдел маркетинга и продаж"));
        employees.add(new Employee("Беляев Андрей Тимурович", 29, 30000, "Отдел маркетинга и продаж"));
        employees.add(new Employee("Воробьев Михаил Алексеевич", 31, 25000, "Отдел маркетинга и продаж"));
        employees.add(new Employee("Беляев Кирилл Святославович", 41, 25000, "Отдел маркетинга и продаж"));
        employees.add(new Employee("Глебова Олеся Николаевна", 20, 25000, "Отдел маркетинга и продаж"));
        employees.add(new Employee("Демидов Михаил Артёмович", 23, 25000, "Отдел маркетинга и продаж"));
        employees.add(new Employee("Казаков Роман Владиславович", 35, 35000, "ИТ-служба"));
        employees.add(new Employee("Кузьмина Ева Леонидовна", 36, 30000, "ИТ-служба"));
        employees.add(new Employee("Круглова Виктория Глебовна", 30, 25000, "ИТ-служба"));
        employees.add(new Employee("Лебедев Даниил Максимович", 19, 25000, "ИТ-служба"));
        employees.add(new Employee("Абрамова Анна Марковна", 22, 25000, "ИТ-служба"));
        employees.add(new Employee("Семенова Анастасия Артёмовна", 50, 25000, "ИТ-служба"));
        employees.add(new Employee("Александрова Кира Лукинична", 36, 22000, "Отдел кадров"));
        employees.add(new Employee("Архипова Стефания Артёмовна", 55, 22000, "Отдел кадров"));
        employees.add(new Employee("Седова Ева Николаевна", 20, 20000, "Технический сектор"));
        employees.add(new Employee("Журавлев Лев Егорович", 44, 20000, "Технический сектор"));

        System.out.println("Сортировка по возрастанию возраста:");
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - возраст: " + employee.getAge()
                    + ", зарплата: " + employee.getSalary() + ", департамент: " + employee.getDepartment());
        }

        System.out.println("\nСортировка по убыванию зарплаты:");
        employees.sort(new SalaryComparator());
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - возраст: " + employee.getAge()
                    + ", зарплата: " + employee.getSalary() + ", департамент: " + employee.getDepartment());
        }

        System.out.println("\nСортировка по наименованию департамента (в лексикографическом порядке):");
        employees.sort(new DepartmentComparator());
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - возраст: " + employee.getAge()
                    + ", зарплата: " + employee.getSalary() + ", департамент: " + employee.getDepartment());
        }
    }
}