package Lr3;

import java.util.Scanner;

//Напишите программу, в которой создается одномерный числовой
//массив и заполняется числами, которые при делении на 5 дают в остатке 2
//(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
//Предусмотреть обработку ошибки, связанной с вводом некорректного
//значения.

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt;

        do {
            System.out.println("Введите размер массива:");
            cnt = in.nextInt();
        }
        while(cnt<1);

        int[] numbers = new int[cnt];

        int value = 0;
        int values = 0;
        do {
            value++;
            if (value % 5 == 2) {
                numbers[values] = value;
                values++;
            }
        } while (values != cnt);

        System.out.println("Получившийся массив:");
        showNumArray(numbers);
    }

    public static void showNumArray(int[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i] + (i < ar.length-1 ? ", ": ""));
        }
    }
}
