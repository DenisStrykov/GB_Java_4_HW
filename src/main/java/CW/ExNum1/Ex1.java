package CW.ExNum1;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {

        /*
        Построить однонаправленный список целых чисел.
        Найти сумму четных элементов списка
         */


        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(integerList);

        int sum = FindTheEvenElements(integerList);
        System.out.println("Сумма четных элементов списка: " + sum);

    }

    /**
     * Метод находит сумму четных элементов списка и печатает сами четные элементы
     *
     * @param integerList : Вложенный список
     * @return : Возвращает сумму четных элементов типа int
     */
    private static int FindTheEvenElements(List<Integer> integerList) {

        int count = 1;
        int sum = 0;
        for (Integer element : integerList) {
            if (element % 2 == 0) {
                System.out.println(count + " четный элемент: " + element);
                sum += element;
                count++;
            }
        }
        return sum;
    }

}
