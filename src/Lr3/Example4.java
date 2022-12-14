package Lr3;

import java.util.Scanner;

//Напишите программу, которая выводит последовательность чисел
//Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//следующее число равно сумме двух предыдущих (получается
//последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//в последовательности вводится пользователем. Предложите версии
//программы, использующие разные операторы цикла.

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        int val1 = in.nextInt();

        System.out.println("Введите второе число");
        int val2 = in.nextInt();

        if(val2 < val1) // если второе меньше первого, то меняем местами для удобства
        {
            int tmp = val2;
            val2 = val1;
            val1 = tmp;
        }

        withFor(val1, val2); // С использования цикла for

        System.out.println(" ");

        withWhile(val1, val2); // С использованием цикла while
    }

    static void withFor(int val1, int val2)
    {
        for(int i=val1;i<=val2;i++)
            System.out.print(i + (i < val2 ? ", ": ""));
    }

    static void withWhile(int val1, int val2)
    {
        while(val1<=val2) {
            System.out.print(val1 + (val1 < val2 ? ", ": ""));
            val1++;
        }
    }
}