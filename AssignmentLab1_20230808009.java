/* 
* @author Burcinnur Alkan 
* @version 1.1
* @date 2024-10-07
*/
import java.util.Scanner;

public class AssignmentLab1_20230808009 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
    }
    public static void question1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side a: ");
        int a = sc.nextInt();
        System.out.print("Enter the length of side b: ");
        int b = sc.nextInt();
        System.out.print("Enter the length of side c: ");
        int c = sc.nextInt();
        if (a+b>c && a+c>b && b+c>a) {
            if (a == b && b == c) {
                System.out.println("Equilateral triangle.");
            }else if (a == b || b == c || a == c){
                System.out.println("Isosceles triangle.");
            }else {
                System.out.println("Scalene triangle.");
            }

        }else {
            System.out.println("The given sides do not form a triangle.");
        }
    }
    public static void question2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose the operation you want to perform (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else if (num1 != 0 && num2 == 0) {
                    System.out.println("Undefined!");
                    return;
                } else {
                    System.out.println("Uncertain!");
                    return;
                }
                break;
            default:
            System.out.println("Invalid operation.");
                return;
        }
        System.out.println("Result: " + result);
    }
    public static void question3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the center coordinates and radius of the first circle (x1, y1, r1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        System.out.print("Enter the center coordinates and radius of the second circle (x2, y2, r2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (d > r1 + r2) {
            System.out.println("The circles are separate.");
        } else if (d < Math.abs(r1 - r2)) {
            System.out.println("One circle is inside the other, and they do not intersect.");
        } else if (d == 0 && r1 == r2) {
            System.out.println("The circles are coincident (infinite points of intersection).");
        } else {
            System.out.println("The circles intersect.");
        }
    }
    public static void question4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x and y coordinates of the point: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("The point is in the first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in the second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in the third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in the fourth quadrant.");
        } else if (x == 0 && y != 0) {
            System.out.println("The point is on the Y axis.");
        } else if (x != 0 && y == 0) {
            System.out.println("The point is on the X axis.");
        } else {
            System.out.println("The point is at the origin.");
        }
    }
    public static void question5() {
        Scanner sc = new Scanner(System.in);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter a day number between 1 and 365: ");
        int dayOfYear = sc.nextInt();
        
        if (dayOfYear < 1 || dayOfYear > 365) {
            System.out.println("Invalid day number. It must be between 1 and 365.");
            return;
        }
        
        int month = 0;
        while (dayOfYear > days[month]) {
            dayOfYear -= days[month];
            month++;
        }
        System.out.println("Date: " + dayOfYear + "." + (month + 1));

    }
}
