package com.Pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex. System.out.println("The answer is " + answer);


        double bobSalary = 54000;
        double garySalary = 75000;
        double highestSalary = 100000;

        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);


        // Finding variables for car and truck
        double carPrice = 65000;
        double truckPrice = 95000;
        System.out.println("The smallest price is " + carPrice);

        // Finding area of a circle
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area of a circle is: %.2f%n", area);

        // Finding the square root
        double number = 5.0;
        double squareRoot = Math.sqrt(5.0);
        System.out.printf("The square root of 5.0 is: %.2f%n", squareRoot);

        // Finding the distance between 5,10 and 85,50
        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;

        Math.pow(x2 - x1, 2);   // (85-5)^2 = 6400
        Math.pow(y2 - y1, 2);   // (50-10)^2 = 1600

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("The distance is: %.2f%n", distance);

        // finding the absolute value
        double value = -3.8;

        double answer = Math.abs(value);
        System.out.println("Value: " + value);
        System.out.println("Answer is: " + answer);


        // finding random number
        double random = Math.random();
        System.out.printf("Random number: %.2f%n", random);


        // Calculate minutes in 24 days
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;


        System.out.println("Days: " + days);
        int hours = days * 24;
        System.out.println("Hours: " + hours);
        int minutes = hours * 60;
        System.out.println("Minutes: " + minutes);
        // Bonus
        int seconds = minutes * 60;
        System.out.println("Miliseconds: " + seconds);





        







    }
}
