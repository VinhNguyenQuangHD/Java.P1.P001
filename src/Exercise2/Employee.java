package Exercise2;

public class Employee {
    private String FirstName;
    private String LastName;
    private double Salary;

    public Employee(String firstName, String lastName, double salary) {
        FirstName = firstName;
        LastName = lastName;
        Salary = salary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getSalary() {
        if(Salary < 0){
            return 0;
        }
        else {
            return Salary;
        }
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
