package ExtraTask;

public class BuckwheatStock {
    public static void main(String[] args) {
        int month = 5;
        int priceBuckwheat = 100;
        int buckwheatPerMonth = 6;
        int totalFee = 0;

        for (int countMonth = month * 1; countMonth > 0; countMonth -= 1) {
            totalFee = totalFee + countMonth * priceBuckwheat * buckwheatPerMonth;
        }

        System.out.println(totalFee);
    }
}