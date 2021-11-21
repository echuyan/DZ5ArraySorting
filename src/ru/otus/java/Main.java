package ru.otus.java;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        System.out.println("Hello");
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

         for (int i = 0; i < 10000; i++) {
             arr1.add((int) (Math.random() * 100));
             arr2.add((int) (Math.random() * 100));
         }

            ArrayOfNumbers arrayOfNumbersForChoiceSort = new ArrayOfNumbers(arr1);
            ArrayOfNumbers arrayOfNumbersForBubbleSort = new ArrayOfNumbers(arr2);
            System.out.println("Тестируем сортировку выбором");
            System.out.println("Initial unsorted array:");
            arrayOfNumbersForChoiceSort.print();
            arrayOfNumbersForChoiceSort.choiceSort();

        System.out.println("\n");

            System.out.println("Тестируем сортировку пузырьком");
            System.out.println("Initial unsorted array:");
            arrayOfNumbersForBubbleSort.print();
            arrayOfNumbersForBubbleSort.bubbleSort();

        }


    }

