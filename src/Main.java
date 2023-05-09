public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int pay = 1200;

        int percent;
        if (pay > 1000) {
            percent = pay * 1 / 100;
        } else {
            percent = 0;
        }

        int totalBalance = balance + pay + percent;

        System.out.println("Итоговый счет: " + totalBalance);
        System.out.println("Бонусные рубли: " + percent);

    }
}