package task_05;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("kX = ");
        int kX = scan.nextInt();
        System.out.println("kY = ");
        int kY = scan.nextInt();
        System.out.println("stepX = ");
        int stepX = scan.nextInt();
        System.out.println("stepY = ");
        int stepY = scan.nextInt();

        boolean stepRihgt1 =  stepX == (kX - 2) && stepY == (kY + 1);
        boolean stepRihgt2 =  stepX == (kX - 1) && stepY == (kY + 2);
        boolean stepRihgt3 =  stepX == (kX - 2) && stepY == (kY - 1);
        boolean stepRihgt4 =  stepX == (kX - 1) && stepY == (kY - 2);
        boolean stepRihgt5 =  stepX == (kX + 2) && stepY == (kY + 1);
        boolean stepRihgt6 =  stepX == (kX + 1) && stepY == (kY + 2);
        boolean stepRihgt7 =  stepX == (kX + 2) && stepY == (kY - 1);
        boolean stepRihgt8 =  stepX == (kX + 1) && stepY == (kY - 2);

        if (stepRihgt1 || stepRihgt2 || stepRihgt3 || stepRihgt4 || stepRihgt5 || stepRihgt6 || stepRihgt7 || stepRihgt8)
        {
            System.out.println("Правильный ход");
        }
        else
        {
            System.out.println("Неправильный ход");
        }
    }
}
