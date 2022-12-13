package tasks;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Expression");
        String exp= sc.next();
        Calculator c = new Calculator();
        c.calculator(exp);


    }
}
