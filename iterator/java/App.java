package Iterator;

public class App {
    public static void main(String[] args) {
        EmployeeListAggregate employeeListAggregate = new EmployeeListAggregate();

        Employee yusuf = new Employee(1, "Yusuf", "Yılmaz");
        Employee arafat = new Employee(2, "Arafat", "Önlük");
        Employee derya = new Employee(3, "Derya", "Obi");

        employeeListAggregate.add(yusuf);
        employeeListAggregate.add(arafat);
        employeeListAggregate.add(derya);

        var iterator = employeeListAggregate.createIterator();

        while (iterator.hasNext()) {
            Employee currentEmployee = iterator.getCurrentItem();
            String message = String.format("%s %s", currentEmployee.firstName, currentEmployee.lastName);
            System.out.println(message);
        }

        // output:
        //  Yusuf Yılmaz
        //  Arafat Önlük
        //  Derya Obi
    }
}
