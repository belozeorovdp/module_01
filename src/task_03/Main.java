package task_03;

// 3.Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.


import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int [] array = {1, 4, 5, 1, 1, 1, 3, 8, 8, 5, 7, 9};

        int k = 1;
        int j;
        for (int i = 0; i < array.length - 1; i++)
        {
            for (j = i + 1; j < array.length; j++)
            {
                if (array[i] == array[j]) break;
            }
            if (j == array.length) k++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("k = " + k);
    }
}

