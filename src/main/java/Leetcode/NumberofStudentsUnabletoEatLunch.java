package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofStudentsUnabletoEatLunch {
    public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
        System.out.println(countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {

        //Заполняем коллекцию num1 данными из массива students
        Queue<Integer> num1 = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            num1.add(students[i]);
        }

        //Заполняем коллекцию num2 данными из массива sandwiches
        Queue<Integer> num2 = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            num2.add(sandwiches[i]);
        }

        //Сравниваем первые элементы num1 и num2 до тех пор, пока массив students не пройдет все значения без изменений
        for (int i = 0; i <= num1.size(); i++) {
            if (num1.element() == num2.element()) {
                num1.poll();
                num2.poll();
                i = 0;
            } else {
                num1.add(num1.element());
                num1.poll();
            }
            System.out.println(num1);
            System.out.println(num2);
            System.out.println();
        }
        return num1.size();
    }
}

