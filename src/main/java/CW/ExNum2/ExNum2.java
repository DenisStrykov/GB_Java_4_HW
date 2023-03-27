package CW.ExNum2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExNum2 {

    public static void main(String[] args) {

        /*
        Заменить некратные 3 элементы списка, суммой нечетных элементов.
         */


        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(integerList);

        int sumOddElements = FindSumOddElements(integerList);
        System.out.println("Суммы нечетных элементов списка: " + sumOddElements);

        Replacements(integerList, sumOddElements);


    }

    /**
     * Метод ищет сумму нечетных элементов списка
     *
     * @param integerList : Вложенный список элементов
     * @return : Возвращает сумму нечетных элементов списка типа int
     */
    private static int FindSumOddElements(List<Integer> integerList) {

        int sum = 0;
        for (Integer element : integerList) {
            if (element % 2 != 0) {
                sum += element;
            }
        }
        return sum;
    }

    /**
     * Метод заменяет некратные 3 элементы списка на сумму нечетных элементов и печатает список
     *
     * @param integerList : Вложенный список
     * @param sumOddElements : Сумма нечетных элементов списка
     */
    private static void Replacements(List<Integer> integerList, int sumOddElements) {

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 3 != 0) {
                integerList.set(i, sumOddElements);
            }
        }
        System.out.println(integerList);
    }

}
