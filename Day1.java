import java.util.Scanner;
public class Day1{
    public static double areaSwitchCase(int ch , double a[]){
        double area = 0.0 ;
        switch(ch){
            case 1:
            double r = a[0];
            area = Math.PI*r*r;
            break;

            case 2:
            double  l = a[0];
            double b = a[1];
            area = l * b ;
            break;

            default:
            System.out.println("Invalid choice");
        }

        return area ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter the choice!");
        ch = sc.nextInt();

        double a [] = new double[2];
        System.out.println("Enter the arr having one or two element! to calculate area of circle or area of rectangle");
        a[0] = sc.nextDouble();
        a[1] = sc.nextDouble();

        System.out.println(areaSwitchCase(ch, a));
    }
}