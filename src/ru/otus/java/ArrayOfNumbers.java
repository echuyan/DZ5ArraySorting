package ru.otus.java;

import java.util.ArrayList;
import java.util.Date;

public class ArrayOfNumbers {

    private ArrayList<Integer> arr;


    public ArrayOfNumbers(ArrayList<Integer> arr) {
        this.arr=arr;
        }

    /**
     * sort by choice algorithm
     */
    public void choiceSort () {

        Date date1 = new Date();
        Long l1 = date1.getTime();
        int nMin=0;
        int min=0;
        int i=0;
        int j=0;

        for (i=0; i<arr.size()-1;i++){
            nMin=i;
            min=arr.get(i);
            for (j=i+1;j<arr.size();j++) {
                if (min>arr.get(j)) {min=arr.get(j);nMin=j;}
                }
            arr.set(nMin,arr.get(i));
            arr.set(i,min);
        }
        Date date2 = new Date();
        Long l2 = date2.getTime();
       System.out.println("Алгоритм сортировки выбором отработал за "+(l2-l1));
       print();
        }



    /**
     * Bubble sort
     */
    public  void bubbleSort () {
        Date date1 = new Date();
        Long l1 = date1.getTime();
        int k =0;
        int i=0;
        int temp=0;

        for (k=arr.size()-1; k>0;k--){

            for (i=0;i<k;i++) {
                if (arr.get(i)>arr.get(i+1)) {
                    temp=arr.get(i);
                    arr.set(i,arr.get(i+1));
                    arr.set(i+1,temp);
                }
            }
        }
        Date date2 = new Date();
        Long l2 = date2.getTime();
        System.out.println("Алгоритм сортировки пузырьком отработал за "+(l2-l1));
        print();
    }

    /**
     * print array
     */
    public void print() {
        System.out.println(arr);

        }
    }

