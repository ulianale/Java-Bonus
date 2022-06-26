public class Main {
    public static void main(String[] args) {
        int money = 100; // количество денег на счету
        int addMoney = 1009; // количество добавленных денег
        int oneBonus = 100; // цена одного бонусного рубля

        int bonus = addMoney > 1000 ? addMoney / oneBonus : 0;

        System.out.println("Начислено бонусных рублей: " + bonus);
        System.out.println("Итоговая сумма на счете: " + (money + addMoney + bonus));
    }
}
