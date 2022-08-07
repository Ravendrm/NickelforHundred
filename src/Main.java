public class Main {
    public static void main(String[] args) {

        int basicBalance = 100;
        int TopUpSum = 4000;
        int BonusPrice = 100;
        int Bonuses = (TopUpSum / BonusPrice);

        if (TopUpSum < 1000) {
            System.out.println(basicBalance + TopUpSum + " Ваш баланс пополнен. ");
        } else {
            System.out.println(basicBalance + TopUpSum + Bonuses + " Баланс пополнен. Бонусы начислены ");
            System.out.println(Bonuses + " Начислено бонусов ");
        }
    }
}