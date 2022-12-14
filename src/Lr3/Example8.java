package Lr3;


//Напишите программу, в которой создается символьный массив из
//10 элементов. Массив заполнить большими (прописными) буквами
//английского алфавита. Буквы берутся подряд, но только согласные (то есть
//гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
//нужно пропустить). Отобразите содержимое созданного массива в консольном
//окне.

public class Example8 {
    public static void main(String[] args) {
        int startChar = 65;
        char[] consonants= new char[20];
        int j = 0;

        for(int i=0;i<26;i++)
        {
            char c = (char)(startChar+i);

            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y')
                continue;

            consonants[j] = c;
            j++;
        }

        Example7.showArray(consonants, false);
    }
}
