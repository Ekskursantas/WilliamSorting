/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Zygi
 */
public class SorthingAlgorithms {

    private String[] textArray;
    private String text = "";

    SorthingAlgorithms() {
//        int[] numbersOne = new int[100];
//        int[] test = {8,5,10,7,8,3,4,5};
//        int[] numbersTwo = new int[1000];
//        int[] numbersThree = new int[10000];

    }

    public String[] insertionSort(String[] array) {
        long start = System.nanoTime();
         int n = array.length;
        for (int j = 1; j < n; j++) {
            String key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i].compareTo(key) > 0 ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        long end = System.nanoTime();
        long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in Insertion Sort: " + timeInMillis + "ms");

        return array;
    }
    public String[] insertionSortv2(String[] array) {
        String[] sortedArray = new String[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if (sortedArray[i].compareTo(array[i]) > 0) {
                int j = i;
                while (true) {

                    if (sortedArray[i].compareTo(array[i]) > 0) {
                        sortedArray[j + 1] = sortedArray[j];

                    } else {
                        sortedArray[j + 1] = array[i];
                        break;
                    }
                    j--;
                }

            } else {

                sortedArray[i + 1] = array[i];
            }
        }
        return sortedArray;
    }

    public String[] selectionSort(String[] text) {
        long start = System.nanoTime();

        String temp;
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text.length; j++) {
                if (text[i].compareTo(text[j]) < 0) {
                    temp = text[i];
                    text[i] = text[j];
                    text[j] = temp;
                }
            }
        }
        long end = System.nanoTime();
        long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in Selection Sort: " + timeInMillis + "ms");

        return textArray;
    }

    public String[] readFromFile(String filePath) throws IOException {
        FileReader readFile = new FileReader(filePath);
        BufferedReader bf = new BufferedReader(readFile);

        int lineCount = countLines(filePath);
        textArray = new String[lineCount];

        for (int i = 0; i < lineCount; i++) {
            text = text + bf.readLine() + " ";
        }
        bf.close();
        textArray = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
        return textArray;
    }

    public int countLines(String filePath) throws IOException {
        FileReader readFile = new FileReader(filePath);
        BufferedReader bf = new BufferedReader(readFile);

        String line;
        int lineCount = 0;

        while ((line = bf.readLine()) != null) {
            lineCount++;
        }
        bf.close();
        return lineCount;
    }
}
