package FirstStepsInCoding.Lab_06;

public class P02_MultiplicationTable_01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }

    }
}
