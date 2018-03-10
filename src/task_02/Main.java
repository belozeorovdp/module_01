package task_02;

// 2.Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать. После каждой неудачной попытки компьютер
// сообщает меньше или больше загаданное число. В конце игры текст с результатом (или “Вы угадали”,
// или “Попытки закончились”).

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a = 0;  // начальное значение диапазона - "от"
        int n = 10; // конечное значение диапазона - "до"
        int k = 5;  // число попыток

        int random_number = a + (int) (Math.random() * n); // Генерация числа

        System.out.println("Введите число от 0 до " + n);

        Scanner scan = new Scanner(System.in);

        System.out.println("У Вас k - " + k  + " попыток.");
        int counter = 0;
        while (counter < k)
        {
            int cumulativeNumber = scan.nextInt();
            if (cumulativeNumber > random_number)
            {
                System.out.println("Вы ввели чиcло больше загаданного.");
            }
            else if (cumulativeNumber < random_number)
            {
                System.out.println("Вы ввели чиcло меньше загаданного.");
            }
            else
            {
                System.out.println("Вы угадали");
                System.out.println("Число попыток " + (counter + 1));
                System.exit(0);
            }
            counter++;
        }
        System.out.println("Вы не угадали. Число попыток " + counter);
    }
}
