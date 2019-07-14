package by.mironenka.maintasktwo;

//Задан список целых чисел и некоторое число Y. Не используя вспомогательных объектов и методов сортировки
// и не изменяя размера списка, переставить элементы списка так, чтобы сначала шли числа,
// не превосходящие Y, а затем числа, больше Y.

import java.util.ArrayList;
import java.util.List;

public class Sorter {

    public Sorter() {
    }

    public static List<Integer> sortList(List<Integer> list) {

        for(int i = 1; i <list.size(); i++)

            for(int j = list.size() - 1; j >= i; j--){

                if (list.get(j-1) > list.get(j)){

                    list.set(j-1,list.get(j-1) + list.get(j));
                    list.set(j, list.get(j-1) - list.get(j));
                    list.set(j-1, list.get(j-1) - list.get(j));
                }
            }

        return list;
    }


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(100);
        list.add(9);
        list.add(25);
        list.add(4);
        list.add(33);
        list.add(67);
        list.add(2);
        list.add(0);

        System.out.println(Sorter.sortList(list));

    }
}
