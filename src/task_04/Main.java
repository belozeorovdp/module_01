package task_04;

// 4. Дан файл  с логинами и паролями. Найдите топ10 самых популярных паролей.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        String str = read("c:\\Users\\User\\file.txt");

        List<String> liststr = new ArrayList<String>();

        // загатовка
        for (String retval : str.split(" "))
        {
            liststr.add(retval);
            //System.out.println(retval);
        }

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
