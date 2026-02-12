public class main {
    public static void main(String[] args) {
        int start = 100; // начальный баланс
        int add = 1349; // сумма пополнений
        int summ = start + add; //сумма без бонусов на счету
        int bonus = summ/100; // сумма бонусов

        if (summ > 1000) {
           bonus = summ/100;
            
        int total = start + add + bonus; // итоговый счет

       

                    System.out.println(total);


                }
            }
        }
