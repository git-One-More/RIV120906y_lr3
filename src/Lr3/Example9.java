package Lr3;

import java.util.Arrays;
import java.util.Random;

//Напишите программу, в которой создается массив и заполняется
//случайными числами. Массив отображается в консольном окне. В этом
//массиве необходимо определить элемент с минимальным значением. В
//частности, программа должна вывести значение элемента с минимальным
//значением и индекс этого элемента. Если элементов с минимальным
//значением несколько, должны быть выведены индексы всех этих элементов.

public class Example9 {
    public static void main(String[] args) {
        Random random = new Random();
        int c = random.nextInt(3, 20);
        int[] arr = new int[c];

        for(int i=0;i<arr.length;i++) arr[i] = random.nextInt(-10, 10);

        Example6.showNumArray(arr);

        int min = getMinFromArray(arr);

        System.out.println(" ");
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Индексы с минимальным элементом: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == min) {
                System.out.print(i + " ");
            }
        }
    }

    static int getMinFromArray(int[] array)
    {
        int[] sortArray = array.clone();
        Arrays.sort(sortArray);
        return sortArray[0];
    }
}
