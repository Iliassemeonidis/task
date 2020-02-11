package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int[] first = new int[]{1, 2, 3};
        int[] second = new int[]{2, 5, 3};
        ArrayList<Integer> listFirst = new ArrayList<>();
        ArrayList<Integer> listSecond = new ArrayList<>();
        for (int i = 0; i < first.length; i++) {
            int count = 0;
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    count++;
                }
            }
            if (count == 0) {
                listFirst.add(first[i]);
            }

        }
        System.out.println(listFirst);

        for (int i = 0; i < second.length; i++) {
            int count = 0;
            for (int j = 0; j < first.length; j++) {
                if (second[i] == first[j]) {
                    count++;
                }
            }
            if (count == 0) {
                listSecond.add(second[i]);
            }

        }

        System.out.println(listSecond);


    }
}

