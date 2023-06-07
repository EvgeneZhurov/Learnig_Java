package lessons;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class SuppressedExeption {
    public static void main(String[] args) {
/*
        int a = 1;
        int b = 0;
        try {
            supExeption(a, b);
        } catch (IOException e1) {
            System.out.println("Деленеие на 0");
        }*/
    }

    public static void supExeption(int num1, int num2) throws Exception {

        try {
            int c = num1 / num2;
        } catch (ArithmeticException e) {
            throw new IOException();
        } finally {

        }
    }
}
