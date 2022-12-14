package Lr3;

import java.util.Scanner;

//Напишите программу, в которой вычисляется сумма чисел,
//удовлетворяющих таким критериям: при делении числа на 5 в остатке
//получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
//вводится пользователем. Программа отображает числа, которые
//суммируются, и значение суммы. Предложите версии программы,
//использующие разные операторы цикла.

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число слагаемых:");
        int cnt = in.nextInt();
        int numbs = 0;
        int i;
        int sum = 0;

        // Решение с помощью for
        for(i=0;i>=0;i++)
        {
            if(i%5 == 2 || i%3 == 1) {
                numbs++;
                System.out.print(i + (numbs < cnt ? "+": ""));
                sum += i;
            }

            if(numbs == cnt) {
                System.out.println(" = " + sum);
                break;
            }
        }

        // Решение с помощью while
        sum = 0;
        i = 0;
        numbs = cnt;
        while(numbs > 0)
        {
            i++;
            if(i%5 == 2 || i%3 == 1) {
                numbs--;
                System.out.print(i + (numbs > 0 ? "+": ""));
                sum += i;
            }
        }
        System.out.println(" = " + sum);
    }
}