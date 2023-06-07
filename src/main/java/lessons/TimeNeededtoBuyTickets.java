package lessons;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededtoBuyTickets {
    public static void main(String[] args) {

        int[] tickets = {2,3,2};
        int position = 2;

        System.out.println(timeRequiredToBuy(tickets, position));

    }

    public static int timeRequiredToBuy(int[] tickets, int k) {

        if (tickets[k] == 0){
            return 0;
        }

        //Заполняем коллекцию num1 данными из массива tickets
        Queue<Integer> num1 = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            num1.add(tickets[i]);
        }

        //счетчик в секундах
        int counter = 0;

        //номер позиции
        int number = k;

        if (number == 0 && num1.element() == 0) {
            return 0;
        }

        while (true) {

            //Проверка, не стоит ли к в очереди первым без билета.
            if (number == 0) {
                if (num1.element() == 1) {
                    counter++;
                    return counter;
                }
            }

            if (number == 0) {
                number = num1.size();
            }

            //Удаляем нулевые элементы из коллекции
            if (num1.element() == 0) {
                num1.remove();
                number--;
            } else {
                if (num1.element() == 1) {
                    num1.remove();
                    number--;
               //     System.out.println(num1);
               //     System.out.println(number);
                    counter++;

                } else {
                    num1.add(num1.element() - 1);
                    num1.remove();
                    number--;
               //     System.out.println(num1);
               //     System.out.println(number);
                    counter++;
                }
            }
            if (num1.size() == 1) {
                if (num1.element() == 1) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}

