package Task2;

public class MultTable {
    public static void main(String[] args) {
        for (int multiplicand1 = 1; multiplicand1 < 10; multiplicand1++) {
            for (int multiplicand2 = 1; multiplicand2 < 10; multiplicand2++) {
                System.out.printf("%4d", multiplicand1 * multiplicand2);
            }
            System.out.println();
        }
    }
}
