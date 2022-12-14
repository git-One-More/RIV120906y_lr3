package Lr3;

import java.util.Arrays;
import java.util.Random;

//Напишите программу, в которой создается целочисленный
//массив, заполняется случайными числами и после этого значения элементов в
//массиве сортируются в порядке убывания значений.

public class Example10 {
    public static void main(String[] args) {
        Random random = new Random();
        int c = random.nextInt(3, 20);
        int[] arr = new int[c];

        for(int i=0;i<arr.length;i++) arr[i] = random.nextInt(-100, 100);

        Example6.showNumArray(arr);

        arr = getReversSortingArray(arr);

        System.out.println(" ");
        Example6.showNumArray(arr);
    }

    static int[] getReversSortingArray(int[] array)
    {
        Arrays.sort(array);
        int[] tmpArr = new int[array.length];

        for(int i=0; i<array.length; i++)
            tmpArr[tmpArr.length-i-1] = array[i];

        return tmpArr;
    }
}
