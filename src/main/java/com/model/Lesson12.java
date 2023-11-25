package com.model;

public class Lesson12 {
    public static void main(String[] args) {
        int index = 0;
        int num = 2;
        int sum = 0;

        while (sum < 1000) {
            sum += num;
            num += 2;
            index++;
        }

        System.out.println(index);
    }
}
