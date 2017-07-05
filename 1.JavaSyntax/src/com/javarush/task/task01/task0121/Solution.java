package com.javarush.task.task01.task0121;

/* 
Контракт
*/

import java.util.Map;
import java.util.TreeMap;

public class Solution {

    private static Map<Integer, String> terms = new TreeMap<>();

    public static void main(String[] args) {

        terms.put(800, "в первый год.");
        terms.put(1500, "во второй год.");
        terms.put(2200, "в третий год.");
        terms.put(2700, "в четвертый год.");
        terms.put(3200, "в пятый год.\n");

        System.out.println("Меня зовут Амиго.\n");

        for (Map.Entry<Integer, String> entry : terms.entrySet())
        {
            System.out.println("Я согласен на зарплату $" + entry.getKey() + "/месяц " + entry.getValue());
        }

        System.out.println("Поцелуй мой блестящий металлический зад!");

        //напишите тут ваш код
    }
}
