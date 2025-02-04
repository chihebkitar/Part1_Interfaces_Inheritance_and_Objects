package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arithmetic {
    public static void main(String[] args) {
        int x = 3;
        int y = 0;
        double z = 0;
        try {
            z = x / y;
        } catch (ArithmeticException e){
            System.err.println(e);
        }
        System.out.printf("x= %d, y= %d, z= %s%n",x,y,z);

        try {
            Arithmetic.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            // the error should be not related by inheritance to collapse
            throw new RuntimeException(e);
        } finally {
            System.out.println("this gets called in any case");
        }
        // finally block always execute


      Path dir =  Paths.get("src", "main","java","exceptions");
        try (BufferedReader br= Files.newBufferedReader(dir.resolve("Arithmetic.java"));){
            System.out.println(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // any class that has close method
        // it will closed auto using ress
        // ugly we can use try with resources
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
            //Call to 'printStackTrace()' should probably be replaced with more robust logging
            // use throw
        }
    }
}
