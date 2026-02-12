public class main {
    public static void main(String[] args) {
        int start = 100; // начальный баланс
        int add = 1349; // сумма пополнений
        int summ = start + add; //сумма без бонусов на счету
        int bonus = summ/100; // сумма бонусов
        int total = start + add + bonus; // итоговый счет

       if (summ > 1000) {
           bonus = summ/100;

                    System.out.println(total);


                }
            }
        }
