package Day4;

public class Employee {
    public static void main(String[] args) {


        Employee employee1 = new Employee( 123456, "Norah","Abdullah",1);
        System.out.println(employee1.toString());


    }
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return firstName + lastName;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(int salary) {
        return salary * 12;
    }

    public int raiseSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID =" + " " + id + " " + "Name = " + firstName + " " + lastName + " "+"Salary=" +" " + salary;
    }
}