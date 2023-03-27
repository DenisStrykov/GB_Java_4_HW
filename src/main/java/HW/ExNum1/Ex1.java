package HW.ExNum1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {


        /*
        Вывести список на экран в перевернутом виде (без массивов и ArrayList)
        Пример:
        1 -> 2->3->4
        Вывод:
        4->3->2->1
         */


        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Исходный список : " + integerList);

        System.out.println("Перевернутый список : " + reversList(integerList));


    }

    /**
     * Метод переворачивает вложенный список в обратном порядке
     *
     * @param integerList : Вложенный список
     * @return : Возвращает перевернутый список типа List
     */
    private static List<Integer> reversList(List<Integer> integerList) {

        List<Integer> reversList = new LinkedList<>();
        for (int i = integerList.size() - 1; i >= 0; i--) {
            reversList.add(integerList.get(i));
        }
        return reversList;
    }

}
