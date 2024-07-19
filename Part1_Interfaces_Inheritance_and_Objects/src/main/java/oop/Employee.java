package oop;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee {
    // cannot be instanced
    public static final String DEFAULT_NAME= "UNKNOWN"; // constant
    public static int nextId; // static attribute : class attribute

    private Integer id;
    private String name;
    private LocalDate hireDate;

    public Employee() {
        this(DEFAULT_NAME); //invokes one argument constructor below
    }
    public Employee(String name){
        id = nextId++;
        this.name= name;
        hireDate = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    public abstract double getPay();
    //each type of emp hase a formula for his salary
// if u have abst methode then the class should be abs
    // but the not for the opposite case
    @Override
    public String toString() {
        return MessageFormat.format("Employee'{'id={0}, name=''{1}'', hireDate={2}'}'", id, name, hireDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(hireDate, employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hireDate);
    }
}
