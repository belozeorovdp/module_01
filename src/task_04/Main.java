package task_04;

// 4. Дан файл  с логинами и паролями. Найдите топ10 самых популярных паролей.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        String str = read("c:\\Users\\Public\\file.txt");
        List<String> liststr = new ArrayList<String>();
        List<String> listPassword = new ArrayList<String>();
        // Разделяем слова и кладем в liststr
        for (String retval : str.split(" "))
        {
            liststr.add(retval);
        }
        // удалеям не нужные слова и формируем listPassword только с паролями
        int amountOfElements = liststr.size();
        int index = 0;
        while(index < amountOfElements)
        {
            if (liststr.get(index).equals("login:"))
            {
                index+=2;
            }
            else if (liststr.get(index).equals("password:"))
            {
                index++;
            }
            else
            {
                listPassword.add(liststr.get(index));
                index++;
            }

        }
        // Просмотр всех паролей (проверка)
        System.out.println("Список всех паролей");
        for (int i = 0; i < (listPassword.size()); i++)
        {
            System.out.println(listPassword.get(i));
        }
        // Сортируем listPassword что бы сгрупировать одинаковые слова по порядку
        Collections.sort(listPassword);
        // Подсчитываем сколько раз повторяется оди и тотже пароль и формируем mapPassword с парой пароль - количество  повторов
        Map mapPassword = new HashMap<String, Integer>();
        String string = listPassword.get(0);
        int amount = 0;
        index = 0;
        while(true)
        {
            if (index == listPassword.size())
            {
                mapPassword.put(listPassword.get(index - 1), amount);
                break;
            }
            if(listPassword.get(index).equals(string))
            {
                amount++;
                index++;
            }
            else
            {
                mapPassword.put(listPassword.get(index - 1), amount);
                string = listPassword.get(index);
                amount = 0;
            }
        }
        // Просмотр mapPassword (проверка)
        Iterator<Map.Entry<String, Integer>> entries = mapPassword.entrySet().iterator();
        while (entries.hasNext())
        {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("Password: " + entry.getKey() + " N: " + entry.getValue());
        }
        // Сортируем mapPassword по значению (MapUtil нашел на просторах итернета, изменил только порядок сортировки)
        mapPassword = MapUtil.sortByValue(mapPassword);
        // Перекидываю top 10 из mapPassword в listResult
        List<String> listResult = new ArrayList<String>();
        int sizeTop10 = 10;
        if (mapPassword.size() < sizeTop10)
        {
            sizeTop10 = mapPassword.size();
        }
        System.out.println("Sorted");
        entries = mapPassword.entrySet().iterator();
        int count = 0;
        while (entries.hasNext())
        {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("Password: " + entry.getKey() + " N: " + entry.getValue());
            if(count < sizeTop10)
            {
                listResult.add(entry.getKey());
            }
            count++;
        }
        // Выношу результат listResult (проверка)
        System.out.println("Top 10 паролей");
        for (int i = 0; i < (listResult.size()); i++)
        {
            System.out.println(listResult.get(i));
        }
        System.out.println("count = " + listResult.size());





//        Map<String, Integer> map = new HashMap<>();
//        List list = new ArrayList(map.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
//        {
//            @Override
//            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b)
//            {
//                return a.getValue() - b.getValue();
//            }
//        });
//        System.out.println("!");
//
//        for (int i = 0; i < (list.size()); i++)
//        {
//            System.out.println(list.get(i));
//        }





//        for(int i = 0)





        //Collections.sort(liststr);

//        List<String> liststrTop10 = new ArrayList<String>();
//        int k = 1;
//        int j;
//        for (int i = 0; i < (liststr.size() - 1); i++)
//        {
//            for (j = i + 1; j < liststr.size(); j++)
//            {
//                if (liststr.get(i).equals(liststr.get(j)))
//                {
//                    break;
//                }
//            }
//            if (j == liststr.size())
//            {
//                liststrTop10.add(liststr.get(i));
//                k++;
//            }
//        }
//        Collections.sort(liststrTop10);
//        int sizeTop10 = 10;
//        if (liststrTop10.size() < sizeTop10)
//        {
//            sizeTop10 = liststrTop10.size();
//        }
//
//        for (int i = 0; i < (sizeTop10); i++)
//        {
//            System.out.println(liststrTop10.get(i));
//        }



        // for()


    }

    public static String read(String path)
    {
        //открываем файл по пути
        StringBuilder stringBuilder = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(path)))
        {
            stringBuilder = new StringBuilder();
            String currentString;
            //построчно считываем файл
            while ((currentString = reader.readLine()) != null)
            {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        return stringBuilder.toString();
    }


}
