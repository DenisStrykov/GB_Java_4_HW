package HW.ExNum2;

import java.util.Deque;
import java.util.LinkedList;

public class Ex2 {

    public static void main(String[] args) {

        /*
        Учитывая строку s, содержащую только символы '(', ')', '{', '}', '['и ']', определите, является ли входная строка допустимой.
        Строка ввода является допустимой, если:
        Открытые скобки должны быть закрыты скобками того же типа.
        Открытые скобки должны быть закрыты в правильном порядке.
        Каждой закрывающей скобке соответствует открывающая скобка того же типа.
         */

        String text1 = "())";
        String text2 = "()[]{}";
        String text3 = "(]";
        String text4 = "([)]";
        String text5 = "";
        String text6 = "([])";

        System.out.println("1 = " + parenthesisCheck(text1));
        System.out.println("2 = " + parenthesisCheck(text2));
        System.out.println("3 = " + parenthesisCheck(text3));
        System.out.println("4 = " + parenthesisCheck(text4));
        System.out.println("5 = " + parenthesisCheck(text5));
        System.out.println("6 = " + parenthesisCheck(text6));


    }

    /**
     * Метод проверяет, является ли строка допустимой по условиям задачи
     *
     * @param text : Вложенное сообщение типа String
     * @return : Возвращает буулевое значение true/false
     */
    private static boolean parenthesisCheck(String text) {

        Deque<Character> list = new LinkedList<>();
        for (Character symbol : text.toCharArray()) {
            if (symbol == '(') list.add(')');
            else if (symbol == '[') list.add(']');
            else if (symbol == '{') list.add('}');
            else if (list.isEmpty() || list.pop() != symbol) return false;
        }
        return true;

    }

}
