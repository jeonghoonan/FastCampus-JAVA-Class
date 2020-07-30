package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's patient's ID?: ");
        int ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What's patient's problem?: ");
        String problem = scanner.nextLine();

        System.out.println("What causes it?: ");
        String causes = scanner.next();

        System.out.println("*----------*--------*---------------*");
        System.out.printf("| ID%6d | %-6s | %-12s |", ID, problem, causes);



    }
}
