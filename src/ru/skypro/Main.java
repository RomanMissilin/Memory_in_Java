package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

        ChangePersons changePersons = new ChangePersons();
        Persons Lyapis = new Persons("Lyapis", "Trubetskoy");
        ChangePersons.changePerson(Lyapis);
        System.out.println("Имя - " + Lyapis.getName() + " Фамилия - " + Lyapis.getSurname());
    }

    public static void task1() {

        int value = 33;
        value = changeValue();
        System.out.println("value = " + value);
    }

    public static void task2() {

        Integer value = 33;
        value = changeValue1();
        System.out.println("value = " + value);
    }

    public static void task3() {

        Integer[] value = {1, 2};
        value = changeValue2();
        System.out.println("value = " + Arrays.toString(value));
    }

    public static void task4() {

        Integer[] value = {3, 4};
        System.out.println("value = " + Arrays.toString(value));
    }

    public static void task5() {

        Persons Lyapis = new Persons("Lyapis", "Trubetskoy");
        Lyapis = changePerson1();
        System.out.println("Имя - " + Lyapis.getName() + " Фамилия - " + Lyapis.getSurname());
    }

    public static int changeValue() {

        int i = 22;
        return i;
    }

    public static Integer changeValue1() {

        Integer i = 22;
        return i;
    }

    public static Integer[] changeValue2() {

        Integer[] i = {3, 4};
        return i;
    }

    public static Integer[] changeValue3() {

        Integer[] i = {99, 4};
        return i;
    }

    public static Persons changePerson1() {

        Persons Ilya = new Persons("Ilya", "Lagutenko");
        return Ilya;
    }
}
