package Task1;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int number = 0; number <= 100; number++) {
            if ((number % 3 == 0) && (number % 5 == 0)) {
                System.out.println(number + " FizzBuzz");
            }
            else if (number % 3 == 0) {
                System.out.println(number + " fizz");
            }
            else if (number % 5 == 0) {
                System.out.println(number + " buzz");
            }
        }
    }
}
