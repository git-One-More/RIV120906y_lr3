package Lr3;

import java.util.Scanner;

//Напишите программу, в которой пользователю предлагается
//ввести название дня недели. По введенному названию программа определяет
//порядковый номер дня в неделе. Если пользователь вводит неправильное
//название дня, программа выводит сообщение о том, что такого дня нет.
//Предложите версию программы на основе вложенных условных операторов и
//на основе оператора выбора switch.

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели:");
        String dayName = in.nextLine();
        int dayNum;

        dayNum = withIfElse(dayName);
        System.out.println((dayNum == 0 ? "Введено некорректное название дня" : "Порядковый номер дня '" + dayName + "' в неделе: " + dayNum));

        dayNum = withSwitch(dayName);
        System.out.println((dayNum == 0 ? "Введено некорректное название дня" : "Порядковый номер дня '" + dayName + "' в неделе: " + dayNum));
    }

    // Версия на основе вложенных условных операторов
    static int withIfElse(String dayName)
    {

        return ShowDay(dayName);
    }

    private static int ShowDay(String dayName) {
        return switch (dayName) {
            case "Понедельник", "понедельник" -> 1;
            case "Вторник", "вторник" -> 2;
            case "Среда", "среда" -> 3;
            case "Четверг", "четверг" -> 4;
            case "Пятница", "пятница" -> 5;
            case "Суббота", "суббота" -> 6;
            case "Воскресенье", "воскресенье" -> 7;
            default -> 0;
        };
    }

    // Версия на основе оператора выбора switch
    static int withSwitch(String dayName)
    {
        return ShowDay(dayName);
    }
}