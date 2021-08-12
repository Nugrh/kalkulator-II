package com.project;

import java.util.Scanner; // import input user

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, result; // deklarasi nomer yang akan di eksekusi
        char op; // deklarasi operasi aritmatika

        System.out.print("input number(x + y): "); // nanya
        num1 = sc.nextInt();        // ambil input dari user
        op = sc.next().charAt(0);   // ambil input operator dari user
        num2 = sc.nextInt();        // ambil input dari user

        System.out.println("\nResult: ");
        switch (op){ // switch statement
            case '+': // target
                result = num1 + num2; // operasi aritmatika
                System.out.printf("%d + %d = %d\n", num1, num2, result); // output pake printf biar gampang
                break; // break supaya eksekusinya gk lanjut ke bawah
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
                System.err.println("Did you input the number correctly? (x + y)"); // default value
                break;
        }
    }
}
