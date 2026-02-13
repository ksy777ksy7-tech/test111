public class main {
    public static void main(String[] args) {
        int start = 1; // начальный баланс
        int add = 134; // сумма пополнений
        int summ = start + add; //сумма без бонусов на счету
        int bonus = 0; // сумма бонусов при сумме < 1000

        if (summ > 1000) {
            bonus = summ / 100; //если сумма > 1000, то бонусы начисляются
            // Если summ < 1000, то бонусы не насляются
        }
        int total = summ + bonus;

        System.out.println(total);


    }
}
