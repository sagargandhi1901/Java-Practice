package Day5;

public class Employee {
    //Data
    private int id;
    private String name;
    private float salary;
    private boolean isEligibleForHike;
    private char rank;

    //Parameterized constructor
    public Employee(int id, String name, float salary, boolean isEligibleForHike, char rank) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.isEligibleForHike = isEligibleForHike;
        this.rank = rank;
    }

    //Non parameterized constructor
    public Employee() {
        this.id = 0;
        this.name = null;
        this.salary = 0.0F;
        this.isEligibleForHike = false;
        this.rank = ' ';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        System.out.println(employee1.id);
        System.out.println(employee1.name);
        System.out.println(employee1.salary);
        System.out.println(employee1.isEligibleForHike);
        System.out.println(employee1.rank);

        Employee employee2 = new Employee(1, "Sagar", 50000, true, 'B');
        System.out.println(employee2.id);
        System.out.println(employee2.name);
        System.out.println(employee2.salary);
        System.out.println(employee2.isEligibleForHike);
        System.out.println(employee2.rank);
    }
}
