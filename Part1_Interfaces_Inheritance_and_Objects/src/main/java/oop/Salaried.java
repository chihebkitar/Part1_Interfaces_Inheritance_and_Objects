package oop;

public class Salaried extends Employee{
    public static final double DEFAULT_SALARY = 120000;
    private double salary = DEFAULT_SALARY;

    public Salaried(){}
    // will call super() by default
    public Salaried(String name){
        this(name,DEFAULT_SALARY);
    }
    public Salaried(String name,double salary){
        super(name); // invokes the one argument constructor in the parent class
        this.salary = salary; // this() different than super()
        // we cant use them both inside the same constructor
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary/24;
    }
    // we need to implement this method because our class
    // inherits the abstract employee class that hase an abs methode
}   // salaries been paid twice a month in this example
