package com.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        char op;

        System.out.print("input number(x + y): ");
        num1 = sc.nextInt();
        op = sc.next().charAt(0);
        num2 = sc.nextInt();

        System.out.println("\nResult: ");
        switch (op){
            case '+':
                result = num1 + num2;
                System.out.printf("%d + %d = %d\n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%d + %d = %d\n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%d + %d = %d\n", num1, num2, result);
                break;
            case '/':
                result = num1 / num2;
                System.out.printf("%d + %d = %d\n", num1, num2, result);
                break;
            case '%':
                result = num1 % num2;
                System.out.printf("%d + %d = %d\n", num1, num2, result);
                break;
            default:
                System.err.println("Did you input the number correctly? (x + y)");

        }



    }
}
