package FirstStepsInCoding.Lab_02;

import java.util.Scanner;

public class A02_GreaterNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        if (n1 > n2){
            System.out.println(n1);
        }else{
            System.out.println(n2);
        }
    }
}
