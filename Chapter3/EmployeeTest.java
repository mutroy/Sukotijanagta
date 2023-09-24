package Chapter3;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("NARPAVI", "AMMA", 30000);
        Employee emp2 = new Employee("NIRVITA", "PAPA", 21000);

        System.out.printf("Yearly salary of %s %s is %.2f", emp1.getFirstName(), emp1.getLastName(), (emp1.getMonthlySalary() * 12));
        System.out.printf("%n%nYearly salary of %s %s is %.2f", emp2.getFirstName(), emp2.getLastName(), (emp2.getMonthlySalary() * 12));

        System.out.printf("%n%nRaised Yearly salary of %s %s is %.2f", emp1.getFirstName(), emp1.getLastName(), (emp1.raiseSalary() * 12));
        System.out.printf("%n%nYRaised early salary of %s %s is %.2f", emp2.getFirstName(), emp2.getLastName(), (emp2.raiseSalary() * 12));


    }
}
