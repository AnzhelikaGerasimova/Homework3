package ExtraTask;

public class BuckwheatStock {
    public static void main(String[] args) {
        int month = 5;
        int totalFee = 0;

        for (int countMonth = month * 6; countMonth > 0; countMonth -= 6) {
            totalFee = totalFee + (countMonth * 100);
        }

        System.out.println(totalFee);
    }
}