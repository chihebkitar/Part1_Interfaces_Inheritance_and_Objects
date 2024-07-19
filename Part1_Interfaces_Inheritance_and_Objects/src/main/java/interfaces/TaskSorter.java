package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskSorter {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1,"Run away from killer",4));
        tasks.add(new Task(2,"Answer me",2));
        tasks.add(new Task(3,"Where are you from",1));
        tasks.add(new Task(4,"Have nice day",4));
        tasks.add(new Task(5,"Give me money",3));

        tasks.forEach(System.out::println);
        Collections.sort(tasks);
        // the class should implement the interface comparable
        // and override the compare to method
        // here we used alphabetical order
        //returns void
        // java class can implement more than one interface
        System.out.println(tasks);
    }
}
