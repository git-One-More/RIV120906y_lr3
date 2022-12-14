
    package Lr3;

//Напишите программу, в которой создается одномерный
//символьный массив из 10 элементов. Массив заполняется буквами «через
//одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//порядке. Размер массива задается переменной.

    public class Example7 {
        public static void main(String[] args) {
            int startChar = 1070;
            int masLength = 10;
            char[] chars= new char[masLength];

            for(int i=0;i<masLength;i++)
            {
                startChar += 2;
                chars[i] = (char)startChar;
            }

            showArray(chars, false);

            System.out.println(" ");

            showArray(chars, true);
        }

        public static void showArray(char[] arr, boolean reverse)
        {
            int sE = (reverse ? arr.length-1 : 0);
            int fE = (reverse ? -1 : arr.length);
            int sum = (reverse ? -1 : 1);

            for(int i=sE; i!=fE; i += sum)
                System.out.print(arr[i] + (i!=fE-sum ? ", ": ""));
        }
    }
