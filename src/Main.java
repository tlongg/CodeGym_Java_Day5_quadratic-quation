import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        double a = scanner.nextInt();

        System.out.println("Enter b:");
        double b = scanner.nextInt();

        System.out.println("Enter c:");
        double c = scanner.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant() < 0){
            System.out.println("No root");
        } else {
            System.out.println("Root 1 is " + quadraticEquation.getRoot1());
            System.out.println("Root 2 is " + quadraticEquation.getRoot2());
        }

    }
}