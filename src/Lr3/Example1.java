package Lr3;
import java.util.Scanner;
//Напишите программу, в которой пользователь вводит целое число
//в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//Если введенное пользователем число выходит за допустимый диапазон,
//выводится сообщение о том, что введено некорректное значение. Используйте
//оператор выбора switch.
public class Example1 {
    public static void main(String[] args) {
        Scanner();
    }

    static void Scanner() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер дня недели:");
        int dayNum = in.nextInt();
        String dayName = "";
        boolean outOfBounds = false;
        switch (dayNum) {
            case 1 -> dayName = "Понедельник";
            case 2 -> dayName = "Вторник";
            case 3 -> dayName = "Среда";
            case 4 -> dayName = "Четверг";
            case 5 -> dayName = "Пятница";
            case 6 -> dayName = "Суббота";
            case 7 -> dayName = "Воскресенье";
            default -> outOfBounds = true;
        }

        System.out.println((outOfBounds ? "Введено некорректное значение" : "Это - " + dayName));
    }
}

