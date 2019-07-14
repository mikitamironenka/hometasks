package by.mironenka.maintaskone;

//В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета по кругу вычеркивается каждый второй человек,
// пока не останется один. Составить две программы,  моделирующие процесс. Одна из программ должна использовать
// класс ArrayList, а вторая — LinkedList. Какая из двух программ работает быстрее? Почему?

import by.mironenka.maintaskone.model.Human;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    private static int numberOfHumans = 100;

    public static void main(String[] args) {

        List<Human> humanArrayList = new ArrayList<Human>();
        List<Human> humanLinkedList = new ArrayList<Human>();

        addHumansToLists(humanArrayList, humanLinkedList, numberOfHumans);

        Long startTime = System.nanoTime();
        Long endTime;
        ArrayAndLinkedListChecker.checkListOfHumans(humanArrayList);
        endTime = System.nanoTime();
        System.out.println(String.format("%,d ns", endTime - startTime));


        startTime = System.nanoTime();
        ArrayAndLinkedListChecker.checkListOfHumans(humanLinkedList);
        endTime = System.nanoTime();
        System.out.println(String.format("%,d ns", endTime - startTime));

    }


    private static void addHumansToLists(List<Human> listOne, List<Human> listTwo, int numberOfHumans){

        for(int i = 0; i < numberOfHumans; i++) {
            Human human = new Human();
            listOne.add(human);
            listTwo.add(human);
        }
    }

}
