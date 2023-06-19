package com;

import com.model.Animal;
import com.model.Cat;
import com.model.Dog;

/**
 * Реализовать класс Animal, содержащий protected-конструктор без параметров,
 * который выводит в консоль сообщение «I’m an animal».
 * <p>
 * Реализовать для Animal классы-наследники Dog и Cat.
 * Реализовать для каждого из них приватный конструктор без параметров,
 * который выводит в консоль сообщение «I’m a dog» («I’m a cat»).
 * Также реализовать публичный конструктор, принимающий строковый параметр color.
 * Он должен вызывать конструктор без параметров,
 * а также выводить в консоль сообщение «I’m a <color> dog» («I’m a <color> cat»),
 * где <color> – значение параметра конструктора color.
 * <p>
 * Создайте в main() экземпляр Dog и экземпляр Cat.
 * Обратите внимание на консоль.
 * Такой ли порядок сообщений вы ожидали увидеть?
 */
public class Main {
    public static void main(String[] args) {

        Animal Sharic = new Dog("Черный");
        Animal Barsic = new Cat("Белый");

        checkDog(Sharic);
        checkDog(Barsic);
        checkCat(Sharic);
        checkCat(Barsic);
    }

    public static void checkDog(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Объект принадлежит классу Dog");
        } else {
            System.out.println("Объект не принадлежит классу Dog");
        }
    }

    public static void checkCat(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("Объект принадлежит классу Cat");
        } else {
            System.out.println("Объект не принадлежит классу Cat");
        }
    }
}
