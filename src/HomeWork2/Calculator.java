package HomeWork2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int a = input.nextInt();
        System.out.print("Second number: ");
        int b = input.nextInt();
        System.out.print("Operator: ");
        String op = input.next();

        int z;

        if (op.equals("+")) {
            z = a + b;
        } else if (op.equals("-")) {
            z = a - b;
        } else if (op.equals("*")) {
            z = a * b;
        } else if (op.equals("/")) {
            z = a / b;
        } else {
            throw new java.lang.Error("Operator not recognized");
        }
        System.out.println("Result: " + z);
    }
}
