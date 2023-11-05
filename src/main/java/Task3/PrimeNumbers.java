package Task3;

public class PrimeNumbers {
    public static boolean prime(int number) {
        for (int count = 2; count < number; count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if (prime(16)) {
            System.out.println("Простое число.");
        } else {
            System.out.println("Не простое число.");
        }
    }
}


