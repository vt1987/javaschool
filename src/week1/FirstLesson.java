package week1;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.Console;



public class FirstLesson {
    public static void main(String[] args) {
        int parameterCount = args.length;
        if (parameterCount > 1) {
            System.out.println("One parameter expected, but got " + parameterCount);
        }



    }
}
