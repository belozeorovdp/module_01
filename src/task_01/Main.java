package task_01;

// 1.Задача на взаимодействие между классами. Разработать систему «Вступительные экзамены».
// Абитуриент регистрируется на Факультет, сдает Экзамены. Преподаватель выставляет Оценку.
// Система подсчитывает средний бал и определяет Абитуриента, зачисленного в учебное заведение.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Enrollee enrollee = new Enrollee();
        System.out.println("Абитуриент Ваше имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        enrollee.setName(name);
        System.out.println("Вы будете сдавать экзамен? да или нет.");
        String answer = scan.nextLine();
        if(answer.equals("да")|| answer.equals("Да")|| answer.equals("ДА"))
        {
            System.out.println("Добро пожаловать на экзамен!");
            enrollee.setCheckIn(true);
        }
        else
        {
            System.out.println("Абитуриент " + enrollee.getName());
            System.out.println("До новых встречь!");
            System.exit(0);
        }

        System.out.println("Математика.");
        LecturerMathematics lecturerMathematics = new LecturerMathematics("Иванов И.И.");
        System.out.println("Преподаватель " + lecturerMathematics.getName() + "поставил");
        int markMathematics = scan.nextInt();
        lecturerMathematics.exam(enrollee, markMathematics);

        System.out.println("Химия.");
        LecturerChemistry lecturerChemistry = new LecturerChemistry("Петров П.П.");
        System.out.println("Преподаватель " + lecturerChemistry.getName() + "поставил");
        int markChemistry = scan.nextInt();
        lecturerChemistry.exam(enrollee, markChemistry);

        System.out.println("Физика.");
        LecturerPhysics lecturerPhysics = new LecturerPhysics("Иваненко И.Т.");
        System.out.println("Преподаватель " + lecturerPhysics.getName() + "поставил");
        int markPhysics = scan.nextInt();
        lecturerPhysics.exam(enrollee, markPhysics);

        System.out.println("Язык.");
        LecturerLanguage lecturerLanguage = new LecturerLanguage("Петренко П.Т.");
        System.out.println("Преподаватель " + lecturerLanguage.getName() + "поставил");
        int markLanguage = scan.nextInt();
        lecturerLanguage.exam(enrollee, markLanguage);

        float numberItems = 4.f;
        float assessmentOfExam = 4.49f;
        float averageRating = (float) (enrollee.getMarkChemistry() + enrollee.getMarkLanguage() + enrollee.getMarkMathematics() + enrollee.getMarkPhysics())/numberItems;
        System.out.println("Абитуриент " + enrollee.getName() + " Ваш средний бал " + averageRating);

        if (averageRating >= assessmentOfExam)
        {
            System.out.println("Абитуриент " + enrollee.getName() + " Вы прошли!");
        }
        else
        {
            System.out.println("Абитуриент " + enrollee.getName() + " Вы не прошли!");
            System.out.println("До новых встречь!");
        }
    }
}
