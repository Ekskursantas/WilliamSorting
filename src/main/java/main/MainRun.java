/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;

/**
 *
 * @author Zygi
 */
public class MainRun {
    public static void main(String[] args) throws IOException {
        SorthingAlgorithms sorter = new SorthingAlgorithms();
        String str = "";
//        file location here
        String[] array = sorter.readFromFile("C:\\Users\\Zygi\\Desktop\\textFull.txt");
//        ----------------------------------------------Selection sort ---------------------------------------------------------

        String[] selectionSortText = sorter.selectionSort(array);
        for (int i = 0; i < selectionSortText.length; i++) {            
            if(!selectionSortText[i].equals(""))
            str = str + selectionSortText[i] + " ";
        }
        System.out.println(str);
        str = "";
        System.out.println("----------------------------------------------------------------------------");
//        --------------------------------------------------------------------------------------------------------------------------------------
//        ----------------------------------------------Insertion sort ---------------------------------------------------------
        String[] insertionSortText = sorter.insertionSort(array);
        for (int i = 0; i < insertionSortText.length; i++) {
            if(!insertionSortText[i].equals(""))
            str = str + insertionSortText[i] + " ";
        }
        System.out.println(str);
        str = "";
        System.out.println("----------------------------------------------------------------------------");
//        --------------------------------------------------------------------------------------------------------------------------------------
// Didn't finish the merge sort! Dind't have enough content on it.
    }
}
