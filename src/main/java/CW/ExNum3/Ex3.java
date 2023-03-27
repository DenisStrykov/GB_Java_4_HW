package CW.ExNum3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {

        /*
        Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
         */


        List<Integer> integerList = new LinkedList<>(Arrays.asList(6, -3, 7, -5, -8, 9, -16, 10, -1, 0, 3));
        System.out.println("Начальный список: " + integerList);

        System.out.println("Список без отрицательных элементов: " + DeletingNegativeItems(integerList));

    }

    /**
     * Метод удаляет отрицательные элементы списка
     *
     * @param integerList : Вложенный список
     * @return : Возвращает список без отрицательных элементов типа List
     */
    private static List<Integer> DeletingNegativeItems(List<Integer> integerList) {

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) < 0) {
                integerList.remove(i);
                i--;
            }
        }
        return integerList;
    }

}
