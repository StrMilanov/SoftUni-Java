package FirstStepsInCoding.Lab_02;

import java.util.Scanner;

public class A03_EvenOrOdd_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
