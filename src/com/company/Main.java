package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sumOfTen = 0;
        while (count < 10){ //podaj mi 10 liczb
            count++; // za kazdym razem zwiekszaj o jeden
            System.out.println("Enter number #" + count); //napis przed pytaniem i numer o ktora liczbe pyta
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int validNumber = scanner.nextInt();
                sumOfTen += validNumber;

            } else {
                System.out.println("Invalid Number");
                break;
            }

        }
        System.out.println("The sum of the ten numbers is " + sumOfTen);
        scanner.close();
    }
}

