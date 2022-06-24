public class Main {
    public static void main(String[] args) {
        int x = 100; // количество денег на счету
        int amount = 1009; // количество добавленных денег
        int one_b = 100; // цена одного бонусного рубля

        int bonus = amount > 1000 ? amount / one_b : 0;
        int s = x + amount + bonus;

        System.out.println("Начислено бонусных рублей: " + bonus);
        System.out.println("Итоговая сумма на счете: " + s);
    }
}
