package FirstStepsInCoding.Lab_03;

import java.util.Scanner;

public class A06_NumberInRange_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num >= -100 && num <= 100 && num != 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
