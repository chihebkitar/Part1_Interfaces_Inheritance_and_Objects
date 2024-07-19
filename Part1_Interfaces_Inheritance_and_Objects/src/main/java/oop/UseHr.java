package oop;

public class UseHr {
    public static void main(String[] args) {
        HR hr = new HR();
        hr.hire(new Salaried("Fred"));
        hr.hire(new Hourly("Barney"));
        hr.hire(new Salaried());
        hr.hire(new Hourly());
        hr.printEveryBody();
        hr.payEveryBody();

    }
}
