package CW.ExNum4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Ex4 {

    public static void main(String[] args) {

            /*
            Ввод: путь = "/home/"
            Вывод: "/home"
            Ввод: path = "/../"
            Вывод: "/"
            Ввод: путь = "/home//foo/"
            Вывод: "/home/foo"
             */

        String text1 = "/home/";
        String text2 = "/../";
        String text3 = "/home//foo/";

        System.out.println("1: " + text1);
        System.out.println("2: " + text2);
        System.out.println("3: " + text3);

        System.out.println("");

        System.out.println("1: " + simplifyPath(text1));
        System.out.println("2: " + simplifyPath(text2));
        System.out.println("3: " + simplifyPath(text3));

    }

    private static String simplifyPath(String path) {

        Deque<String> stringDeque = new LinkedList<>();
        String[] array = path.split("/");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("") || array[i].equals(".")) {
                continue;
            } else if (array[i].equals("..")) {
                if (!stringDeque.isEmpty()) {
                    stringDeque.pop();
                }
            } else {
                stringDeque.add(array[i]);
            }
        }
        return "/" + String.join("/", stringDeque);
    }

}
