package algorithm;

import java.util.ArrayList;

// Change by places first and last letters in each second string of list or array
// (Поменять местами первую и последнюю буквыв каждой второй строке списка)

public class ChangeChars {
    public static void main(String[] arg) {

        // создаю новый список строк
        ArrayList<String> myArray = new ArrayList<>();

        // добавляю значения в созданный список строк
        myArray.add("первая строка");
        myArray.add("вторая строка");
        myArray.add("третья строка");
        myArray.add("четвертая строка");

        // циклом прохожу по всем строкам списка и
        // определяю в каждой строке первый символ, последний символ и всё что между ними
        for (int i = 0; i < myArray.size(); i++) {
            String string = myArray.get(i);
            char firstChar = string.charAt(0);
            char lastChar = string.charAt(string.length() - 1);
            String stringWithoutFirstAndLastChars = string.substring(1, string.length() - 1);
            String resultString;


            // если строка - вторая, то вместо старой строки присваем новое значение с поменяными символами
            if (i % 2 == 0) {
                resultString = lastChar + stringWithoutFirstAndLastChars + firstChar;
                myArray.set(i, resultString);
            }

            // если строка не вторая, не делаем ничего (оставляем строку как и была)
            else {
            }
        }

        // с помощью цикла вывожу все строки списка
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }
    }

}