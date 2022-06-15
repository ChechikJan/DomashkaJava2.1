public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int addBalance = 1020;
        int bonus;

        if (addBalance < 1000) {
            bonus = 0;
        } else {
            bonus = addBalance / 100;
        }
        int newBalance = balance + addBalance + bonus;


        System.out.println("Наш баланс = " + newBalance);
    }
}