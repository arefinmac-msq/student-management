package com.company;

//----------------Student Management System
//---------------------------------- (Complete) (Added Grade system)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dataInput = 100;
        int homeMenu = 0;
        int storeSubMenu = 0;

        int count = 0;

        String[] studentName = new String[dataInput];
        int[] studentRoll = new int[dataInput];
        double[] studentMarks = new double[dataInput];
        String[] studentGrade = new String[dataInput];

        System.out.println("\n\u001B[35m*** Welcome to Student Management System ***\u001B[0m");

        for (; ;) {

            System.out.print("\n\u001B[34mHome: (Total Student: " + count + ")\n" +
                    "Data Entry [1], Show Data [2], Exit [3]: \u001B[0m");
            homeMenu = scanner.nextInt();
            scanner.nextLine();

            if (homeMenu == 1) {

                for (int i = 0; i <= dataInput; i++) {

                    System.out.print("\n\u001B[34mData Entry: \n" +
                            "Store Data [1], Main Menu [2]: \u001B[0m");
                    storeSubMenu = scanner.nextInt();
                    scanner.nextLine();

                    if (storeSubMenu == 1) {

                        System.out.print("\n--Storing Data--\n" +
                                "Enter Student Name: ");
                        studentName[count] = scanner.nextLine();

                        System.out.print("Enter Student Roll: ");
                        studentRoll[count] = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Student Marks: ");
                        studentMarks[count] = scanner.nextDouble();
                        scanner.nextLine();

                        studentGrade[count] = calculateGrade(studentMarks[count]);


                        System.out.println("\n\u001B[32m** Data Entered Successfully !!**\u001B[0m");
                        count++;

                    }
                    else if (storeSubMenu == 2) {
                        System.out.println("\n\u001B[32mGoing Back to Main Menu...\u001B[0m");
                        break;
                    }
                    else {
                        System.out.println("\n\u001B[31m-- Enter a valid number !!!--\u001B[0m");
                        continue;
                    }
                }

            }
            else if (homeMenu == 2) {

                for (; ;) {

                    System.out.print("\n\u001B[34mData Archive: \n" +
                            "Search by Roll [1], Show All [2], Main Menu [3]: \u001B[0m");
                    int subMenu = scanner.nextInt();

                    if (subMenu == 1) {

                        int k = 0;
                        System.out.print("\nEnter Roll Number: ");
                        int rollSearch = scanner.nextInt();

                        for (k = 0; k <= count; k++) {
                            if (studentRoll[k] == rollSearch) {
                                break;
                            }
                        }

                        System.out.println(" \nName: " + studentName[k]
                                + ", Roll: " + studentRoll[k]
                                + ", Marks: " + studentMarks[k]
                                + ", Grade: " + studentGrade[k]);
                        continue;
                    }
                    else if (subMenu == 2) {

                        System.out.println(" ");

                        for (int j = 0; j < count; j++) {
                            System.out.println(" [" + (j + 1) + "]" + " Name: " + studentName[j]
                                    + ", Roll: " + studentRoll[j]
                                    + ", Marks: " + studentMarks[j]
                                    + ", Grade: " + studentGrade[j]);
                        }
                        continue;
                    }
                    else if (subMenu == 3) {
                        System.out.println("\n\u001B[32mGoing Back to Main Menu...\u001B[0m");
                        break;
                    }
                    else {
                        System.out.println("\n\u001B[31m-- Enter a valid number !!!--\u001B[0m");
                        continue;
                    }
                }
            }
            else if (homeMenu == 3) {
                System.out.println("\nThank you !!");
                System.out.println("\n\u001B[31mExiting......\u001B[0m");
                break;
            }
            else {
                System.out.println("\n\u001B[31m-- Enter a valid number !!!--\u001B[0m");
                continue;
            }
            //scanner.close();
        }
    }
    public static String calculateGrade(double totalMarks) {
        if ((totalMarks >= 90) && (totalMarks <= 100)) {
            return "A (Plain)";
        }
        else if ((totalMarks >= 86) && (totalMarks <= 89)) {
            return "A- (Minus)";
        }
        else if ((totalMarks >= 82) && (totalMarks <= 85)) {
            return "B+ (Plus)";
        }
        else if ((totalMarks >= 78) && (totalMarks <= 81)) {
            return "B (Plain)";
        }
        else if ((totalMarks >= 74) && (totalMarks <= 77)) {
            return "B- (Minus)";
        }
        else if ((totalMarks >= 70) && (totalMarks <= 73)) {
            return "C+ (Plus)";
        }
        else if ((totalMarks >= 66) && (totalMarks <= 69)) {
            return "C (Plain)";
        }
        else if ((totalMarks >= 62) && (totalMarks <= 65)) {
            return "C- (Minus)";
        }
        else if ((totalMarks >= 58) && (totalMarks <= 61)) {
            return "D+ (Plus)";
        }
        else if ((totalMarks >= 55) && (totalMarks <= 57)) {
            return "D (Plain)";
        }
        else if ((totalMarks >= 0) && (totalMarks <= 54)) {
            return "F (Sorry)";
        }
        else {
            return "Invalid Input";
        }
    }
}

