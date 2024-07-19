package interfaces.defaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultMethodsDemo {
    public static void main(String[] args){
        List<Integer> nums = Stream.of(-3,1,4,-5,2,-6)
                .collect(Collectors.toList());
        System.out.println(nums);
        // removeif is default method in collection
        //returns true if any elements were removed
        boolean removed = nums.removeIf(n ->n<=0);
        // takes a predicate that returns true or false
        System.out.println("Elements were"+
                (removed ? "": "NOT")+
                " removed");
        System.out.println(nums);
        // iterator has default forEach method
        nums.forEach(System.out::println);

    }
}
