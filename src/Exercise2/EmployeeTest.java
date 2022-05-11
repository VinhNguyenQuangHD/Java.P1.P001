package Exercise2;

public class EmployeeTest {
    public static void main(String [] args){
        Employee emp = new Employee("Anp1","Anp2",46.559);
        Employee emp2 = new Employee("Anp1","Anp2",77.989);
        System.out.println("Emp1 salary: " + emp.getSalary());
        System.out.println("Emp2 salary: " + emp2.getSalary());
        double new_salary_emp1 = emp.getSalary() + (emp.getSalary()*0.1);
        double new_salary_emp2 = emp2.getSalary() + (emp2.getSalary()*0.1);
        System.out.println("Emp1 new salary: " + new_salary_emp1);
        System.out.println("Emp2 new salary: " + new_salary_emp2);
    }
}
