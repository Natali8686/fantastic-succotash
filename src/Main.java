public class Main {
    public static void main(String[] args) {
        int start = 100; // сумма начальная
        int amountReplenishment = 1100; // пополнен счет на сумму

        int bonus = amountReplenishment / 100; // бонус = пополнение /100

        if (amountReplenishment < 1000) {
            bonus = 0;
        }
        int result = start + amountReplenishment + bonus;

        System.out.println(" Итого на счете:" + result + " руб.");
        System.out.println("Бонусные рубли:" + bonus + "руб.");

    }
}
