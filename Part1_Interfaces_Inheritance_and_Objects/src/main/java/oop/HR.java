package oop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class HR {
    private List<Employee> employees = new ArrayList<>();
    //collection of employee called employees
    // list on the left (interface type ) and <Employee> is generic type
    // ArrayList on the right and diamond operator u dont have to specify
    // the type inside since java 7

    public void hire(Employee e){
        employees.add(e);
    }
    public void layoff(Employee e){
        employees.remove(e);
    }
    public void printEveryBody(){
        employees.forEach(System.out::println);
    } //  java 8 methode reference , forEach methode added to iterator
    // foreach takes consumer argument and returns void

    public void payEveryBody(){
        for (Employee e : employees){
            System.out.printf(" paying %s %s%n" ,e.getName(),
                    NumberFormat.getCurrencyInstance()
                            .format(e.getPay()));
        }
    }
}
