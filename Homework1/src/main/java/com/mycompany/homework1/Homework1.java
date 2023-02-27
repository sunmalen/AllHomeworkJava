/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.homework1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author malen
 */
public class Homework1 {

    public static void main(String[] args) {
        // 1.To Create a new arraylist and some colors string  and print out the colection .
        //array List 1
        System.out.println("Homework_01--Sun Malen--");
        System.out.println("1.To Create a new arraylist and some colors string  and print out the colection");
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Whirte");
        colors.add("Black");
        System.out.println(colors);
        System.out.println("2.get iterate through all elements in a array list.");
        // 2. get iterate through all elements in a array list.
         for (String element : colors) {
            System.out.println(element);
         }
         
         // 3. To compare two array lists
         //array List 2
         System.out.println("3.To compare two array lists");
         ArrayList<String> colors2 = new ArrayList<String>();
         colors2.add("Red");
         colors2.add("Green");
         colors2.add("Orange");
         colors2.add("Whirte");
         colors2.add("Black");
         
         //compare two array lists
         boolean  compare_color  = colors.equals(colors2);
         System.out.println(compare_color);
        LinkedList<String> LinkedList;
         
         //4.iterate through all elements in a linked list starting at the specified position
         System.out.println("4.iterate through all elements in a linked list");
         LinkedList<String> color_linkedList = new LinkedList<String>();
         color_linkedList.add("Red");
         color_linkedList.add("Green");
         color_linkedList.add("Orange");
         color_linkedList.add("Whirte");
         color_linkedList.add("Black");
         System.out.println(color_linkedList);
    
         Iterator c = color_linkedList.listIterator(2);
         while(c.hasNext()){
             System.out.println(c.next());
         }
       
    }
}
