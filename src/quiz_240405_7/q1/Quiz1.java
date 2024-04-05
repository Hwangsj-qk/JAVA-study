package quiz_240405_7.q1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 5000),
                new Employee("Bob", "Developer", 6000),
                new Employee("Charlie", "Manager", 7000),
                new Employee("David", "Manager", 8000)
        );

        long sum = employees.stream()
                .collect(Collectors.summarizingInt(Employee::salary))
                .getSum();
        System.out.println("총 급여: " + sum);

        double developer = employees.stream()
                .filter(employee -> employee.role().equals("Developer"))
                .collect(Collectors.summarizingInt(Employee::salary))
                .getAverage();
        System.out.println("Developer 평균 급여: " + developer);

        double manager = employees.stream()
                .filter(employee -> employee.role().equals("Manager"))
                .collect(Collectors.summarizingInt(Employee::salary))
                .getAverage();
        System.out.println("Manager 평균 급여: " + manager);


    }
    record Employee(String name, String role, int salary) {}
}
