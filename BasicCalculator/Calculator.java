import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a : ");
        double a = sc.nextDouble();

        System.out.println("Enter number b :");
        double b = sc.nextDouble();

        System.out.println("Enter Operator (+, -, *, /) : ");
        String op = sc.next();

        switch(op) {
            case "+" -> {
                System.out.println( a+b );
            }
            case "-" -> {
                System.out.println( a-b );
            }
            case "*" -> {
                System.out.println( a*b );
            }
            case "/" -> {
                if(b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Error: Division by zero not allowed");
                }
            }
            default -> System.out.println("Invalid operator");
        }
    }
}
