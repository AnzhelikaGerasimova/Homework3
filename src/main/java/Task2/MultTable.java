package Task2;

public class MultTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                System.out.printf("%4d", i * k);
            }
            System.out.println();
        }
    }
}
